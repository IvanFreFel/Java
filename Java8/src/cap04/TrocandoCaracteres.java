package cap04;
import javax.swing.JOptionPane;
public class TrocandoCaracteres{
    public static void main (String[] args){
        String frase = JOptionPane.showIputDialog("Foneça uma frase");
        JOptionPane.showMessageDialog(null, "Frase: " + frase + "\nRetiando os espaços: " + frase.replace("   "", "   ")  + " \nSubstituindo a por u: "+ frase.replace(a, u));
    System.exit(0);
    }
}