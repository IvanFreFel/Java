package poo.pedido;

abstract class Pedido{
	
	private int numero, quantidade;
	private double valorUnit;
	protected double pedido;
	
	Pedido(int numero, int quantidade, double valorUnit){
		this.numero=numero;
		this.quantidade=quantidade;
		this.valorUnit=valorUnit;
	}
	
	abstract void valorPedido();
	abstract void descAvista();
	abstract void jurosAprazo();
	void imprimirNotaFiscal(){
		
	}
	
	int getNumero(){
		return numero;
	}
	void setNumero(int numero){
		this.numero=numero;
	}
	int getQuantidade(){
		return quantidade;
	}
	void setQuantidade(int quantidade){
		this.quantidade=quantidade;
	}
	double getValorUnit(){
		return valorUnit;
	}
	void setValorUnit(double valorUnit){
		this.valorUnit=valorUnit;
	}
	double getPedido(){
		return pedido;
	}
	void setPedido(double pedido){
		this.pedido=pedido;
	}
	double total(){
		double total = getQuantidade()*getValorUnit();
	}
}