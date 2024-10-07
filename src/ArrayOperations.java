import java.util.Arrays;
import java.util.Random;

public class ArrayOperations {
    private int[] array;
    private int size;

    public ArrayOperations(int size) {
        this.size = size;
        array = new int[size];
    }

    public void FillArray() {
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = rand.nextInt(101);
        }
    }

    @Override
    public String toString() {
        return "ArrayOperations{" +
                "array=" + Arrays.toString(array) +
                ", size=" + size +
                '}';
    }

    public boolean findElement(int element) {
        for (int i = 0; i < size; i++) {
            if (array[i] == element) {
                return true;
            }
        }
        return false;
    }

 }



