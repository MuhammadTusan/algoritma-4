public class Case6 {
    public static void main(String[] args) {
        int a = 0, b = 0;

        System.out.print(a + " " + b + " ");
        for (int i = 1; i <= 8; i++) {
            int c = a + b + i - 1;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
}