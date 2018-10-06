package strategy;

public abstract class Imposto {
	
	protected int codigo;
	protected String nome;
	protected Double Imposto;
	
	public Imposto(int codigo, String nome) {
	
		this.codigo = codigo;
		this.nome = nome;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	@Override
	public String toString() {
		return "Impostos [codigo=" + codigo + ", nome=" + nome + "]";
	}
	
	public abstract void calcularImposto();

}
