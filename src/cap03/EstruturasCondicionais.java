package cap03;

import javax.swing.JOptionPane;

public class EstruturasCondicionais {
    public static void main(String args[]){
        Object[] op = {"Masculino", "Feminino"};
        
        String resp = (String) JOptionPane.showInputDialog(
                null, //local da caixa de dialogo, null vai mostrar no centro
                "Selecione o sexo:\n", //msg exibida ao usuário
                "Pesquisa", //título da caixa de msg
                JOptionPane.PLAIN_MESSAGE, //Qual icone sera exibido na caixa de msg (interrogacao)
                null, ///img na caixa de msg
                op, // lista de opção, aqui definida pelo op um array de objetos
                "Masculino"); //opção selecionada por default
        if (resp == null){
            JOptionPane.showMessageDialog(null, "Você pressionou Cancel");
        }
        if (resp == "Masculino"){
            JOptionPane.showMessageDialog(null, "Você é homem");
        }
        if (resp == "Feminino"){
            JOptionPane.showMessageDialog(null, "Você é mulher");
        }
        System.exit(0);
    }
}
