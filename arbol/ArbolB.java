
package com.mycompany.arbol;


public class ArbolB {
    
    Nodo padre;
    Nodo raiz;
    
    public ArbolB(){
        raiz = null;}
    
    public void InsertNodo (int element){
        if(raiz == null) 
        raiz = new Nodo (element);
        else
        raiz.InsertaBinario(element);           
    }
    public void Preorden (Nodo nodo){
        if(nodo == null) return;
        else{
            System.out.print(nodo.getElemento() + " ");
            Preorden(nodo.getRamaizq());
            Preorden(nodo.getRamader());           
        }
    }
    public void PostOrden (Nodo nodo){
        if (nodo == null)return;
        else{
            PostOrden(nodo.getRamaizq());
            PostOrden(nodo.getRamader());
            System.out.print(nodo.getElemento() + " ");
        }
    }
    public void Inorden (Nodo nodo){
        if(nodo == null)return;
        else{
            Inorden(nodo.getRamaizq());
            System.out.print(nodo.getElemento() + " ");
            Inorden(nodo.getRamader());           
    }
    }
    void busqueda (int element, Nodo A){
        if((A == null) | (A.getElemento() == element)){
            System.out.print(A.getElemento() + " ");
            return;
        }
        else{
            if(element>A.getElemento()) busqueda (element, A.getRamader());
            else busqueda (element, A.getRamaizq());
        }
    }
    public int Altura (Nodo nodo){
        int Altuder = (nodo.getRamader() == null? 0:1 + Altura(nodo.getRamader()));
        int Altuizq = (nodo.getRamaizq() == null? 0:1 + Altura (nodo.getRamader()));
        return Math.max(Altuder, Altuizq);
    }
    }
        
    
