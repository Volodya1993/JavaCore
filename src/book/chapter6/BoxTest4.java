package book.chapter6;

public class BoxTest4 {
    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol;
        mybox1.depth = 10;
        mybox1.width = 20;
        mybox1.height = 15;
        mybox2.height = 3;
        mybox2.depth = 6;
        mybox2.width = 9;
        vol = mybox1.volum();
        System.out.println(vol);
        vol = mybox2.volum();
        System.out.println(vol);
    }
}
