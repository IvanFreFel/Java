package poo.out;

public class PedidoPessoaFisica extends Pedido{
private String cpf;
	
	PedidoPessoaFisica(int numero, int quantidade, double valorUnit, String cpf){
		super(numero, quantidade, valorUnit);
		this.cpf=cpf;
	}
	
	String getCpf(){
		return cpf;
	}
	void setCpf(String cpf){
		this.cpf=cpf;
	}

	@Override
	void valorPedido(){
		System.out.printf("Valor do pedido: R$ %.2f", getTotal());
		System.out.printf("-----------------------------------\n");
	}
	@Override
	void descAvista(){
		System.out.printf("Valor do pedido: R$ %.2f", getTotal());
		double avista = getTotal()*0.05;
		this.pedido=avista;
		System.out.printf("valor do desconto: R$ %.2f", getPedido());
		System.out.printf("valor do pedido com desconto: R$ %.2f", getTotal()-getPedido());
		System.out.printf("-----------------------------------\n");
	}
	@Override
	void jurosAprazo(){
		System.out.printf("Valor do pedido: R$ %.2f", getTotal());
		double aprazo = getTotal()*0.03;
		this.pedido=aprazo;
		System.out.printf("valor do desconto: R$ %.2f", getPedido());
		System.out.printf("valor do pedido com desconto: R$ %.2f", getTotal()+getPedido());
		System.out.printf("-----------------------------------\n");
	}
	
	
}
