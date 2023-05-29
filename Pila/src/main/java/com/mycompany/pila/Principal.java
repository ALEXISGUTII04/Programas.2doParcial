

package com.mycompany.pila;

public class Principal {

    public static void main(String[] args) {
        Nodo inicial = new Nodo(1, null);

		System.out.println("inicial: " + inicial.getElemento());
		Pila pila1 = new Pila();

		System.out.println(pila1.toString());
		Nodo pvalor = new Nodo(3, null);
		Nodo top = pila1.push(inicial, pvalor);

		System.out.println("valor Top " + top.getElemento());
		top = pila1.push(inicial, new Nodo(78, null));

		System.out.println(" Valor Top " + top.getElemento());
		top = pila1.push(inicial, new Nodo(23, null));

		System.out.println("******");
		top = pila1.pop(inicial);
		System.out.println("***Después de borrado***");

		top = pila1.push(inicial, new Nodo(45, null));
		top = pila1.push(inicial, new Nodo(89, null));
		top = pila1.push(inicial, new Nodo(41, null));
		System.out.println(top.toString());

		System.out.println(" Valor Top " + pila1.top().toString());
	}

}
