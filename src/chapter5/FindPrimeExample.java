package chapter5;

public class FindPrimeExample {
    public static void main(String[] args) {
        int num;
        boolean isPrime;
        num = 6;
        if (num < 2) isPrime = false;
        else isPrime = true;
        for (int i = 2; i < num / 2; i++) {
            if ((num % i) == 0) {
                isPrime = false;
                break;
            }

        }
        if (isPrime) System.out.println("простое число");
        else System.out.println(" не простое число ");
    }
}
