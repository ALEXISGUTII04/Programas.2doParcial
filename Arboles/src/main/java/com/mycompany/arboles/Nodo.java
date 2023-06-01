
package com.mycompany.arboles;


public class Nodo {
    
    private int elemento;
    private Nodo ramaizq;
    private Nodo ramader;

    public Nodo (int elemento){
        this.elemento = elemento;
        ramaizq = null;
        ramader = null;
    }
    
    public void InsertaBinario (int element){
        if(element<this.elemento){
            if(ramaizq == null)
                ramaizq = new Nodo (element);
            else
                ramaizq.InsertaBinario(element);
        }
        else{
            if(element>this.elemento){
                if(ramader == null)
                    ramader = new Nodo (element);
                else
                    ramader.InsertaBinario(element);
            }
            
        }
    }
    
    public int getElemento() {
        return elemento;
    }

    public void setElemento(int elemento) {
        this.elemento = elemento;
    }

    public Nodo getRamaizq() {
        return ramaizq;
    }

    public void setRamaizq(Nodo ramaizq) {
        this.ramaizq = ramaizq;
    }

    public Nodo getRamader() {
        return ramader;
    }

    public void setRamader(Nodo ramader) {
        this.ramader = ramader;
    }

    @Override
    public String toString() {
        return "Nodo{" + "elemento=" + elemento + ", ramaizq=" + ramaizq + ", ramader=" + ramader + '}';
    }
               
}

