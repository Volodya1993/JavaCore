package chapter5;

public class SampleSwitchExample {
    public static void main(String[] args) {
        for (int i = 1; i < 6; i++)
        switch (i){
            case 0:
                System.out.println("i = 0");
                break;
            case 1:
                System.out.println("i = 1");
                break;
            case 2:
                System.out.println("i = 2");
                break;
            case 3:
                System.out.println("i = 3");
            default:
                System.out.println("i > 3");

        }
    }
}
