package book.chapter6;

public class BoxTest5 {
    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol;
        mybox1.setdim(10,20,15);
        mybox2.setdim(3,6,9);
        vol= mybox1.volum();
        System.out.println(vol);
        vol = mybox2.volum();
        System.out.println(vol);
    }

}
