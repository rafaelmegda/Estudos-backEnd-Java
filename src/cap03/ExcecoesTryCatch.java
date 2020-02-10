package cap03;

 import javax.swing.JOptionPane;

public class ExcecoesTryCatch {
    public static void main (String args[]){
        try {
            String aux1 = JOptionPane.showInputDialog("Forneça o valor do 1º Numero: ");
            int num1 = Integer.parseInt(aux1.toString());
            String aux2 = JOptionPane.showInputDialog("Forneça o valor do 2º Numero: ");
            int num2 = Integer.parseInt(aux2.toString());
            JOptionPane.showMessageDialog(null, "Soma = " + (num1 + num2));
            JOptionPane.showMessageDialog(null, "Subtração = " + (num1 - num2));
            JOptionPane.showMessageDialog(null, "Multiplicação = " + (num1 * num2));
            JOptionPane.showMessageDialog(null, "Divisão = " + (num1 / num2));
        } catch (ArithmeticException erro) {
            JOptionPane.showMessageDialog(null,
                    "Erro de divisão por zero!\n" + erro.toString(), 
                    "Erro", 
                    JOptionPane.ERROR_MESSAGE);
        } catch (NumberFormatException erro) {
            JOptionPane.showMessageDialog(null,
                    "Erro de conversão!\n" + erro.toString(), 
                    "Erro", 
                    JOptionPane.ERROR_MESSAGE);
        } catch (NullPointerException erro) {
            JOptionPane.showMessageDialog(null,
                    "Tecla Cancel pressionada!\n" + erro.toString(), 
                    "Cancelado pelo usuário", 
                    JOptionPane.ERROR_MESSAGE);
        }
        
        //Tratando os erros no mesmo bloco a partir do JAVA 7 usando o PIPE
        /*catch (ArithmeticException |  NumberFormatException erro) {
            JOptionPane.showMessageDialog(null,
                    "Erro!\n" + erro.toString(), 
                    "Erro", 
                    JOptionPane.ERROR_MESSAGE);
        }*/
        
        //Usando o FINALLY agora (SEMPRE VAI EXECUTAR, se houver exceções ou não)
        finally {
            JOptionPane.showMessageDialog(null, "Final da execução!");
        }
        System.exit(0);
    }
}
