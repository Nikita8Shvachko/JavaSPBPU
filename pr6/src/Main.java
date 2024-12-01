public class Main {
    public static void main(String[] args) {
        int a = 1;
        {
            int i = 0;
            if (a == 1) {
                i = 1;
            } else if (a == 2) {
                i = 2;
            } else {
                i = 3;
            }
        }

        int i = (a == 1) ? 1 : (a == 2) ? 2 : 3;

        System.out.println("Hello, World!");
    }
}