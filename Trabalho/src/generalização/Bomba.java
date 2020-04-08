package generalizacao;

public class Bomba extends Equipamento {
	private String pressaoSuccao;
	private String pressaoDescarga;
	private int taxaDeFluxo;
	
	//
	public Bomba (String marca, String modelo,int anoFabricacao, Double valor, String pressaoSuccao, String pressaoDescarga, int taxaDeFluxoString){
		super(marca, modelo, anoFabricacao, valor);
		this.pressaoSuccao = pressaoSuccao;
		this.pressaoDescarga = pressaoDescarga;
		this.taxaDeFluxo = taxaDeFluxo;
	}
	public String getPressaoSuccao(){
		return pressaoSuccao;
	}
	public void setPressaoSuccao (String pressaoSuccao ){
		this.pressaoSuccao=pressaoSuccao;
	}
	public String getPressaoDescarga(){
		return pressaoDescarga;
	}
	public void setPressaoDescarga(String pressaoDescarga){
		this.pressaoDescarga=pressaoDescarga;
	}
	public int getTaxaDeFluxo(){
		return taxaDeFluxo;
	}
	public void setTaxaDeFluxo(int taxaDeFluxo){
		this.taxaDeFluxo=taxaDeFluxo;
	}
	@Override
	public String toString(){
		return "Dados do bomba" + "\n"+
				"--> Marca: " + getMarca() + "\n" +
				"--> Modelo: " + getModelo() + "\n" +
				"--> Ano de Fabricação: " + getAnoFabricacao() + "\n" +
				"--> Valor: " + getValor() + "\n" +
				"--> Pressão de Sucção: " + getPressaoSuccao() +"\n" +
				"--> Pressão de Descarga: " + getPressaoDescarga() + "\n" +
				"--> Evação: " + getTaxaDeFluxo();
	}
}
