package classwork.chapter2;public class IfSample {
    public static void main(String[] args) {
        int x, y;
        x = 100;
        y = 200;
        if (x < y){
            System.out.println("x is less than y");
            x = x * 2;
            if (x == y){
                System.out.println("x is now equal to y");
                x = x * 2;
                if (x > y){
                    System.out.println("x is now greater than y");
                }
            }
        }
    }
}

