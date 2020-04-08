package cap03;
import java.io.IOException;
import javax.swing.JOptionPane;
public class InstrucaoThrows {
    public static void main(String[] args) throws IOException {
        try{
            int idade = Integer.parseInt(JOptionPane.showInputDialog("Forneça sua idade"));
            if(idade <18){
                throw new Exception("Menor de Idade, entrada não permitida");
            } else {
                JOptionPane.showMessageDialog(null, idade + " Idade válida \nSeja Bem-Vindo");
            }
            //continua a execução normalmente
        } catch(Exception erro){
            JOptionPane.showMessageDialog(null, erro.toString());
        }
    }
}
