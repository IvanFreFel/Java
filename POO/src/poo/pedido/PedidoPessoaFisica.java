package poo.pedido;

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
		System.out.printf("\n---------------------------------------------------------\n");
		System.out.printf("Valor do pedido: R$ %.2f", getQuantidade()*getValorUnit());
		System.out.printf("\n---------------------------------------------------------\n");
	}
	@Override
	void descAvista(){
		System.out.printf("---------------------------------------------------------\n");
		System.out.printf("Valor do pedido: R$ %.2f", getQuantidade()*getValorUnit());
		double avista = getQuantidade()*getValorUnit()*0.05;
		this.pedido=avista;
		System.out.printf("\nvalor do desconto: R$ %.2f", getPedido());
		System.out.printf("\nvalor do pedido com desconto: R$ %.2f", getQuantidade()*getValorUnit()-getPedido());
		System.out.printf("\n---------------------------------------------------------\n");
		System.out.println(" ");
	}
	@Override
	void jurosAprazo(){
		System.out.printf("---------------------------------------------------------\n");
		System.out.printf("Valor do pedido: R$ %.2f", getQuantidade()*getValorUnit());
		double aprazo = getQuantidade()*getValorUnit()*0.03;
		this.pedido=aprazo;
		System.out.printf("\nvalor do acrescimo: R$ %.2f", getPedido());
		System.out.printf("\nvalor do pedido com acrescimo: R$ %.2f", getQuantidade()*getValorUnit()+getPedido());
		System.out.printf("\n---------------------------------------------------------\n");
		System.out.println(" ");
	}
	
}