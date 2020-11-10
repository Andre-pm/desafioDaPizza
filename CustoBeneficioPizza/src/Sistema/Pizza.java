package Sistema;

public class Pizza {

	private String descricao;
	private double tamanho;
	private double valor;

	public Pizza(String descricao, double tamanho, double valor) {
		setDescricao(descricao);
		setTamanho(tamanho);
		setValor(valor);
	}
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getTamanho() {
		return tamanho;
	}
	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}


}
