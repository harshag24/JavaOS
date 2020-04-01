
package javaos;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import static javaos.MainPage.processes;


public class AboutPage extends javax.swing.JFrame {
  public AboutPage() {
        initComponents();
        jTextArea1.setEditable(false);
         addWindowListener(new WindowAdapter(){  
            @Override
            public void windowClosing(WindowEvent e) {        
                processes.remove(new Integer(9));
                System.out.println("Removed proccess with prority 9");

            }  
        });
    }

  
  @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("About");
        getContentPane().setLayout(null);

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Monospaced", 3, 18)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(252, 118, 106));
        jTextArea1.setRows(5);
        jTextArea1.setText("JavaOS is a simulation of an Operating System\n\nIt is developed by :\nHarsh Agrawal\nStudent - Btech CS 2nd Year");
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(300, 230, 557, 143);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/full_bg.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1150, 650);

        setBounds(0, 0, 1166, 697);
    }// </editor-fold>//GEN-END:initComponents

  
    public static void main(String args[]) {
   
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AboutPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AboutPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AboutPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AboutPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
         AboutPage frame = new AboutPage();
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                    frame.setVisible(true);       
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
