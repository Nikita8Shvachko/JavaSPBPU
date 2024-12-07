import java.io.*;
import java.nio.file.Files;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class HuffmanCoding {
    static class Node implements Comparable<Node> {
        char ch;
        int freq;
        Node left, right;

        Node(char ch, int freq, Node left, Node right) {
            this.ch = ch;
            this.freq = freq;
            this.left = left;
            this.right = right;
        }

        public int compareTo(Node other) {
            return this.freq - other.freq;
        }
    }

    public void encode(String inputFile, String outputFile) throws IOException {
        // Read input file
        String content = new String(Files.readAllBytes(new File(inputFile).toPath()));

        // Count character frequencies
        Map<Character, Integer> freqMap = new HashMap<>();
        for (char c : content.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }
        //System.console().printf("Frequencies: %s\n", freqMap); // Debugging
        if (freqMap.size() == 1) {
            try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(outputFile))) {
                // Write the single character as its code
                dos.writeInt(1); // Only one symbol in the dictionary
                dos.writeChar(freqMap.keySet().iterator().next()); // The single character
                dos.writeUTF(""); // The Huffman code for it is an empty string
                dos.writeUTF(content); // Write the content as-is since it's just one character repeated
            }
            return; // Exit the method early
        }


        // Build the Huffman tree
        PriorityQueue<Node> pq = new PriorityQueue<>();
        for (var entry : freqMap.entrySet()) {
            pq.add(new Node(entry.getKey(), entry.getValue(), null, null));
        }

        while (pq.size() > 1) {
            Node left = pq.poll();
            Node right = pq.poll();
            pq.add(new Node('\0', left.freq + right.freq, left, right));
        }

        Node root = pq.poll();
        Map<Character, String> huffmanCodes = new HashMap<>();
        buildCodes(root, "", huffmanCodes);

        //System.console().printf("Huffman Codes: %s\n", huffmanCodes); // Debugging

        // Encode content
        StringBuilder encoded = new StringBuilder();
        for (char c : content.toCharArray()) {
            encoded.append(huffmanCodes.get(c));
        }

        //System.console().printf("Encoded String: %s\n", encoded); // Debugging

        // Write to output file
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(outputFile))) {
            dos.writeInt(huffmanCodes.size());
            for (var entry : huffmanCodes.entrySet()) {
                dos.writeChar(entry.getKey());
                dos.writeUTF(entry.getValue());
            }
            dos.writeUTF(encoded.toString());
        }
    }

    public void decode(String inputFile, String outputFile) throws IOException {
        try (DataInputStream dis = new DataInputStream(new FileInputStream(inputFile))) {
            int dictSize = dis.readInt();
            // Special case: if there is only one unique character
            if (dictSize == 1) {
                char singleChar = dis.readChar();  // Read the single character
                dis.readUTF();  // Read the empty Huffman code
                String content = dis.readUTF();  // Read the content as-is (since it's one character repeated)

                // Write decoded content to output file
                Files.write(new File(outputFile).toPath(), content.getBytes());
                return;  // Exit early as we don't need to decode further
            }
            Map<String, Character> reverseCodes = new HashMap<>();
            for (int i = 0; i < dictSize; i++) {
                char ch = dis.readChar();
                String code = dis.readUTF();
                reverseCodes.put(code, ch);
            }

            //System.console().printf("Reverse Codes: %s\n", reverseCodes); // Debugging

            String encoded = dis.readUTF();

            //System.console().printf("Encoded from file: %s\n", encoded); // Debugging

            // Decode content
            StringBuilder decoded = new StringBuilder();
            String temp = "";
            for (char bit : encoded.toCharArray()) {
                temp += bit;
                if (reverseCodes.containsKey(temp)) {
                    decoded.append(reverseCodes.get(temp));
                    temp = "";
                }
            }

            //System.console().printf("Decoded String: ,%s\n", decoded); // Debugging

            // Write decoded content to output file
            Files.write(new File(outputFile).toPath(), decoded.toString().getBytes());
        }
    }

    private void buildCodes(Node node, String code, Map<Character, String> huffmanCodes) {
        if (node == null) return;

        if (node.left == null && node.right == null) {
            huffmanCodes.put(node.ch, code);
        }
        buildCodes(node.left, code + "0", huffmanCodes);
        buildCodes(node.right, code + "1", huffmanCodes);
    }
}