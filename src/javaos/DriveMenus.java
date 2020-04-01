
package javaos;

import java.io.File;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import org.apache.commons.io.FileUtils;

public class DriveMenus extends javax.swing.JFrame {
    String path = "A:\\Github\\JavaOS\\User Folders";
 public DriveMenus() {
        initComponents();
        
        long size =  FileUtils.sizeOfDirectory(new File(path));
        System.out.println(size);
        
        if(size<10000000){
            jProgressBar1.setStringPainted(true);
            jProgressBar1.setValue((int) size);
        }
            else
        {jLabel5.setText("Disk Full");
            jProgressBar1.setValue(10000000);
 }
 }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel4 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Disk Menu");
        getContentPane().setLayout(null);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaos/foldericon.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(287, 194, 119, 98);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaos/foldericon.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(700, 194, 118, 100);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaos/foldericon.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(490, 194, 124, 103);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("DBMS");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(490, 304, 124, 17);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Python");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(700, 300, 126, 17);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("OS");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(280, 300, 126, 17);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Remaining Size");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(480, 10, 200, 22);

        jProgressBar1.setBackground(new java.awt.Color(255, 255, 255));
        jProgressBar1.setForeground(new java.awt.Color(0, 0, 0));
        jProgressBar1.setMaximum(10000000);
        getContentPane().add(jProgressBar1);
        jProgressBar1.setBounds(510, 40, 146, 14);

        jLabel4.setText("10 Mb");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(660, 40, 35, 16);

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton4.setText("Create New Folder");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(897, 50, 200, 31);

        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton5.setText("Delete Folder");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(897, 90, 200, 31);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/full_bg.jpg"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 0, 1150, 650);

        setBounds(0, 0, 1167, 691);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       Console.runFolderOS();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       Console.runFolderPython();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       Console.runFolderDBMS();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       JTextField dir = new JTextField();
       String path1 = path;
       final JComponent[] inputs = new JComponent[] {
        new JLabel("Enter Folder Name"),dir
       };
       int result = JOptionPane.showConfirmDialog(null, inputs, "Create Folder", JOptionPane.PLAIN_MESSAGE);
       if (result == JOptionPane.OK_OPTION)
       {   
           path1 += ("\\"+dir.getText());
           System.out.println(path1);
           File file = new File(path1);
           boolean bool = file.mkdir();
            if(bool)
            {
                JOptionPane.showMessageDialog(this, "Folder Created Successfully!!");
            }else
                JOptionPane.showMessageDialog(this, "Failed to create folder");
                 
       }       
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       String path2 = path;
        JTextField dir = new JTextField();
       final JComponent[] inputs = new JComponent[] {
        new JLabel("Enter Folder Name"),dir
       };
       int result = JOptionPane.showConfirmDialog(null, inputs, "Delete Folder", JOptionPane.PLAIN_MESSAGE);
       if (result == JOptionPane.OK_OPTION)
       {   
           path2 += ("\\"+dir.getText());
           System.out.println(path2);
           File file = new File(path2);
            try {
                FileUtils.deleteDirectory(file);
            } 
            catch (Exception ex) {
                System.out.println(ex);
            }
                JOptionPane.showMessageDialog(this, "Folder Deleted Successfully!!");     
       } 
    }//GEN-LAST:event_jButton5ActionPerformed
 public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new DriveMenus().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JProgressBar jProgressBar1;
    // End of variables declaration//GEN-END:variables
}
