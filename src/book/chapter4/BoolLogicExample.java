package book.chapter4;

public class BoolLogicExample {
    public static void main(String[] args) {
        boolean a = true, b = false;
        boolean c = a | b;
        boolean d = a & b;
        boolean e = a ^ b;
        boolean f = (!a & b) | (a & !b);
        boolean g = !a;
        System.out.println("            a =" + a);
        System.out.println("            b =" + b);
        System.out.println("           a|b=" + c);
        System.out.println("           a&b=" + d);
        System.out.println("           a^b=" + e);
        System.out.println(" (!a&b)|(a&!B)=" + f);
        System.out.println("             !a" + g);

        System.out.println();
        System.out.println();
        int x,y,z;
        x=y=z=100;
        System.out.println(+x);
    }
}
