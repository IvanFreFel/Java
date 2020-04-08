package generalizacao;

public class Equipamento {
	private String marca, modelo;
	private int anoFabricacao;
	private Double valor;
	
	public Equipamento(String marca, String modelo,int anoFabricacao, Double valor){
		super();
		this.marca=marca;
		this.modelo=modelo;
		this.anoFabricacao=anoFabricacao;
		this.valor=valor;
	}
	public String getMarca(){
		return marca;
	}
	public void setMarca(String marca){
		this.marca=marca;
	}
	
	public String getModelo(){
		return modelo;
	}
	public void setModelo(String modelo){
		this.modelo=modelo;
	}
	
	public int getAnoFabricacao(){
		return anoFabricacao;
	}
	public void setAnoFabricacao(int anoFabricacao){
		this.anoFabricacao=anoFabricacao;
	}
	public Double getValor(){
		return valor;
	}
	public void setValor(Double valor){
		this.valor=valor;
	}
}
