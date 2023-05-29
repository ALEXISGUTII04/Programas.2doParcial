
package com.mycompany.mochila;


public class Objeto {
    private float peso;
	private int valor;
	private float valorPeso;
	
	public Objeto (float p, int v){
		peso = p;
		valor = v;
		valorPeso = (float) valor / peso;
	}

	
	public float getPeso() {
		return peso;
	}


	public int getValor() {
		return valor;
	}
	
	public float getValorPeso(){
		return valorPeso;
	}

}

