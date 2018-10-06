package composicao;

public class Categoria {
	
	private String descricao;
	private String nome;
	
	
	public Categoria(String descricao, String nome) {
		
		this.descricao = descricao;
		this.nome = nome;
	}
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	

}
