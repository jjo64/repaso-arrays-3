import java.util.Scanner;
public class ejercicio6 {
    final static Scanner TECLADO = new Scanner(System.in);
    public static void main(String[] args) {
        int [] array = new int[15];

        for (int i = 0; i < args.length; i++) {
            array[i] = (int) (Math.random() * 100) + 1;
        }

        int maximo = 0;
        int minimo = 101;
        int posicionMax = 0;
        int posicionMin = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < minimo) {
                minimo = array[i];
                posicionMin = i;

            }
            if (array[i] > maximo) {
                maximo = array[i];
                posicionMax = i;
            }
        }

        System.out.println("Nuestro valor maximo de nuestro array es: " + maximo + " y se encuentra en la posicion " + posicionMax);
        System.out.println("Nuestro valor minimo de nuestro array es: " + minimo + " y se encuentra en la posicion " + posicionMin);

    }
}
