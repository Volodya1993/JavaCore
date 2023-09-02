package chapter4;

public class IfExample {
    public static void main(String[] args) {
        int[] sona = {2, 3, 5, 6,5};
        int max = sona[0];
        for (int i = 1; i < sona.length; i++) {
            if (sona[i] > max) {
                max = sona[i];

            }


        }
        System.out.println(max);
        System.out.println();
        System.out.println();
        for (int i = 1; i <= 10; i++) {
            System.out.print(-i);
            System.out.println();
            for (int j = 0; j <= 100; j++) {
                if (j % 2== 0){
                    System.out.println(j);
                }


            } {

            }


        }
    }
}