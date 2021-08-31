package condicionaalcomposta;

import java.util.Scanner;
/**
 *
 * @author Pedro Augusto
 */

public class CondicionaalComposta {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner t = new Scanner(System.in);
        System.out.print("Em que ano você nasceu ? ");
        int nasc = t.nextInt();
        int i = 2021-nasc;
        System.out.println("Sua idade é: " + i);
        if (i >= 18){
            System.out.println("Você é Maior de idade");
            
        }   else {
                    System.out.println("Você é menor de idade");
            }
    }
}
    
