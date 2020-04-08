package poo.out;

public abstract class Pedido {
	
	private int numero, quantidade;
	private double valorUnit;
	protected double pedido,total;
	
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

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getValorUnit() {
		return valorUnit;
	}

	public void setValorUnit(double valorUnit) {
		this.valorUnit = valorUnit;
	}

	public double getPedido() {
		return pedido;
	}

	public void setPedido(double pedido) {
		this.pedido = pedido;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = getQuantidade()*getValorUnit();
	}
	
	
}
