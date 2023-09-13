package book.chapter5;

public class ForEachExample {
    public static void main(String[] args) {
        int nums[] = {7, 3, 8, 4, 9, 6,};
        int sum = 0;
        for (int x : nums) {
            System.out.println("значение равно :" + x);
            sum += x;
        }
        System.out.println("сумма равно " + sum);
    }
}
