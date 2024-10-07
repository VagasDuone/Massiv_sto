import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayOperations array = new ArrayOperations(50);
        array.FillArray();
        System.out.println(array.toString());

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите элемент для поиска");
        int poisk = scanner.nextInt();
        boolean found = array.findElement(poisk);
        if (found) {
            System.out.println("Элемент найден");
        } else {
            System.out.println("элемент не найден");
        }
    }
}