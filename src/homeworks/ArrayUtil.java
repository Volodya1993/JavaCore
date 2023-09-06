package homeworks;

public class ArrayUtil {
    public static void main(String[] args) {
        //xntir 1
        int[] numbers = {1, 6, 3, 9, 15, 52, -3, 5, 8,};
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println("\n");
        //xntir 2
        System.out.println(numbers[0]);
        System.out.println("\n");
        //xntir 3
        System.out.println(numbers.length - 1);
        System.out.println("\n");
        //xntir 4
        System.out.println(numbers.length);
        System.out.println("\n");
        //xntir 5
        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }

        }
        System.out.println(min);
        System.out.println("\n");
        //xntir 6
        int y = 0;
        y = numbers[numbers.length / 2];
        if (y > 2)
            System.out.println(y);
        System.out.println();
        int a = 2;
        if (a >= y)
            System.out.println(" can't print middle values");
        System.out.println();
        //xntir 7
        int k = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (i % 2 == 0) {
                k++;
            }
        }
        System.out.print(k);
        System.out.println("\n");
        //xntir 8
        int b = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (i % 2 == 1) {
                b++;
            }

        }
        System.out.print(b);
        System.out.println("\n");
        //xntir 9
        int j = 0;
        for (int i = 0; i < numbers.length; i++) {
            j += numbers[i];

        }
        System.out.println(j);
        System.out.println();
        //xntir 10
        double n = 0;
        for (int i = 0; i < numbers.length; i++) {
            n += numbers[i];

        }
        System.out.println(n / numbers.length);
    }
}




