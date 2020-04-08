package poo.pedido;
class PedidoPessoaJuridica extends Pedido{
	
	private String cnpj;
	
	PedidoPessoaJuridica(int numero, int quantidade, double valorUnit, String cnpj){
		super(numero, quantidade, valorUnit);
		this.cnpj=cnpj;
	}
	
	String getCpf(){
		return cnpj;
	}
	void setCpf(String cnpj){
		this.cnpj=cnpj;
	}
	@Override
	void valorPedido(){
		System.out.printf("Valor do pedido: R$ %.2f", total());
		System.out.printf("-----------------------------------\n");
	}
	@Override
	void descAvista(){
		System.out.printf("Valor do pedido: R$ %.2f", total());
		double avista = total()*0.07;
		this.pedido=avsista;
		System.out.printf("valor do desconto: R$ %.2f", getPedido());
		System.out.printf("valor do pedido com desconto: R$ %.2f", total()-getPedido);
		System.out.printf("-----------------------------------\n");
	}
	@Override
	void jurosAprazo(){
		System.out.printf("Valor do pedido: R$ %.2f", total());
		double aprazo = total()*0.02;
		this.pedido=aprazo;
		System.out.printf("valor do acréscimo: R$ %.2f", getPedido());
		System.out.printf("valor do pedido com acréscimo: R$ %.2f", total()+getPedido);
		System.out.printf("-----------------------------------\n");
		this.pedido=total()+getPedido();
	}
	void imprimirNotaFiscal(){
		
	}
}
