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

        System.out.println("Huffman Codes: " + huffmanCodes); // Debugging

        // Encode content
        StringBuilder encoded = new StringBuilder();
        for (char c : content.toCharArray()) {
            encoded.append(huffmanCodes.get(c));
        }

        System.out.println("Encoded String: " + encoded); // Debugging

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
            Map<String, Character> reverseCodes = new HashMap<>();
            for (int i = 0; i < dictSize; i++) {
                char ch = dis.readChar();
                String code = dis.readUTF();
                reverseCodes.put(code, ch);
            }

            System.out.println("Reverse Codes: " + reverseCodes); // Debugging

            String encoded = dis.readUTF();

            System.out.println("Encoded from file: " + encoded); // Debugging

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

            System.out.println("Decoded String: " + decoded); // Debugging

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