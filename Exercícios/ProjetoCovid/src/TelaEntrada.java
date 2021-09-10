/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author COMP
 */
public class TelaEntrada extends javax.swing.JFrame {

    /**
     * Creates new form TelaEntrada
     */
    public TelaEntrada() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        btnIniciar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        imagem = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        btnIniciar.setText("Iniciar Teste");
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });
        getContentPane().add(btnIniciar);
        btnIniciar.setBounds(120, 220, 209, 69);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Suporte Diagnóstico de Sars Cov2 Covid-19");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, -20, 420, 70);

        imagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/fundoprincipal.jpg"))); // NOI18N
        getContentPane().add(imagem);
        imagem.setBounds(0, 0, 470, 320);

        setSize(new java.awt.Dimension(488, 360));
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {                                           
        TelaDiagnostico tela = new TelaDiagnostico();
        tela.setVisible(true);
        dispose();
    }                                          

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        String entrada = "";
        String[] sintomasgerais = {"tosse", "febre","dor de cabeça", "cansaço", 
                "Manchas vermelhas", "tosse", "dor de garganta",
                "suor noturno", "catarro esverdeado",
                "falta de ar", "perda de oflato/paladar",
                "dor atrás dos olhos", "dor articular"};
        int[] sintomasreais = new int[sintomasgerais.length];
        
        
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaEntrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaEntrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaEntrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaEntrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaEntrada().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btnIniciar;
    private javax.swing.JLabel imagem;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration                   
}
