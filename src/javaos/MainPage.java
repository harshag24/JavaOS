
package javaos;



import java.awt.event.ActionEvent;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JOptionPane;


import javax.swing.Timer;

public class MainPage extends javax.swing.JFrame {
    
   static VideoList vl = new VideoList();
   static MusicList ml = new MusicList();
   static Terminal term = new Terminal();
   static AboutPage ap =new AboutPage();
   static MyComputer mc = new MyComputer();
    public static ArrayList <Integer>processes = new ArrayList(5);
    public static int semaphore = -1;
    
    public MainPage() {
        initComponents();
        
        Kernel32.SYSTEM_POWER_STATUS batteryStatus = new Kernel32.SYSTEM_POWER_STATUS();
        Kernel32.INSTANCE.GetSystemPowerStatus(batteryStatus);
        int size  = Integer.parseInt(batteryStatus.toString());
        
        jProgressBar1.setStringPainted(true);
        jProgressBar1.setValue((int) size);
        
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        Calendar calobj = Calendar.getInstance();
         jLabel9.setText(df.format(calobj.getTime()));
DateFormat dateandtime = new SimpleDateFormat("HH:mm:ss");
Timer t = new Timer(1000, (ActionEvent ae) -> {
    Date date = new Date();
   jLabel10.setText(dateandtime.format(date));
    repaint();
        });
t.start();
    
    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRunField = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Desktop");
        setBackground(new java.awt.Color(102, 10, 153));
        setBounds(new java.awt.Rectangle(10, 10, 1769, 796));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 1769, 769));
        setSize(new java.awt.Dimension(1769, 769));
        getContentPane().setLayout(null);

        jRunField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRunFieldActionPerformed(evt);
            }
        });
        getContentPane().add(jRunField);
        jRunField.setBounds(90, 640, 182, 30);

        jButton5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(252, 118, 106));
        jButton5.setText("Run");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(10, 640, 70, 30);

        jButton1.setBackground(new java.awt.Color(153, 255, 255));
        jButton1.setForeground(new java.awt.Color(153, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/mycomputer.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(32, 13, 70, 70);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("My Computer");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 90, 90, 17);

        jButton6.setBackground(new java.awt.Color(153, 255, 255));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/browser.png"))); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(30, 270, 70, 70);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Browser");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 350, 100, 22);

        jButton2.setBackground(new java.awt.Color(153, 255, 255));
        jButton2.setForeground(new java.awt.Color(153, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/notepadicon-01.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(30, 140, 71, 70);

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/untitled.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(30, 400, 71, 69);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Notepad");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 220, 120, 22);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Terminal");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 480, 90, 17);

        jButton7.setBackground(new java.awt.Color(153, 255, 255));
        jButton7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton7.setForeground(new java.awt.Color(153, 255, 255));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/music.jpg"))); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(180, 10, 70, 70);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Music Player");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(160, 90, 110, 17);

        jButton8.setBackground(new java.awt.Color(153, 255, 255));
        jButton8.setForeground(new java.awt.Color(153, 255, 255));
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/video_1.png"))); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8);
        jButton8.setBounds(180, 140, 70, 70);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Video Player");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(170, 220, 100, 22);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/about.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(180, 270, 70, 69);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("About");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(180, 350, 70, 17);
        getContentPane().add(jProgressBar1);
        jProgressBar1.setBounds(1280, 690, 50, 20);

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("DD/MM/YYYY");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(1100, 690, 80, 20);

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("HH:MM:SS");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(1190, 690, 70, 20);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/anime-minimalism-4k-4e-1920x1080.jpg"))); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(0, 0, 1360, 680);

        jButton9.setBackground(new java.awt.Color(51, 0, 0));
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/shutdown-1.png"))); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9);
        jButton9.setBounds(0, 680, 40, 30);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/taskbar.png"))); // NOI18N
        getContentPane().add(jLabel11);
        jLabel11.setBounds(-2, 676, 1360, 40);

        setBounds(0, 0, 1377, 764);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        int priority  = 1;
        if(semaphore==-1)
        {
            if(!priorityCheck(priority))
            JOptionPane.showMessageDialog(this,"Cannot Open !! Already 5 processes are running , please close them first");
            
            else{
            semaphore = 1;
            vl.setVisible(true);
            }
        }
        else
        {
           JOptionPane.showMessageDialog(this, "Cannot Open!! Music Panel is running in background");
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
       int priority  = 3;
        if( semaphore==-1)
        {
        if(!priorityCheck(priority))
                        JOptionPane.showMessageDialog(this,"Cannot Open !! Already 5 processes are running , please close them first");

        else{
            semaphore = 0; 
            ml.setVisible(true);
        }
        }
          else
        {
            JOptionPane.showMessageDialog(this, "Cannot Open!! Video Panel is running in background");
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jRunFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRunFieldActionPerformed

    }//GEN-LAST:event_jRunFieldActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        int priority  = 5;
        if(priorityCheck(priority))
        {
        try {
            Runtime.getRuntime().exec("cmd.exe /C start microsoft-edge:http://www.google.com");
        } catch (IOException ex) {
            Logger.getLogger(MainPage.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        else
        {
          JOptionPane.showMessageDialog(this,"Cannot Open !! Already 5 processes are running , please close them first");
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        String s =jRunField.getText().toUpperCase();
        jRunField.setText("");
        switch (s) {
            case "NOTEPAD":
            jButton2ActionPerformed(evt);
            break;
            case "TERMINAL":
            jButton3ActionPerformed(evt);
            break;
            case "MYPC":
            jButton1ActionPerformed(evt);
            break;
            case "ABOUT":
            jButton4ActionPerformed(evt);
            break;
            case "BROWSER":
            jButton6ActionPerformed(evt);
            break;
            case "MUSIC":
            jButton7ActionPerformed(evt);
            break;
            case "VIDEO":
            jButton8ActionPerformed(evt);
            break;
            default:
            JOptionPane.showMessageDialog(this, "Inavlid Command!!");
            break;
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int priority  = 7;
         if(priorityCheck(priority))
        {
        mc.setVisible(true);
        }
         else{
          JOptionPane.showMessageDialog(this,"Cannot Open !! Already 5 processes are running , please close them first");
         }
    }//GEN-LAST:event_jButton1ActionPerformed

    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
            int priority  = 8;
        if(priorityCheck(priority))
        {
        Console.runNotepad();
        }
         else{
          JOptionPane.showMessageDialog(this,"Cannot Open !! Already 5 processes are running , please close them first");
         }
    }//GEN-LAST:event_jButton2ActionPerformed

    
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       int priority  = 9;
       if(priorityCheck(priority))
        {
        
        ap.setVisible(true);
        }
       else{
          JOptionPane.showMessageDialog(this,"Cannot Open !! Already 5 processes are running , please close them first");
         }
    }//GEN-LAST:event_jButton4ActionPerformed

    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
int priority  = 10;
if(priorityCheck(priority))
        {
        
        term.setVisible(true);
        }
        else{
          JOptionPane.showMessageDialog(this,"Cannot Open !! Already 5 processes are running , please close them first");
         }
    }//GEN-LAST:event_jButton3ActionPerformed

    
    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
         try {
            Music.music("Music\\\\shutdown.wav");
            Thread.sleep(2000);
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException | InterruptedException ex) {
            Logger.getLogger(MainPage.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.exit(0);
    }//GEN-LAST:event_jButton9ActionPerformed

    public static boolean priorityCheck(int priority)
    {
        if(processes.size()>=5)
        {
            for(int i=0;i<processes.size();i++)
            {
                if(priority > processes.get(i))
                {
                    System.out.println(processes);
                    processes.remove(i);  
                    switch (processes.get(i)) {
                        case 1:
                            vl.setVisible(false);
                            break;
                        case 3:
                            ml.setVisible(false);
                            break;
                        case 5:
                            break;
                        case 7:
                            mc.setVisible(false);
                            break;
                        case 8:            
                            break;
                        case 9:
                            ap.setVisible(false);
                            break;
                        case 10:
                            term.setVisible(false);
                            break;
                        default:
                            break;
                    }
                    processes.add(priority);
                    return true;
                }
            }
            return false;
        }
        else{
            
            processes.add(priority);
            return true;
            }
    }
    
    public static void main(String args[]) {
        
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
        
    
        java.awt.EventQueue.invokeLater(() -> {
            new MainPage().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JTextField jRunField;
    // End of variables declaration//GEN-END:variables
}
