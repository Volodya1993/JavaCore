package book.chapter6;

public class Box {
    double width;
    double height;
    double depth;

    void volume() {
        System.out.println("Обьем равен ");
        System.out.println(width * height * depth);
    }

    double volum() {
        return width * height * depth;
    }
void setdim (double w, double h, double d){
        width = w;
        height = h;
        depth = d;
}
}
