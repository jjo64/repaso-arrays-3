import java.util.Scanner;

public class ejercicio19 {
    final static Scanner TECLADO = new Scanner(System.in);

    public static void main(String[] args) {
        int [] vector = new int[10];
        int positivos = 0;
        int negativos = 0;
        int sumaPositivos = 0;
        int sumaNegativos = 0;
        int sumaTotal = 0;
        int valorMaximo = 0;
        int valorMinimo = 0;
        int contadorMaximo = 0;
        int contadorMinimo = 0;
        int posicionMaximo = 0;


        for (int i = 0; i < vector.length; i++) {
            System.out.println("Ingresa el valor de tu array: ");
            vector[i] = TECLADO.nextInt();
        }

        for (int i = 0; i < vector.length; i++) {
            if (vector[i] > 0) {
                sumaPositivos += vector[i];
                positivos++;
            }

            if (vector[i] < 0) {
                sumaNegativos += vector[i];
                negativos++;
            }

            if (vector[i] > valorMaximo) {
                valorMaximo = vector[i];
            } else if (vector[i] == valorMaximo) {
                contadorMaximo++;
            }

            if (vector[i] < valorMinimo) {
                valorMinimo = vector[i];
            } else if (vector[i] == valorMinimo) {
                contadorMinimo++;
            }
        }

        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == valorMaximo) {
                posicionMaximo = i;
            }
        }

        for (int i = 0; i < vector.length; i++) {
            sumaTotal = sumaPositivos + sumaNegativos;
        }

        System.out.println("La cantidad de numeros positivos son: " + positivos + " y la suma de todos ellos: " + sumaPositivos);
        System.out.println("La cantidad de numeros negativos son: " + negativos + " y la suma de todos ellos: " + sumaNegativos);
        System.out.println("La suma total del array independientemente de sus valores es de: " + sumaTotal);
        System.out.println("El valor maximo dentro del array es: " + valorMaximo + " se encuentra en la posicion " + posicionMaximo + " y se repite una cantidad de " + contadorMaximo + " veces");
    }
}
