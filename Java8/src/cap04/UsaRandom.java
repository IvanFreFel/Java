package cap04;
import javax.swing.JOptionPane;
public class UsaRandom {
    public static void main(String[] args) {
        String senha = "";
        for(int i = 1; i <= 10; i++){
            int num = (int) (Math.random()*10);
            senha += num;
        }
        JOptionPane.showMessageDialog(null, "Senha gerada: " + senha);
        
        for(int cartao = 1; cartao <= 4; cartao++){
            String numeroCartao = "";
            for(int numCartao = 1; numCartao <= 6; numCartao++){ // qtde de número por cartão
                int num = (int) (Math.random() * 100);
                numeroCartao += num + "    ";
            }
            JOptionPane.showMessageDialog(null, "Números do cartão: " + cartao 
                    + "\n" + numeroCartao);
        }
        System.exit(0);
    }
}
