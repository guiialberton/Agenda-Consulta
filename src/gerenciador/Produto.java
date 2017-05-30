package gerenciador;

public class Produto {
	private Integer id;
	private String nome;
	private Double preco;
	public Produto(String nome, Double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
	public String toString(){
		return String.format("(%d, %s, %.2f)", this.getId(), this.getNome(), this.getPreco());
	}
	
	
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Produto(Integer id, String nome, Double preco) {
		this(nome,preco);
		this.id=id;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	
}
