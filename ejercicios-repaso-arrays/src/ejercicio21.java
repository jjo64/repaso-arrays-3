import java.util.Scanner;

public class ejercicio21 {
    final static Scanner TECLADO = new Scanner(System.in);

    public static void main(String[] args) {
        int longitud = 5;
        int [] vector = new int[longitud];

        for (int i = 0; i < vector.length; i++) {
            System.out.println("Asigna un valor a tu array: ");
            vector[i] = TECLADO.nextInt();
        }

        for (int i = 0; i < vector.length; i++) {
            for (int j = 0; j < vector[i]; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
