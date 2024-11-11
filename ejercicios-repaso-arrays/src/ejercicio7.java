import java.util.Scanner;
public class ejercicio7 {
    final static Scanner TECLADO = new Scanner(System.in);

    public static void main(String[] args) {
        int [] numeros = new int[200];
        int [] contador = new int[49];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int)(Math.random()*49 + 1);
            contador[numeros[i]]++;
        }

        int repite = 0;
        int valor = 0;
        int repiteValor = 0;

        int [] cincoValores = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros.length; j++) {
                if (numeros[i] == numeros[j]) {
                    repite++;
                }

                if (numeros[i] > valor) {
                    valor = numeros[i];
                    if (numeros[i] == valor) {
                        repiteValor++;
                    }
                }
            }
        }
    }
}
