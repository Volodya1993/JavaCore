package book.chapter4;

public class ModulusExample {
    public static void main(String[] args) {
        int x = 42;
        double y = 42.25;
        System.out.println(x % 10);

        x %= 2;
        System.out.println(x);
    }
}
