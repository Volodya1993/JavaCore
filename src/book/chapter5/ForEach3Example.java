package book.chapter5;

public class ForEach3Example {
    public static void main(String[] args) {
        int num = 0;
        int sum[][] = new int[3][5];
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 5; j++)
                sum[i][j] = (i + 1) * (j + 1);
        for (int x[] : sum) {
            for (int y : x) {
                System.out.println("значение равно" + y);
                num +=y;

            }

        }
        System.out.println("сумма :" + num);
    }
}
