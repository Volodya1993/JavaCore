package homeworks;

public class ForExamples {
    public static void main(String[] args) {
        for (int i = 0; i <= 1000; i++) {
            System.out.print(-i);

        }
        System.out.println();
        System.out.println();
        for (int j = 0; j <= 100; j++) {
            if (j % 2 == 0) {
                System.out.print(j + " ");
            }

        }
        System.out.println("\n");
        int[] arey = {5, 8, 4, 9, 3, 7};
        int max = arey[0];
        for (int i = 1; i < arey.length; i++) {
            if (arey[i] > max) {
                max = arey[i];
            }

        }
        System.out.println(max);

        int[] numbers = {6, 3, 9, 15, 52, -3, 5, 8};
        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }

        }
        System.out.println(min);
    }

}

