/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventana;
import java.io.IOException;

/**
 *
 * @author crist
 */
public class interfaz extends javax.swing.JFrame {

    /**
     * Creates new form interfaz
     */
    public interfaz() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        precioActual = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Tasa = new javax.swing.JTextField();
        precioFinal1 = new javax.swing.JTextField();
        TiempoMadurez = new javax.swing.JTextField();
        NumeroIntervalos = new javax.swing.JTextField();
        NumeroIter = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(153, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("SALIR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 80, 30));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Precio Actual");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 80, 20));

        jLabel2.setText("Precio Final");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 70, 20));

        jLabel3.setText("Tasa");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, -1, -1));

        precioActual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precioActualActionPerformed(evt);
            }
        });
        getContentPane().add(precioActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 100, -1));

        jLabel4.setText("Tiempo de madurez");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));

        jLabel5.setText("Número de intervalos");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Número de iteraciones");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, -1));
        getContentPane().add(Tasa, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 100, -1));
        getContentPane().add(precioFinal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 100, -1));
        getContentPane().add(TiempoMadurez, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 100, -1));
        getContentPane().add(NumeroIntervalos, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 100, -1));
        getContentPane().add(NumeroIter, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 100, -1));

        jButton2.setBackground(new java.awt.Color(153, 0, 0));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Calcular");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, -1, -1));

        jCheckBox1.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setText("Opcion de Compra (Call)");
        getContentPane().add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, -1, -1));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.jpg"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 499, 436));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void precioActualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precioActualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_precioActualActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        Runtime rt = Runtime.getRuntime();
        
        float precioInicial=Float.parseFloat(precioActual.getText());  
        float precioFinal=Float.parseFloat(precioFinal1.getText());
        float tLibreRiesgo=Float.parseFloat(Tasa.getText());
        float tMadurez = Float.parseFloat(TiempoMadurez.getText());
        float nInterval=Float.parseFloat(NumeroIntervalos.getText());
        float nIter = Float.parseFloat(NumeroIter.getText());
        int callOp = 0;
        
        if (jCheckBox1.isSelected()) {
            callOp = 1;
        }
        
        try{
            Process pr = rt.exec("cmd /c Rscript funcion.R "+precioInicial+" "+precioFinal+" "+tLibreRiesgo+" "+tMadurez+" "+nInterval+" "+nIter+" "+callOp);
        }
        catch(IOException ex){
            System.out.println (ex.toString());
            System.out.println("Error running R script");
        }
        
        /*this.answer.setText("Aproximación:  "+aprox);*/
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField NumeroIntervalos;
    private javax.swing.JTextField NumeroIter;
    private javax.swing.JTextField Tasa;
    private javax.swing.JTextField TiempoMadurez;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JTextField precioActual;
    private javax.swing.JTextField precioFinal1;
    // End of variables declaration//GEN-END:variables
}
