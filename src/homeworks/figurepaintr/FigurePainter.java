package homeworks.figurepaintr;

public class FigurePainter {
    void figureOne(int n, char c) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < i; j++)
                System.out.print(c + " ");
            {

            }
            System.out.println();
        }
    }

    void figureTwu(int b, char c) {
        for (int i = b; i > 0; i--) {
            for (int j = 0; j < i; j++)
                System.out.print(c + " ");
            {

            }
            System.out.println();
        }
    }

    void figureThree( int d,int k,char c) {
        for (int i = d; i > 0; i--) {
            for (int j = 0; j < i-1 ; j++)
                System.out.print("  ");
            {
                for (int j =k; j>=i ; j--)
                    System.out.print('*'+" ");


            }
            System.out.println();
        }

    }

    void figurefour(int x, int d, char c) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < i; j++)
                System.out.print("  ");
            {
                for (int j = d; j > i; j--)
                    System.out.print(c + " ");
                {

                }
                System.out.println();
            }

        }
    }

    void figurefive( int b,char d) {
        for (int i = 0; i < b; i++) {
            for (int j = b; j > i; j--) {
                System.out.print(" ");

            }
            for (int j = 0; j <= i; j++) {
                System.out.print(d +" ");

            }
            System.out.println();

        }
        for (int i = 0; i < b; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");

            }
            for (int j = b; j > i; j--) {
                System.out.print("* ");

            }
            System.out.println();

        }
    }
}


