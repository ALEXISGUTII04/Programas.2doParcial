
package com.mycompany.busquedasecuencial;

import java.util.Scanner;

public class BusquedaSecuencial {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[] arreglo = new int[10];
        int dato ;
        boolean band = false;
     
        System.out.println("Ingrese 10 numeros para crear el arreglo");
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = leer.nextInt();
        }

        System.out.println("¿Que numero desea buscar?");
        dato = leer.nextInt();
        int i = 0, pos = 0;
        while (i < arreglo.length && band == false) {
            if (dato == arreglo[i]) {
                band = true;
                pos = i;
                break;
            }
            i++;
        }
        if (band == false) {
            System.out.println("El numero no se encuentra en el arreglo");
        } else {
            System.out.println("El numero ha sido encontrado y esta en la posición " + (pos + 1));
        }

    }

}

    

