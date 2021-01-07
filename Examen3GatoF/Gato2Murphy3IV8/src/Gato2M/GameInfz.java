package Gato2M;
import javax.swing.JOptionPane;
import ove.*;

public class GameInfz extends javax.swing.JFrame {
    String[] botones = {"Sí, quiero cerrar.", "No, quiero repetir."};
    IA_M meia = new IA_M();
    ConMenu meove = new ConMenu();
    
    public GameInfz() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        consola = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        select = new javax.swing.JLabel();
        jugar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        consola.setBackground(new java.awt.Color(255, 255, 255));
        consola.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N
        consola.setText("CONSOLA");
        consola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consolaActionPerformed(evt);
            }
        });
        getContentPane().add(consola, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, 170, -1));

        salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gato2M/images/Cerrar.png"))); // NOI18N
        salir.setBorderPainted(false);
        salir.setContentAreaFilled(false);
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        getContentPane().add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, -20, 60, 100));

        select.setFont(new java.awt.Font("Gill Sans MT Ext Condensed Bold", 0, 100)); // NOI18N
        select.setForeground(new java.awt.Color(255, 255, 255));
        select.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        select.setText("GATO");
        select.setOpaque(false);
        getContentPane().add(select, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 140, 100));

        jugar.setBackground(new java.awt.Color(255, 255, 255));
        jugar.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N
        jugar.setText("JUGAR");
        jugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jugarActionPerformed(evt);
            }
        });
        getContentPane().add(jugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 140, -1));

        jLabel1.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Salir");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 40, 40, 30));

        jLabel2.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("THE GAME");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, -1, 100));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gato2M/images/FondoG.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents
        
    private void consolaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consolaActionPerformed
        meove.main();
    }//GEN-LAST:event_consolaActionPerformed

    private void jugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jugarActionPerformed
        meia.walden();
        this.setVisible(false);
    }//GEN-LAST:event_jugarActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        int OpM = JOptionPane.showOptionDialog(this, "¿Te has encontrado?\nLo no guardado se perdera."
                , "Perdido totalmente.", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null, botones, botones[0]);
        if(OpM == JOptionPane.YES_OPTION){
            System.exit(0);
        }
        else{
        }
    }//GEN-LAST:event_salirActionPerformed

    public static void todo(){
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
            java.util.logging.Logger.getLogger(GameInfz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GameInfz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GameInfz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GameInfz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GameInfz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton consola;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton jugar;
    private javax.swing.JButton salir;
    private javax.swing.JLabel select;
    // End of variables declaration//GEN-END:variables
}
