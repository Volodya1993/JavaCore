package homeworks;

public class Sort {
    public static void main(String[] args) {
int x;
        int[] array = {4, 7, 1, 3, 9, 0, 2,};
        for (int i = 0; i < array.length; i++) {
            for (int k = i; k < array.length; k++) {
                if (array [i]> array[k]){
                    x = array[i];
                    array[i]=array[k];
                    array[k]=x;
                }

                
            }
            System.out.print(array[i] + " ");
            
        }


    }

}