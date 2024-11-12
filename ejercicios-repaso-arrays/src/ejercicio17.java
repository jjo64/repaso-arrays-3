import java.util.Arrays;
import java.util.Scanner;

public class ejercicio17 {
    final static Scanner TECLADO = new Scanner(System.in);

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Ingresa tu frase por teclado: ");
        String frase = TECLADO.nextLine();

        //Convertir la frase en un array de caracteres
        char [] texto = frase.toCharArray();

        //Cantidad de espacios en blanco para mover el texto
        int espacios = 20;
        char[] espaciosBlancos = new char[espacios];
        for (int i = 0; i < espacios; i++) {
            espaciosBlancos[i] = ' ';
        }

        //Array que contiene la frase y los espacios en blanco
        char[] marquesina = new char[espacios + texto.length];
        System.arraycopy(espaciosBlancos, 0, marquesina, 0, espacios);
        System.arraycopy(texto, 0, marquesina, espacios, texto.length);

        //Mover la frase como una marquesina
        while (true) {
            //Imprimir el array de la marquesina
            System.out.println("\r");
            for (int i = 0; i < texto.length; i++) {
                System.out.print(marquesina[i]);
            }

            //Desplazar los caracteres
            char primerCaracter = marquesina[0];
            for (int i = 0; i < marquesina.length - 1; i++) {
                marquesina[i] = marquesina[i + 1];
            }
            marquesina[marquesina.length - 1] = primerCaracter;

            //Esperar un poco antes del siguiente desplazamiento
            Thread.sleep(300);
        }
    }
}
