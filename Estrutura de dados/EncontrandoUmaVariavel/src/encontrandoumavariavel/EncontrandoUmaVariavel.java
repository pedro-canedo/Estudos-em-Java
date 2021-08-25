package encontrandoumavariavel;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author pedro
 */
public class EncontrandoUmaVariavel {
    
    public static void main(String[] args) {
        Queue<Integer> fila = new LinkedList<>();
        for(int i =10; i >0; i--)
            fila.add(i);
        for(int i= 0;i < 8; i++)
            fila.remove();
        System.out.println(fila);
    }
    
}
