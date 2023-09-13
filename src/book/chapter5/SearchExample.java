package book.chapter5;

public class SearchExample {
    public static void main(String[] args) {
        int nums[] = {7, 5, 9, 23, 67, 55, 87, 90};
        int val = 55;
        boolean found = false;
        for (int x : nums) {
            if (x == val) {
                found = true;
                break;
            }
        }
        if (found) System.out.println("значение найдено: ");
    }
}
