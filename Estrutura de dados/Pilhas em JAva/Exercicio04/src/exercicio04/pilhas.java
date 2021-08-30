
package exercicio04;

import java.util.Stack;

/**
 *
 * @author pedro
 */
public class pilhas {


    public static void main(String[] args) {
        Stack<Integer> pilha = new Stack<>();
        for (int i = 0; i < 100; i++){
            if (i % 2 == 0)
                pilha.push(i);
    }
        for (int i = 0; i < 100; i++){
            System.out.println(pilha.pop());
        }
    }
    
}
