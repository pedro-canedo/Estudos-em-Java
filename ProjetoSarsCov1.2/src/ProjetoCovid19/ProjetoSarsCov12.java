import javax.swing.JOptionPane;

public class ProjetoSarsCov12 {

    public static void main(String[] args) {
        String entrada = "";
        String[] sintomasgerais = {"febre","dor de cabeça", "cansaço", 
                "Dores no Corpo", "Dor de garganta", "Tosse seca",
                "Tosse com secreção", "Falta de ar",
                "Perda de olfato/ paladar", "Calafrios", "Coriza", "Manchas no corpo",
                 "Dores articulares", "dor nos olhos"};
        int[] sintomasreais = new int[sintomasgerais.length];
        JOptionPane.showMessageDialog(null,"<html><center><strong>"
                + "<p>Suporte Diagnóstico para Covid-19</p><p>Responda sim ou não:(S/N) para os Sintomas a seguir</p><p>"
                + "Este programa não descarta a importância de um diagnóstico médico</p><strong></center></html>");
        for (int i = 0; i < sintomasgerais.length; i++) {
            do {
                entrada = JOptionPane.showInputDialog("Você teve " + sintomasgerais[i] + "? (S/N):");
                entrada = entrada.toUpperCase();
                if (entrada.equals("S")) {
                    sintomasreais[i] = 1;
                }
            } while (!entrada.equals("S") && !entrada.equals("N"));
        }

        int espInfluenza = sintomasreais[6] + sintomasreais[9] + sintomasreais[10];
        
        int espCovid = sintomasreais[5] + sintomasreais[7] + sintomasreais[8];
        
        int espDengue = sintomasreais[11] + sintomasreais[12] + sintomasreais[13];

        if (espDengue > espCovid || espDengue > espInfluenza) {
                JOptionPane.showMessageDialog(null, "<html><strong><center>Provavelmente você está com dengue! <p>Procure um Médico</p></strong></center></html>");
            }

        if (espCovid > espDengue || espCovid > espInfluenza) {
                JOptionPane.showMessageDialog(null, "<html><strong><center>Provavelmente você está com COVID19! Procure um Médico</strong></center></html>");
            }

        if (espInfluenza > espCovid || espInfluenza > espDengue) {
            if (espDengue == 0 && espCovid == 0) {
                JOptionPane.showMessageDialog(null, "<html><strong><center>Provavelmente você está com Influenza! <p>Procure um Médico</p></strong></center></html>");
            }
        } else {
            JOptionPane.showMessageDialog(null, "<html><strong><center>Diagóstico incloncusivo <p>Procure um Médico</p></strong></center></html>");
        }
    }
}