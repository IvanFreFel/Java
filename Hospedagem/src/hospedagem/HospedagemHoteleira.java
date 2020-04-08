package hospedagem;

import java.util.Scanner;
import java.io.*;

public class HospedagemHoteleira {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String nomeHospedi;
		int dias, cpf, pagamento, parcela;
		double diaria, total, parcelamento;
		
		//Informa��es basicas do cliente
		System.out.printf("Informe o nome do hospedi: \n");
		nomeHospedi = sc.nextLine();
		System.out.printf("Informe quantos dias o hospedi pretende ficar: \n");
		dias = sc.nextInt();
		System.out.printf("Informe o valor da di�ria: \n");
		diaria = sc.nextDouble();
		System.out.printf("Informe a forma de pagamento:\n 1 - � vista \n 2 - Cart�o parceledo \n");
		pagamento = sc.nextInt();
		
		total = diaria * dias;
			
		FileWriter fw = new FileWriter("C:\\Users\\Black\\Documents\\Arquivos\\Hopedagem.txt");
		PrintWriter pw = new PrintWriter(fw);
		
		if(pagamento == 1){
			total = total - (total * 0.12) ;
			
			pw.printf("--------- Hogwats Hotel ---------%n");
			pw.printf("--- Comprovante de Hospedagem ---%n");
			pw.printf("\n * Hospedi: %S %n", nomeHospedi);
			pw.printf("\n * Dias hospedados: %d %n", dias);
			pw.printf("\n * Valor da di�ria: R$ %.2f %n", diaria);
			pw.printf("\n * Valor total da di�ria: R$ %.2f %n", total);
		}else {
			System.out.printf("Informe a quantidade de parcela: \n");
			parcela = sc.nextInt();
			total = total + (total * 0.02) ;
			parcelamento = total / parcela;
			pw.printf("--------- Hogwats Hotel ---------%n");
			pw.printf("--- Comprovante de Hospedagem ---%n");
			pw.printf("\n * Hospedi: %S %n", nomeHospedi);
			pw.printf("\n * Dias hospedados: %d %n", dias);
			pw.printf("\n * Valor da di�ria: R$ %.2f %n", diaria);
			pw.printf("\n * Valor da parcela: %d X R$ %.2f %n", parcela, parcelamento);
			pw.printf("\n * Valor total da di�ria: R$ %.2f %n", total);
		}
		
		
		
		fw.close();
		System.out.printf("\n Comprovante emitido com sucesso!");
	}

}