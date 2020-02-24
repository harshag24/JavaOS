/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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

/**
 *
 * @author harsh agrawal
 */
public class Music {
    public  void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        music("Music\\\\StartSound.wav");
    }
      public static void music(String song)throws UnsupportedAudioFileException, 
        IOException, LineUnavailableException 
    {
        InputStream str;
        try
        {
//            str = new FileInputStream(new File(song));
            AudioInputStream  audioInputStream =  
                AudioSystem.getAudioInputStream(new File(song).getAbsoluteFile());
//            AudioStream audios = new  AudioStream(str);
//            AudioPlayer.player.start(audios);
            
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
