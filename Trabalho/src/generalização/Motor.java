package generalizacao;

public class Motor extends Equipamento{
	private String velocidade;
	private String potencia;

	public Motor (String marca, String modelo,int anoFabricacao, Double valor, String velocidade, String potencia){
		super(marca, modelo, anoFabricacao, valor);
		this.velocidade=velocidade;
		this.potencia=potencia;
	}
	
	public String getVelocidade(){
		return velocidade;
	}
	
	public void setVelocidade (String velocidade ){
		this.velocidade=velocidade;
	}
	
	public String getPotencia(){
		return potencia;
	}
	
	public void setPotencia(String potencia){
		this.potencia=potencia;
	}
	@Override
	public String toString(){
		return "Dados do motor" + "\n" +
				"--> Marca: " + getMarca() + "\n" +
				"--> Modelo: " + getModelo() + "\n" +
				"--> Ano de Fabricação: " + getAnoFabricacao() + "\n" +
				"--> Valor: " + getValor() + "\n" +
				"--> Velocidade: " + getVelocidade() + "\n" +
				"--> Potencia: " + getPotencia();
	}
}
