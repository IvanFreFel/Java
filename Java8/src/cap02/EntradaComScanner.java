package cap02;
import java.util.*;
public class EntradaComScanner {
    public static void main(String[] args) {
        float largura, comprimento, area, perimetro;
        Scanner sc;
        try{
            System.out.println("entre com o comprimento");
            sc = new Scanner(System.in);
            comprimento = sc.nextFloat();
            
            System.out.println("entre coma a largura");
            sc = new Scanner(System.in);
            largura = sc.nextFloat();
            
            area = comprimento * largura;
            perimetro = comprimento * 2 + largura * 2;
            System.out.println("área do retângolo: " + area);
            System.out.println("área do perimetro: " + perimetro);
        }catch(NumberFormatException e){
            System.out.println("HOuve erro na converção, digite apenas caracteres numéricos");
        }
    }
}
