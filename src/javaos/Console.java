package javaos;
import java.io.IOException;
import java.awt.Desktop;
import java.io.File;

public class Console {
    public static int priority = 7;
 static Runtime rs =Runtime.getRuntime();
 static Desktop desktop = Desktop.getDesktop();
 static File folderToOpen;
    static void  runNotepad() {
        
     try{
         rs.exec("notepad");
     }
     catch(IOException e)
     {
         System.out.println(e);
     }
    }
    
     static void  runFolderOS() {
        try {
            folderToOpen = new File("C:\\Users\\harsh\\OneDrive\\Desktop\\OS");
            desktop.open(folderToOpen);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
    
    static void  runFolderPython() {
     try{
         folderToOpen = new File("C:\\Users\\harsh\\OneDrive\\Desktop\\Python");
         desktop.open(folderToOpen);
     }
     catch(IOException e)
     {
         System.out.println(e);
     }
    }
    
    static void runMusic1()
    {
        try{
            //rs.exec("cmd.exe /C \"C:\\Program Files\\VideoLAN\\VLC\\vlc.exe\" --playlist-autostart --playlist-tree C:\\Users\\harsh\\OneDrive\\Documents\\NetBeansProjects\\JavaOS\\src\\Music");
            rs.exec("cmd.exe /C start wmplayer \"C:\\\\Users\\\\harsh\\\\OneDrive\\\\Documents\\\\NetBeansProjects\\\\JavaOS\\\\src\\\\Music\\\\pokemon-battle.wav\"");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
     static void runMusic2()
    {
        try{
            //rs.exec("cmd.exe /C \"C:\\Program Files\\VideoLAN\\VLC\\vlc.exe\" --playlist-autostart --playlist-tree C:\\Users\\harsh\\OneDrive\\Documents\\NetBeansProjects\\JavaOS\\src\\Music");
            rs.exec("cmd.exe /C start wmplayer \"C:\\\\Users\\\\harsh\\\\OneDrive\\\\Documents\\\\NetBeansProjects\\\\JavaOS\\\\src\\\\Music\\\\StartSound.wav\"");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
      static void runVideo1()
    {
        try{
            //rs.exec("cmd.exe /C \"C:\\Program Files\\VideoLAN\\VLC\\vlc.exe\" --playlist-autostart --playlist-tree C:\\Users\\harsh\\OneDrive\\Documents\\NetBeansProjects\\JavaOS\\src\\Music");
            rs.exec("cmd.exe /C start wmplayer \"C:\\\\Users\\\\harsh\\\\OneDrive\\\\Documents\\\\NetBeansProjects\\\\JavaOS\\\\src\\\\Music\\\\TheGreatHack.mkv\"");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
       static void runVideo2()
    {
        try{
            //rs.exec("cmd.exe /C \"C:\\Program Files\\VideoLAN\\VLC\\vlc.exe\" --playlist-autostart --playlist-tree C:\\Users\\harsh\\OneDrive\\Documents\\NetBeansProjects\\JavaOS\\src\\Music");
            rs.exec("cmd.exe /C start wmplayer \"C:\\\\Users\\\\harsh\\\\OneDrive\\\\Documents\\\\NetBeansProjects\\\\JavaOS\\\\src\\\\Music\\\\horrible_bosses_2.mp4\"");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
   static void  runFolderDBMS() {   
     try{
         folderToOpen = new File("C:\\Users\\harsh\\OneDrive\\Desktop\\DBMS");
         desktop.open(folderToOpen);
     }
     catch(IOException e)
     {
         System.out.println(e);
     }
    }
}
