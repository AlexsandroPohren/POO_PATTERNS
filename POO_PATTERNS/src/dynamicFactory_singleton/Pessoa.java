package dynamicFactory_singleton;

public class Pessoa {
	
	private int id;
	private String nome;
	private int idade;
	private String endereco;
	private String profissao;
	
	public Pessoa(int id, String nome, int idade, String endereco, String profissao) {

		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.endereco = endereco;
		this.profissao = profissao;
	}
	
	public Pessoa() {

	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	
	@Override
	public String toString() {
		return "Pessoa [id=" + id + ", nome=" + nome + ", idade=" + idade + ", endereco=" + endereco + ", profissao="
				+ profissao + "]";
	}

}
