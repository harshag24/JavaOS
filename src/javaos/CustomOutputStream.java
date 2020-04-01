
package javaos;
import java.io.IOException;
import java.io.OutputStream;
import javax.swing.JTextArea;
public class CustomOutputStream  extends OutputStream{

    private final JTextArea textArea;
    
public CustomOutputStream(JTextArea textArea) {
        this.textArea = textArea;
    }
    @Override
    public void write(int i) throws IOException {
        textArea.append(String.valueOf((char)i));
        textArea.setCaretPosition(textArea.getDocument().getLength());
    }

}
