import java.util.Scanner;

public class ejercicio26 {
    final static Scanner TECLADO = new Scanner(System.in);

    public static void main(String[] args) {
        int longitud = 9;
        int [] vector = new int[longitud];

        for (int i = 0; i < vector.length; i++) {
            System.out.println("Asigna un valor a tu array: ");
            vector[i] = TECLADO.nextInt();
        }

        System.out.println("Array sin corregir");
        for (int num : vector) {
            System.out.print(num + " ");
        }

        System.out.println();
        System.out.println("Ingresa cuantas la cantidad de rotaciones que quieras: ");
        int rotaciones = TECLADO.nextInt();
        for (int i = 0; i < vector.length - 1; i++) {
            vector[i] = vector[i + rotaciones];
        }
        System.out.println();
        System.out.println("Array corregido");
        for (int num : vector) {
            System.out.print(num + " ");
        }
    }
}