import java.util.Scanner;
public class ejercicio3 {
    final static Scanner TECLADO = new Scanner(System.in);
    public static void main(String[] args) {
        int [] notas = new int[20];
        int [] cantidad = new int[5];

        for (int i = 0; i < notas.length; i++) {
            int num = (int) (Math.random() * 5) + 1;
            notas[i] = num;
            System.out.print(num + " ");
            cantidad[num-1]++;
        }

        for (int i = 0; i < cantidad.length; i++) {
            System.out.println("Hay " + cantidad[i] + " numero de " + (i+1));
        }
    }
}
