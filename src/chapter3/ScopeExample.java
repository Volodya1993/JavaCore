package chapter3;

public class ScopeExample {
    public static void main(String[] args) {
        int x;
        x = 10;
        if (x==10);{
            int y = 20;
            System.out.println("x and y: " + x + " " +y);
        }
    }
}
