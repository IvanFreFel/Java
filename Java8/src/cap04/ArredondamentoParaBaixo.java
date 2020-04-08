package cap04;

import javax.swing.JOptionPane;

public class ArredondamentoParaBaixo {
    public static void main(String[] args) {
        float nota = Float.parseFloat(JOptionPane.showInputDialog("Nota da Prova"));
        JOptionPane.showMessageDialog(null,"Nota original: " + nota 
                + "\nArredondamento para baixo: " + Math.floor(nota));
    }
}
