import java.io.*;
import java.nio.file.Files;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class HuffmanCoding {// Класс для кодирования и декодирования по алгоритму Хаффмана

    static class Node implements Comparable<Node> {// Узел дерева
        char ch;// символ
        int freq;// частота
        Node left, right;// левый и правый узлы

        Node(char ch, int freq, Node left, Node right) { // Конструктор узла
            this.ch = ch;
            this.freq = freq;
            this.left = left;
            this.right = right;
        }

        public int compareTo(Node other) {
            return this.freq - other.freq;
        } // Сравнение узлов по частоте
    }

    public String encode(String inputFile) throws IOException {
        /// Метод для кодирования входного файла///
        // Считываем содержимое
        String content = new String(Files.readAllBytes(new File(inputFile).toPath()));// Считываем содержимое

        String outputFile = inputFile.substring(0, inputFile.lastIndexOf('.')) + "_encoded.bin";
        // Формируем имя выходного файла
        // Считаем частоту символов
        Map<Character, Integer> freqMap = new HashMap<>(); // ключ - символ, значение - частота
        for (char c : content.toCharArray()) {// Считаем частоту символов
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }


        // Строим дерево Хаффмана
        PriorityQueue<Node> pq = new PriorityQueue<>();// Приоритетная очередь
        for (var entry : freqMap.entrySet()) {
            pq.add(new Node(entry.getKey(), entry.getValue(), null, null));
            // добавляем в приоритетную очередь символ и его частоту
        }

        while (pq.size() > 1) { // пока очередь не пуста и не содержит один символ
            Node left = pq.poll();// извлекаем два символа с наименьшими частотами
            Node right = pq.poll();
            pq.add(new Node('\0', left.freq + right.freq, left, right));
            // добавляем в очередь новый узел с суммой частот двух узлов
        }

        Node root = pq.poll(); // извлекаем корень дерева Хаффмана

        // Строим словарь символов и их кодов
        Map<Character, String> huffmanCodes = new HashMap<>();
        buildCodes(root, "", huffmanCodes);// строим словарь символов и их кодов с помощью рекурсивного метода

        // кодируем содержимое
        StringBuilder encoded = new StringBuilder();
        for (char c : content.toCharArray()) {// кодируем содержимое
            encoded.append(huffmanCodes.get(c));// добавляем в закодированную строку код символа
        }

        // упаковка в байты
        byte[] packedBytes = toBytes(encoded.toString());
        // преобразуем закодированную строку в байты с помощью функции toBytes

        // запись в файл
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(outputFile))) { // создаем поток вывода
            // записываем словарь символов и их коды
            dos.writeInt(huffmanCodes.size());// записываем размер словаря
            for (var entry : huffmanCodes.entrySet()) {// записываем символы и их коды
                dos.writeChar(entry.getKey());
                dos.writeUTF(entry.getValue());
            }

            // записываем дерево Хаффмана в бинарный файл
            dos.writeInt(encoded.length());  // записываем длину закодированной строки
            dos.write(packedBytes);         // записываем байты в файл
        }

        return outputFile;// возвращаем имя закодированного файла
    }

//    Структура бинарного файла пример для {abcab}
//   Словар:  a: 2, b: 2, c: 1
//Дерево Хаффмана:
//            (*,5)
//            /     \
//       (*,2)      b(2)
//      /   \
//    a(1)  c(1)

//Коды символов:
//    a -> 00, b -> 1, c -> 01

//    Закодированная строка:
//    a b c a b -> 00 1 01 00 1 -> 00101001

//    Упаковка в байты:
//    00101001 -> [41] (в 16-ричном виде)

//    Файл будет содержать:
//    | Часть	                   | Значение	                | Размер       |
//    | Размер словаря             | 3 (3 символа: a, b, c) 	| 4 байта      |
//    | Символы и их коды          |	                        | Переменная   |
//    |- Символ a                  |	Код: 00                 | 2 байта + код|
//    |- Символ b                  |	Код: 1                  | 2 байта + код|
//    |- Символ c                  |	Код: 01                 | 2 байта + код|
//    | Длина закодированной строки|	8 (8 бит)               | 4 байта      |
//    | Закодированные данные      |	00101001 -> [41]        | 1 байт       |

//    Итоговая структура файла:
//            [Размер словаря | Символы и их коды | Длина строки | Упакованные данные]
//            [      4 байта  |  Переменная длина |     4 байта  |    Переменная длина ]


//        03 00 00 00  // Размер словаря (3 символа)
//        61 00 00     // Символ 'a', код "00"
//        62 00 01     // Символ 'b', код "1"
//        63 00 01     // Символ 'c', код "01"
//        08 00 00 00  // Длина закодированной строки (8 бит)
//        41           // Закодированные данные (1 байт)

    // Преобразует строку битов в массив байт
    private byte[] toBytes(String bits) {
        int byteLength = (bits.length() + 7) / 8;  // округление в большую сторону до байта
        byte[] bytes = new byte[byteLength];// создаем массив байт

        for (int i = 0; i < bits.length(); i++) {// перебираем биты
            int byteIndex = i / 8;// индекс байта
            int bitIndex = 7 - (i % 8);// индекс бита
            if (bits.charAt(i) == '1') {// если бит равен 1
                bytes[byteIndex] |= (1 << bitIndex);// устанавливаем бит в 1
            }
        }
        return bytes;// возвращаем массив байтов
    }

    public String decode(String inputFile) throws IOException {// декодирование файла
        String outputFile = inputFile.substring(0, inputFile.lastIndexOf('.')) + "_decoded.txt";
        // Формируем имя выходного файла
        try (DataInputStream dis = new DataInputStream(new FileInputStream(inputFile))) {// открываем входной поток
            int dictSize = dis.readInt();// считываем размер словаря
            // считываем словарь и коды символов
            Map<String, Character> reverseCodes = new HashMap<>();// создаем словарь
            for (int i = 0; i < dictSize; i++) {// перебираем словарь и коды
                char ch = dis.readChar();// считываем символ
                String code = dis.readUTF();// считываем код
                reverseCodes.put(code, ch);// добавляем символ и код в словарь
            }

            int numBits = dis.readInt();// считываем длину закодированной строки

            byte[] packedBytes = dis.readAllBytes();// считываем закодированные данные

            String encoded = toBinaryString(packedBytes, numBits); // преобразуем байты в бинарную строку

            StringBuilder decoded = new StringBuilder(); // создаем StringBuilder для декодированной строки
            String temp = "";// временная строка
            for (char bit : encoded.toCharArray()) {// перебираем биты в закодированной строке
                temp += bit;// добавляем бит в временную строку
                if (reverseCodes.containsKey(temp)) {// если временная строка есть в словаре
                    decoded.append(reverseCodes.get(temp));// добавляем символ в декодированную строку
                    temp = "";// обнуляем временную строку
                }
            }

            Files.write(new File(outputFile).toPath(), decoded.toString().getBytes());
            // записываем декодированную строку в фаиьл
        }

        return outputFile;
    }

    // функция преобразует байты в бинарную строку
    private String toBinaryString(byte[] bytes, int numBits) {
        StringBuilder bits = new StringBuilder();// бинарная строка

        for (int i = 0; i < bytes.length; i++) {// перебираем байты
            for (int j = 7; j >= 0; j--) {// перебираем биты в байте
                if (bits.length() < numBits) {// если длина бинарной строки меньше длины закодированной строки
                    bits.append((bytes[i] >> j) & 1); // добавляем бит в бинарную строку
                }
            }
        }
        return bits.toString();// возвращаем бинарную строку
    }

    // функция строит словарь
    private void buildCodes(Node node, String code, Map<Character, String> huffmanCodes) {
        // рекурсивный метод для строения словаря
        if (node == null) return;// если узел пустой, возвращаем

        if (node.left == null && node.right == null) {// если узел является листом (символом), добавляем его в словарь
            huffmanCodes.put(node.ch, code);// добавляем символ в словарь
        }
        buildCodes(node.left, code + "0", huffmanCodes);// рекурсивно строим словарь
        buildCodes(node.right, code + "1", huffmanCodes);// рекурсивно строим словарь
    }
}