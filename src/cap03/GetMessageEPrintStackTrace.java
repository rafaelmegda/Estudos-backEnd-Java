package cap03;

import javax.swing.JOptionPane;

public class GetMessageEPrintStackTrace {
    public static void main(String args[]){
        int x = Integer.parseInt(JOptionPane.showInputDialog("Forneça um numero: "));
        
        try {
            int y = x / 0; // vai gerar exceção de divisão por zeros
        } catch (Exception erro) { //esse erro eu posso colocar o nome que eu quiser!
            JOptionPane.showMessageDialog(null, erro.getMessage());
            erro.printStackTrace();
        }
    }
}
