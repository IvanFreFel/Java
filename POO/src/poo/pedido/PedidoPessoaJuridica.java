package poo.pedido;

public class PedidoPessoaJuridica extends Pedido{
	
	private String cnpj;
	
	PedidoPessoaJuridica(int numero, int quantidade, double valorUnit, String cnpj){
		super(numero, quantidade, valorUnit);
		this.cnpj=cnpj;
	}
	
	String getCnpj(){
		return cnpj;
	}
	void setCnpj(String cnpj){
		this.cnpj=cnpj;
	}
	@Override
	void valorPedido(){
		System.out.printf("Valor do pedido: R$ %.2f", getQuantidade()*getValorUnit());
		System.out.printf("\n---------------------------------------------------------\n");
	}
	@Override
	void descAvista(){
		System.out.printf("---------------------------------------------------------\n");
		System.out.printf("Valor do pedido: R$ %.2f", getQuantidade()*getValorUnit());
		double avista = getQuantidade()*getValorUnit()*0.07;
		this.pedido=avista;
		System.out.printf("\nvalor do desconto: R$ %.2f", getPedido());
		System.out.printf("\nvalor do pedido com desconto: R$ %.2f", getQuantidade()*getValorUnit()-getPedido());
		System.out.printf("\n---------------------------------------------------------");
		System.out.println(" ");
	}
	@Override
	void jurosAprazo(){
		System.out.printf("---------------------------------------------------------\n");
		System.out.printf("Valor do pedido: R$ %.2f", getQuantidade()*getValorUnit());
		double aprazo = getQuantidade()*getValorUnit()*0.02;
		this.pedido=aprazo;
		System.out.printf("\nvalor do acrescimo: R$ %.2f", getPedido());
		System.out.printf("\nvalor do pedido com acrescimo: R$ %.2f", getQuantidade()*getValorUnit()+getPedido());
		System.out.printf("\n---------------------------------------------------------\n");
		System.out.println(" ");
	}
	void imprimirNotaFiscal(){
		System.out.println("----------------NOTA FISCAL PESSAO JURIDICA--------------");
		System.out.println("---------------------------------------------------------");
		System.out.println("---------------------------CNPJ--------------------------");
		System.out.println(getCnpj());
		System.out.println("------------------------QUANTIDADE-----------------------");
		System.out.println(getQuantidade());
		System.out.println("----------------------VALOR UNITARIO---------------------");
		System.out.printf("R$ %.2f",getValorUnit(), "\n");
		System.out.println("\n-----------------------TOTAL PEDIDO---------------------");
		System.out.printf("R$ %.2f", getPedido(),"\n");
	}
}
