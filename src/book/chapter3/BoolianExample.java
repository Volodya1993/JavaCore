package book.chapter3;

public class BoolianExample {
    public static void main(String[] args) {
        boolean b;
        b = true;
        {
            System.out.println("b = equals " + b);
            b = false;
            {
                System.out.println("b = equals " + b);
                {
                    System.out.println((100 > 1));
                }
            }
        }
    }
}
