package cap02;
import java.io.*;
public class EntradaComBufferedReader {
    public static void main(String[] args) {
       String s;
        float largura, comprimento, area, perimetro;
        BufferedReader dado;
        try{
            System.out.println("entre com o comprimento");
            dado = new BufferedReader(new InputStreamReader(System.in));
            s = dado.readLine(); //deprecated
            comprimento = Float.parseFloat(s);
            
            System.out.println("entre coma a largura");
            dado = new BufferedReader(new InputStreamReader(System.in));
            s = dado.readLine(); // deprecated
            largura = Float.parseFloat(s);
            
            area = comprimento * largura;
            perimetro = comprimento * 2 + largura * 2;
            System.out.println("área do retângolo: " + area);
            System.out.println("área do perimetro: " + perimetro);
        }catch(IOException erro){
            System.out.println("Houve erro na entrada de dado" + erro.toString());
        }catch(NumberFormatException erro){
            System.out.println("HOuve erro na converção, digite apenas caracteres numéricos" + erro.toString());
        }
    }
}
