import java.util.Scanner;

public class ejercicio16 {
    final static Scanner TECLADO = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] bonoloto = new int[4][6];

        // Rellenar el array bidimensional
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 6; j++) {
                int numero;
                boolean repetido;
                do {
                    repetido = false;
                    System.out.println("Ingresa un número para tu apuesta en la posición [" + i + "][" + j + "]: ");
                    numero = TECLADO.nextInt();

                    //Comprobar si el numero ya existe en la apuesta actual
                    for (int k = 0; k < j; k++) {
                        if (bonoloto[i][k] == numero) {
                            repetido = true;
                            System.out.println("Numero repetido. Vuelve a ingresar otro numero");
                            break;
                        }
                    }
                } while (repetido);

                bonoloto[i][j] = numero;
            }
        }

        // Imprimir el array bidimensional
        System.out.println("Array bidimensional:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(bonoloto[i][j] + " ");
            }
            System.out.println();
        }
    }
}
