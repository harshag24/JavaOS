/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaos;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.swing.JOptionPane;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

/**
 *
 * @author harsh agrawal
 */
public class Music {
    public  void main(String[] args) {
        music("Music\\\\StartSound.wav");
    }
    public static void music(String song)
    {
        InputStream str;
        try
        {
            str = new FileInputStream(new File(song));
            AudioStream audios = new  AudioStream(str);
            AudioPlayer.player.start(audios);
        }
        catch(IOException e)
        {
            JOptionPane.showMessageDialog(null, "Error!!");
        }
    }
    
}
