Certainly! Here is the full text for the README.md file:

# Huffman Coding in Java

This program encodes and decodes files using the Huffman coding algorithm. It allows you to compress and decompress text
files by creating efficient variable-length codes based on character frequencies.

## Features

- **File Encoding**: Compress a file using Huffman coding.
- **File Decoding**: Decompress a file that has been encoded with Huffman coding.
- **Command-Line Arguments**: Control the program via command-line arguments.
- **Color-Coded Console Output**: Uses colors for better readability and debugging.

## Usage

### Command-Line Arguments

- **`-m`**: Display information about the program and how to use it.
- **`-c`**: Encode a file using Huffman coding.
- **`-d`**: Decode a file that was encoded using Huffman coding.

### Syntax

``` shell
java App.java -c/-d {inputFile} {outputFile}
```

Where:

- **`-c`**: For encoding a file.
- **`-d`**: For decoding a file.
- **`{inputFile}`**: The input file to encode or decode.
- **`{outputFile}`**: The output file for the encoded or decoded result.

### Example Usage

#### Encoding a File:

To encode a file called `input.txt` and output the encoded file as `encoded.txt`:

```shell
java App.java -c input.txt encoded.txt
```

#### Decoding a File:

To decode an encoded file `encoded.txt` and output the result as `decoded.txt`:

```shell
java App.java -d encoded.txt decoded.txt
```

#### Displaying Program Information:

To display information about the program:

```shell
java App.java -m
```

## Color-Coded Output

The program outputs color-coded messages for better clarity:

- **Green**: Success messages (e.g., encoding/decoding completed).
- **Blue**: Informational messages (e.g., file names).
- **Yellow**: Highlighted file paths.
- **Red**: Error messages.

For example:

- **Green** indicates successful encoding/decoding.
- **Blue** is used to show the file names.
- **Red** is used for error messages.

## Requirements

- **Java 8+**: Ensure that you have Java installed (JDK 8 or higher).
- **zsh**: The program execution code is written in `zsh`.
