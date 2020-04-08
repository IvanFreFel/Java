package poo.pedido;

public class TestePedido{
	public static void main (String[] args){
		PedidoPessoaFisica pf = new PedidoPessoaFisica(123, 42, 1.2,"221.222..143-87");
		PedidoPessoaJuridica pj = new PedidoPessoaJuridica(321, 25, 5.6, "123.435.567.45");
		
		
		System.out.println("------------------------ À vista ------------------------");
		pf.valorPedido();
		pf.descAvista();
		pf.jurosAprazo();
		
		
		System.out.println("------------------------ À prazo ------------------------");
		pj.valorPedido();
		pj.descAvista();
		pj.jurosAprazo();
		pj.imprimirNotaFiscal();
	}
}
