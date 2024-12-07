import java.io.IOException;

public class App {
    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Usage: java App.java -c|-d inputFile outputFile");
            return;
        }

        HuffmanCoding huffman = new HuffmanCoding();
        try {
            if (args[0].equals("-c")) {
                huffman.encode(args[1], args[2]);
                System.out.println("File encoded successfully.");
            } else if (args[0].equals("-d")) {
                huffman.decode(args[1], args[2]);
                System.out.println("File decoded successfully.");
            } else {
                System.out.println("Invalid option. Use -c to encode or -d to decode.");
            }
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}