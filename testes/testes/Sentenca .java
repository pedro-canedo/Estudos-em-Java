package testes;
public static void main(String[] args) {
        
    int numero = 10;
    boolean ehPrimo = true;
    
    for (int i = 2; i < numero; i++) {
        if (numero % i == 0) {
            ehPrimo = false;
            break;
        ｝
    }
    
    if (ehPrimo)
        System.out.println(numero + " é primo");
    else
        System.out.println(numero + " não é primo");
    
    numero = 11;
    ehPrimo = true;
    
    for (int i = 2; i < numero; i++) {
        if (numero % i == 0) {
            ehPrimo = false;
            break;
        }
    }
    
    if (ehPrimo)
        System.out.println(numero + " é primo");
    else
        System.out.println(numero + " não é primo");
}
}