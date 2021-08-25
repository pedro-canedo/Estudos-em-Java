package filasemjava;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author pedro
 */
public class contador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Queue<Integer>fila = new LinkedList<>();
        for(int i= 0; i < 20; i+=2)
            fila.add(i);
        for(int i = 0;i < 10; i++)
            fila.remove();
            System.out.println(fila);
        if(fila.isEmpty())
            System.out.println("A fila está vazia! ");
        else
            System.out.println("A fila não está vaizia! ");
        
    }
    
}
