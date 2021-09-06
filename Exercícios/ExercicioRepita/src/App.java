import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        int n;
        do{
        n = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um Número"));
    } while (n != 0);
    }
}
