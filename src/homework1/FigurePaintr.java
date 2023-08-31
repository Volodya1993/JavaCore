package homework1;

public class FigurePaintr {
    public static void main(String[] args) {
        // 1 nkar
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < i; j++)
                System.out.print("*");
            {

            }
            System.out.println();

        }
        //nkar 2
        for (int i = 5; i > 0; i--) {
            for (int j = 0; j < i; j++)
                System.out.print("*");
            {

            }
            System.out.println();

        }
        //nkar3/5 "*"
        for (int i = 5; i > 0; i--) {
            for (int j = 1; j <= i; j++)
                System.out.print(" ");
            {
                for (int j = 5; j >= i; j--)
                    System.out.print("* ");


            }
            System.out.println();
        }
//nkar 4/5 "*"
        for (int i = 4; i > 0; i--) {
            for (int j = 4; j >= i; j--)
                System.out.print(" ");
            {
                for (int j = 1; j <= i; j++)
                    System.out.print(" *");
                {

                }
                System.out.println();
            }

        }
    }

}

