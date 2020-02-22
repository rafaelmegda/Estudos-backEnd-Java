package cap03;

import java.io.*;
import javax.swing.JOptionPane;

public class UsoDoThrows {
    public static void main (String args[]) throws IOException {
        String frase = JOptionPane.showInputDialog("Entre com uma frase: ");
        try {
            FileWriter file = new FileWriter("C:/Users/rafae/Desktop/Java/Estudos-backEnd-Java/src/cap03/temp/frases.txt", true);
            PrintWriter out = new PrintWriter (file);
            out.println(frase);
            file.close();
            out.close();
            JOptionPane.showMessageDialog(null, "Frase armazenada no arquivo!");
        } catch (FileNotFoundException erro) {
            JOptionPane.showMessageDialog(null, "Erro, verifique se a pasta /temp existe!");
        }
    }
    
}
