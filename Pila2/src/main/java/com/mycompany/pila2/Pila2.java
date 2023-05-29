
package com.mycompany.pila2;

import java.util.Stack;

public class Pila2 {

    public static void main(String[] args) {
        
        Stack<Persona> F1 = new Stack<Persona>();
        Persona persona1 = new Persona();
        persona1.setNombre("Raul Jimenez");
        persona1.setEdad(26);
        F1.push(persona1);
        
        Persona persona2 = new Persona();
        persona2.setNombre("Alvaro Fidalgo");
        persona2.setEdad(22);
        F1.push(persona2);
        
        Persona persona3 = new Persona();
        persona3.setNombre("Gutii");
        persona3.setEdad(18);
        F1.push(persona3);
        
        System.out.println(F1);
        F1.pop();
        System.out.println(F1);
    }
}
