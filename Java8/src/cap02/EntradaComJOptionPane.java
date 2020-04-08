package cap02;
import javax.swing.JOptionPane;
public class EntradaComJOptionPane {
    public static void main(String[] args) {
        String aux;
        float comprimento, largura, area, perimetro;
        try{
            aux = JOptionPane.showInputDialog("entre com o comprimento");
            comprimento = Float.parseFloat(aux);
            
            aux = JOptionPane.showInputDialog("entra com a lagura");
            largura = Float.parseFloat(aux);
            
            area = comprimento * largura;
            perimetro = comprimento * 2 + largura * 2;
            JOptionPane.showMessageDialog(null,"área: " + area + ", Perimetro: " + perimetro);
        }catch(NumberFormatException erro){
            JOptionPane.showMessageDialog(null, "Houve erro na conversão, digite apenas caracteres numéricos" + erro.toString());
        }
        System.exit(0);
    }
}