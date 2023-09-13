package book.chapter5;

import java.util.Scanner;

public class MyScanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("здраствуйте");
        System.out.println("Подскажите как вас зовут ?");
        String str = scan.nextLine();
        System.out.println(str + " спасибо за ответ");
        System.out.println(str + " сколmко вам лет ?");
        int age = scan.nextInt();
        if (age <= 18) {
            System.out.println(" к сожалению ваш возрост не подходит ");
        }else{
            System.out.println("добро пожаловать");
        }
    }
}
