package book.chapter3;

public class Conversion {
    public static void main(String[] args) {
        byte b;
        int i = 257;
        double d = 323.123;{
            System.out.println(b = (byte) i);{
                System.out.println("i and b " +i+" " +b);{
                    System.out.println(i = (int) d);{
                        System.out.println("d and i " +d+" " +i);{
                            System.out.println(d = (byte) b);
                        }
                    }
                }
            }


        }
    }
}
