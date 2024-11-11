import java.util.Scanner;

public class ejercicio2 {
    final static Scanner TECLADO = new Scanner(System.in);
    public static void main(String[] args) {
        int [] numeros = new int[10];

        System.out.println("Numero sin invertir: ");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 11);
            System.out.print(numeros[i] + " ");
        }

        System.out.println();

        System.out.println("Numero invertido: ");
        for(int i = numeros.length - 1; i >= 0; i--) {
            System.out.print(numeros[i] + " ");
        }
    }
}