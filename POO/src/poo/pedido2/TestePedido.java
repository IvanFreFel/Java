package poo.pedido;
public class TestePedido{
	public static void main (String[] args){
		PedidoPessoaFisca pf = new PedidoPessoaFisica(123,42,1.2,"221.222..143-87");
		PedidoPessoaJuridica pj = new PedidoPessoaJuridica(321,25,5.6,"123.435.567.45");
		
		pf.valorPedido();
		pf.descAvista();
		pf.jurosAprazo();
		
		pj.valorPedido();
		pj.descAvista();
		pj.jurosAprazo();
		pj.imprimirNotaFiscal();
	}
}
