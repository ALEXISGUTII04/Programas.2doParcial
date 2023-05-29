
package metodos;


public class MetodoHanoi {
    
    public void MoverDiscos (int n, char TorreOrigen, char TorreDestino, char TorreAuxiliar){
        if (n == 1){
            System.out.println("Mover disco 1 de " + TorreOrigen + " a " + TorreDestino);           
        }else {
            MoverDiscos (n - 1, TorreOrigen, TorreAuxiliar, TorreDestino);
            System.out.println("Mover disco " + n + " de " + TorreOrigen + " a " + TorreDestino);
            MoverDiscos (n - 1, TorreAuxiliar, TorreDestino, TorreOrigen);
        }
    }
    
}
