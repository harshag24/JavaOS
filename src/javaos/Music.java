
package javaos;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JOptionPane;

public class Music {
    public  void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
     
    }
      public static void music(String song)throws UnsupportedAudioFileException, 
        IOException, LineUnavailableException 
    {
        InputStream str;
        try
        {

            AudioInputStream  audioInputStream =  
            AudioSystem.getAudioInputStream(new File(song).getAbsoluteFile());        
           Clip clip = AudioSystem.getClip(); 
           clip.open(audioInputStream); 
           clip.start();
        }
        catch(IOException e)
        {
            JOptionPane.showMessageDialog(null, "Error!!");
        }
    }
    
}
