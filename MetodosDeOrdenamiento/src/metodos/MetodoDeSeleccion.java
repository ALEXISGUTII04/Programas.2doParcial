
package metodos;


public class MetodoDeSeleccion {
    
    public void MetodoDeSeleccion (int m[]){
        
        int i, j, menor, p, aux;
        for (i = 0; i < m.length - 1; i++){
            menor = m[i];
            p = i;
            for (j = i + 1; j < m.length; j++){
                if (m[j] < menor){
                    menor = m[j];
                    p = j;                  
                }
            }
                if (p != i){
                    aux = m[i];
                    m[i] = m[p];
                    m[p] = aux;                    
                }           
        }
        System.out.println("\n Los numeros ordenados de menor a mayor son");
        for (i = 0; i < m.length; i++){
            System.out.print(m[i] + " ");
        }
    }
    
}
