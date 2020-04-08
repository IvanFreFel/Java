package poo.pedido;
class PedidoPessoaFisica extends Pedido{
	
	private String cpf;
	
	PedidoPessoaFisica(int numero, int quantidade, double valorUnit, String cpf){
		super(numero, quantidade, valorUnit);
		this.cpf=cpf;
	}
	
	String getCpf(){
		return cpf
	}
	void setCpf(String cpf){
		this.cpf=cpf;
	}
	@Override
	void valorPedido(){
		System.out.printf("Valor do pedido: R$ %.2f", total());
		System.out.printf("-----------------------------------\n");
	}
	@Override
	void descAvista(){
		System.out.printf("Valor do pedido: R$ %.2f", total());
		double avista = total()*0.05;
		this.pedido=avsista;
		System.out.printf("valor do desconto: R$ %.2f", getPedido());
		System.out.printf("valor do pedido com desconto: R$ %.2f", total()-getPedido);
		System.out.printf("-----------------------------------\n");
	}
	@Override
	void jurosAprazo(){
		System.out.printf("Valor do pedido: R$ %.2f", total());
		double aprazo = total()*0.03;
		this.pedido=aprazo;
		System.out.printf("valor do desconto: R$ %.2f", getPedido());
		System.out.printf("valor do pedido com desconto: R$ %.2f", total()+getPedido);
		System.out.printf("-----------------------------------\n");
	}
	
}