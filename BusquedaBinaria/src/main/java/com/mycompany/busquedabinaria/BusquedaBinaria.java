
package com.mycompany.busquedabinaria;

public class BusquedaBinaria {
       
    public static int BusquedaBinaria(int[] arreglo, int elemento) {
        int izquierda = 0;
        int derecha = arreglo.length - 1;

        while (izquierda <= derecha) {
            int medio = (izquierda + derecha) / 2;
          
            if (arreglo[medio] == elemento) {
                return medio;
            }       
            if (arreglo[medio] < elemento) {
                izquierda = medio + 1;
            }        
            else {
                derecha = medio - 1;
            }
        }      
        return -1;
    }

    public static void main(String[] args) {
        int[] arreglo = {3, 4, 6, 8, 19, 5, 14, 190, 18, 20};
        int elemento = 190;

        int indice = BusquedaBinaria(arreglo, elemento);

        if (indice != -1) {
            System.out.println("El elemento " + elemento + " está en el índice " + indice);
        } else {
            System.out.println("El elemento " + elemento + " no se encuentra en el arreglo");
        }
    }
}

    

