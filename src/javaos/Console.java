package javaos;
import java.io.IOException;
import java.awt.Desktop;
import java.io.File;

public class Console {
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
