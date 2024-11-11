import java.util.Scanner;

public class Main {
    final static Scanner TECLADO = new Scanner(System.in);
    public static void main(String[] args) {
            int [] notas = new int[30];
            int media = 0;

        for (int i = 0; i < notas.length; i++) {
            notas[i] = (int) (Math.random() * 11);
            media += notas[i];
        }

        for (int i = 0; i < notas.length; i++) {
            if (notas[i] >=5) {
                System.out.println("El alumno " + i + " esta aprobado con un: " + notas[i]);
            }
        }

        int mediaTotal = media / 30;

        System.out.println("La media total es : " + mediaTotal);

        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > mediaTotal) {
                System.out.println("El alumno " + i + " saco una nota por encima de la media " + notas[i]);
            }
        }
    }
}
