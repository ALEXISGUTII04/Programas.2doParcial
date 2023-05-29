
package metodos;


public class MetodoBurbuja {
    
    public void MetodoBurbuja  (int m[]){
            
        for (int i = 0; i < m.length - 1; i++){
            for (int j = 0; j < m.length - i - 1; j++){
                if (m[j] > m[j + 1]) {
                    int aux = m[j];
                    m[j] = m[j + 1];
                    m[j + 1] = aux;
                }
            }           
        }
        System.out.println("\nLos numeros ordenados de menor a mayor son");
        for (int i = 0; i < m.length; i++){
            System.out.print(m[i] + " ");
        }
    }    
}
