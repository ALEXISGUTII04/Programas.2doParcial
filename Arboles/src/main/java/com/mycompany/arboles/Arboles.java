
package com.mycompany.arboles;

import java.util.Scanner;

public class Arboles {

    public static void main(String[] args) {
        
        ArbolB S = new ArbolB();
        int indice;
        int opc=0;
        
        Scanner leer = new Scanner(System.in);
        System.out.println("BIENVENIDO A ÁRBOL BINARIO ORDENADO");
        do{
            System.out.println("MENÚ");
            System.out.println("Seleccione una opcion:");
            System.out.println("1.-Insertar");
            System.out.println("2.-Eliminar");
            System.out.println("3.-Recorrido en Pre-Orden");
            System.out.println("4.-Recorrido en In-Orden");
            System.out.println("5.-Recorrido en Post-Orden");
            System.out.println("6.-Salir");
            opc=leer.nextInt();
            
            switch (opc){
                
                case 1:
                    System.out.println("Dame el número a insertar: ");
                    int a = leer.nextInt();
                    S.InsertNodo(a);
                    
                    break;
                    
                case 2:                            
                    
                case 3:
                    System.out.println("El recorrido en Pre-Orden es: ");
                    S.Preorden(S.raiz);
                    System.out.println();
                    break;
                    
                case 4:
                    System.out.println("El recorrido en In-Orden es: ");
                    S.Inorden(S.raiz);
                    System.out.println();
                    break;
                    
                case 5:
                    System.out.println("El recorrido en Post-Orden es: ");
                    S.PostOrden(S.raiz);
                    System.out.println();
                    break;                                                                            
            }
        } while (opc!= 6);
    
        }
}