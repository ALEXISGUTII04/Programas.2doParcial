package metodos;

import java.util.Scanner;
import java.util.Arrays;

public class Principal {

    public static void main(String[] args) {

        int opcion;

        MetodoLlenar llenar = new MetodoLlenar();
        MetodoBurbuja burbuja = new MetodoBurbuja();
        MetodoDeInsercionDirecta insercion = new MetodoDeInsercionDirecta();
        MetodoDeSeleccion seleccion = new MetodoDeSeleccion();
        MetodoDeQuickSort quick = new MetodoDeQuickSort();
        MetodoShell shell = new MetodoShell();
        MetodoDeAckermann ackerman = new MetodoDeAckermann();
        MetodoHanoi hanoi = new MetodoHanoi();

        System.out.println("Metodos de Ordenamiento");
        Scanner leer = new Scanner(System.in);
        System.out.println("Dame el tamaño de tu matriz");
        int M = leer.nextInt();

        int[] m = new int[M];

        System.out.println("Menu de metodos");
        System.out.println("1.- Metodo Burbuja");
        System.out.println("2.- Metodo de Insercion");
        System.out.println("3.- Metodo de Seleccion");
        System.out.println("4.- Metodo QuickSort");
        System.out.println("5.- Metodo Shell");
        System.out.println("6.- Metodo Ackermann");
        System.out.println("7.- Metodo Hanoi");

        opcion = leer.nextInt();

        switch (opcion) {

            case 1:
                llenar.llenarNumeros(m);
                burbuja.MetodoBurbuja(m);

                break;

            case 2:
                llenar.llenarNumeros(m);
                insercion.MetodoDeInsercionDirecta(m);

                break;

            case 3:
                llenar.llenarNumeros(m);
                seleccion.MetodoDeSeleccion(m);

                break;

            case 4:
                llenar.llenarNumeros(m);
                quick.quicksort(m, 0, M - 1);
                System.out.print(Arrays.toString(m));

                break;

            case 5:
                llenar.llenarNumeros(m);
                shell.MetodoShell(m);
                System.out.print(Arrays.toString(m));

                break;

            case 6:
                llenar.llenarNumeros(m);

                break;

            case 7:              
                System.out.println("Moviendo discos con el método de Hanoi");
                System.out.println("Ingrese la cantidad de discos:");
                int n = leer.nextInt();
                hanoi.MoverDiscos(n, 'A', 'C', 'B');

        }

    }
}
