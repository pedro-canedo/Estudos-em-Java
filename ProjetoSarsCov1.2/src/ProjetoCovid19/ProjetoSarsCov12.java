package ProjetoCovid19;

import javax.swing.JOptionPane;

/**
 *
 * @author Pedro Augusto
 */
public class ProjetoSarsCov12 {


    public static void main(String[] args) {
        String entrada = "";
        String[] sintomasgerais = {"febre","dor de cabeça", "cansaço", 
                "Dores no Corpo", "Dor de garganta", "Tosse seca",
                "Tosse com pigarro", "Falta de ar",
                "Perda de olfato/ paladar", "Calafrios", "Coriza", "Manchas no corpo",
                 "mal estar", "dor nos olhos"};
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
                } else if (entrada.equals("N")) {
                    sintomasreais[i] = 0;
                }
            } while (!entrada.equals("S") && !entrada.equals("N"));
        }
        int espInfluenza = sintomasreais[6] + sintomasreais[9] + sintomasreais[10];
        
        int espCovid = sintomasreais[5] + sintomasreais[7] + sintomasreais[8];
        
        int espDengue = sintomasreais[11] + sintomasreais[12] + sintomasreais[13];
        if (espDengue >= 1) {
            if (espCovid == 0 && espInfluenza == 0) {
                JOptionPane.showMessageDialog(null, "<html><strong><center>Provavelmente você está com dengue! <p>Procure um Médico</p></strong></center></html>");
            }
        }
        if (espCovid >= 1) {
            if (espDengue == 0 && espInfluenza == 0) {
                JOptionPane.showMessageDialog(null, "<html><strong><center>Provavelmente você está com COVID19! Procure um Médico</strong></center></html>");
            }
        }
        if (espInfluenza >= 1) {
            if (espDengue == 0 && espCovid == 0) {
                JOptionPane.showMessageDialog(null, "<html><strong><center>Provavelmente você está com Influenza! <p>Procure um Médico</p></strong></center></html>");
            }
        }
        if ((espCovid != 0 && espDengue != 0) || (espCovid != 0 && espInfluenza != 0) ||
                (espDengue != 0 && espInfluenza != 0)) {
            JOptionPane.showMessageDialog(null, "<html><strong><center>Diagnóstico inconclusivo! Procure um Médico</strong></center></html>");
        }
        if (espInfluenza == 0) {
            if (espDengue == 0 && espCovid == 0) {
                JOptionPane.showMessageDialog(null, "<html><strong><center>Diagnóstico inconclusivo!Procure um Médico</strong></center></html>");
            }
        }
    }
}