public class Produto {

	private String nome;
	private double preco;
	protected int qtd;
	private String marca;
	private String tam;

	public Produto(String nome, double preco, 
		int qtd, String marca, String tam){
		this.nome = nome;
		this.preco = preco;
		this.qtd = qtd;
		this.marca = marca;
		this.tam = tam;
	}

	public String getNome(){
		return this.nome;
	}
}




