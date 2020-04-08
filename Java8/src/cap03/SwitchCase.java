package cap03;
import javax.swing.*;
public class SwitchCase {
    public static void main(String[] args) {
        String mes = JOptionPane.showInputDialog("foneça o número do mês.");
        if(mes != null){
            switch (mes){
                case "1":
                    mes = "Janeiro";
                    break;
                case "2":
                    mes = "FEVEREIRO";
                    break;
                case "3":
                    mes = "Março";
                    break;
                case "4":
                    mes = "Abril";
                    break;
                case "5":
                    mes = "Maio";
                    break;
                case "6":
                    mes = "Junho";
                    break;
                case "7":
                    mes = "Julho";
                    break;
                case "8":
                    mes = "Agosto";
                    break;
                case "9":
                    mes = "Setembro";
                    break;
                case "10":
                    mes = "Outrubro";
                    break;
                case "11":
                    mes = "Novembro";
                    break;
                case "12":
                    mes = "Dezembro";
                    break;
                default:
                    mes ="Mês Desconhecido";
            }
             JOptionPane.showMessageDialog(null, mes);
        }
        System.exit(0);
    }
}
