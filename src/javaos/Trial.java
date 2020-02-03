
package javaos;

import org.apache.commons.io.FileUtils;
public class Trial {
    public static void main(String[] args) {
        java.io.File file = new java.io.File("A:\\Github\\Services");
        long bn  = FileUtils.sizeOfDirectory(file);
        if((bn/1024)/1024 >42)
        {
            System.out.println("File Size Exceed");
        }
     
    }
}
