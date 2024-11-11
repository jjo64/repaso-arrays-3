import java.util.Scanner;

public class ejercicio25 {
    final static Scanner TECLADO = new Scanner(System.in);

    public static void main(String[] args) {
        int longitud = 10;
        int [] vector = new int[longitud];

        for (int i = 0; i < vector.length; i++) {
            System.out.println("Asigna un valor a tu array: ");
            vector[i] = TECLADO.nextInt();
        }

        System.out.println("Array sin corregir");
        for (int num : vector) {
            System.out.print(num + " ");
        }

        for (int i = 0; i < vector.length; i++) {
            for (int j = i + 1; j < vector.length; j++) {
                if (vector[i] == vector[j]) {
                    vector[j] = 0;
                }
            }
        }
        System.out.println();
        System.out.println("Array corregido");
        for (int num : vector) {
            System.out.print(num + " ");
        }
    }
}
