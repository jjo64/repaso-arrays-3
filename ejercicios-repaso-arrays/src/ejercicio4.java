import java.util.Scanner;
public class ejercicio4 {
    final static Scanner TECLADO = new Scanner(System.in);
    public static void main(String[] args) {
        int [] numeros = new int[7];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 49) + 1;
            for (int j = 0; j < numeros.length; j++) {
                if (numeros[i] == numeros[j]) {
                    numeros[i] = (int) (Math.random() * 49) + 1;
                    j = -1;
                }
            }
        }

        for (int num : numeros) {
            System.out.println(num + "");
        }
    }
}