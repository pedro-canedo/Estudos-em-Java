package estruturadedadosvariavel;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author pedro
 */
public class exercicio5 {

    public static void main(String[] args) {
        Queue<Double> fila = new LinkedList<>();
        fila.add(8.90);
        fila.add(5.88);
        fila.add(3.99);
        fila.remove();
        fila.add(5.66);
        fila.remove();
        Double s = 0.0;
        for(Double v:fila)
            s = s+v;
        System.out.println(s);
    }
    
}
