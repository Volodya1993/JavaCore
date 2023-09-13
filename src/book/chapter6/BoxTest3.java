package book.chapter6;

public class BoxTest3 {
    public static void main(String[] args) {
        Box mybox = new Box();
        Box mybox2 = new Box();
        mybox.depth = 15;
        mybox.height = 20;
        mybox.width = 10;
        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;
        mybox.volume();
        mybox2.volume();
    }
}
