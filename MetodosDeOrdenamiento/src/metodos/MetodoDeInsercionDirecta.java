
package metodos;


public class MetodoDeInsercionDirecta {
    
    public void MetodoDeInsercionDirecta (int m[]){
        int p, j;
        int aux;
        for (p = 1; p < m.length; p++){
            aux = m[p];
            j = p -1;
            while ((j >= 0) && (aux < m[j])){
                m[j + 1] = m[j];
                j--;                
            }
            m[j + 1] = aux;          
        }
        System.out.println("\n Los numeros ordenados de menor a mayor son");
        for (int i = 0; i < m.length; i++){
            System.out.print(m[i] + " ");       
    }
    }
}
