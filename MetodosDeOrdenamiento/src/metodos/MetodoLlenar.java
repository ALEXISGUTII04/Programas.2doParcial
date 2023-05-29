
package metodos;

import java.util.Random;

public class MetodoLlenar {
    
    public int [] llenarNumeros (int m[]){
        Random ran = new Random ();
        int n;
        
        for (int i = 0; i < m.length; i++){
            m[i] = n = ran.nextInt (100) + 1;
            System.out.print(m[i] + " ");
        }
    
    return m;
    }
}
