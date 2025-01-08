import java.io.IOException;

public class App {

    // ANSI color codes
    public static final String RESET = "\033[0m";  // Reset to default
    public static final String RED = "\033[0;31m";
    public static final String GREEN = "\033[0;32m";
    public static final String YELLOW = "\033[0;33m";
    public static final String BLUE = "\033[0;34m";

    private static void printUsage() {
        System.out.println(GREEN + "This program encodes and decodes files using Huffman coding." + RESET);
        System.out.println(YELLOW + "Usage:\n" + "java App.java -c/-d " + BLUE + "{inputFile}\n\toutputFile name = " + RED + "{inputFile}" + BLUE + " + " + RESET + YELLOW + "{_encoded.bin}" + BLUE + " / " + YELLOW + "{_decoded.txt} " + RESET);
        System.out.println("-m for more information" + RESET);

    }

    private static void handleEncodingDecoding(HuffmanCoding huffman, String[] args) {
        try {
            if (args[0].equals("-c") && args.length == 2) {
                String outputFile = huffman.encode(args[1]);
                System.out.println(GREEN + "File " + YELLOW + args[1] + GREEN + " encoded successfully into:" + RESET);
                System.out.println(YELLOW + outputFile + RESET);
            } else if (args[0].equals("-d") && args.length == 2) {
                String outputFile = huffman.decode(args[1]);
                System.out.println(GREEN + "File " + YELLOW + args[1] + GREEN + " decoded successfully into:" + RESET);
                System.out.println(YELLOW + outputFile + RESET);

            } else {
                System.out.println(RED + "Invalid option." + RESET + BLUE + " Use -m for more information." + RESET);
            }
        } catch (IOException e) {
            System.err.println(RED + "Error: " + e.getMessage() + RESET);
        }
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            printUsage();
            return;
        }

        HuffmanCoding huffman = new HuffmanCoding();

        switch (args[0]) {
            case "-m":
                printUsage();
                break;


            case "-c":
            case "-d":
                // выполнить кодирование/декодирование
                handleEncodingDecoding(huffman, args);
                break;

            default:
                System.out.println(RED + "Invalid option. Use -m for more information." + RESET);
                break;
        }
    }
}
