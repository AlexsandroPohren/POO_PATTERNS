package factory_builder;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Carro {
	
	private List<String> montadoras = new ArrayList();
	private String nome;
	private String cor;
	private double anoFabricacao;
	private List<String> acessorios = new ArrayList();
	
	public Carro(String nome, String montadora, double anoFabricacao, String cor){
		this.nome = nome;
		this.anoFabricacao = anoFabricacao;
		this.cor = cor;
		this.addMontadora(montadora);;
		
	}
	
	public void addMontadora(String carro){
		this.montadoras.add(carro);
	}
	
	public void addAcessorio(String carro){
		this.acessorios.add(carro);
	}

	public List<String> getMontadoras() {
		return montadoras;
	}
	public void setMontadoras(List<String> montadoras) {
		this.montadoras = montadoras;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public double getAnoFabricacao() {
		return anoFabricacao;
	}
	public void setAnoFabricacao(double anoFabricacao) {
		this.anoFabricacao = anoFabricacao;	
	}
	
	public List<String> getAcessorios() {
		return acessorios;
	}

	public void setAcessorios(List<String> acessorios) {
		this.acessorios = acessorios;
	}

	@Override
	public String toString() {
		return "Carro [montadoras=" + montadoras + ", nome=" + nome + ", cor=" + cor + ", anoFabricacao="
				+ anoFabricacao + ", acessorios=" + acessorios + "]";
	}

	
	
}
	
	
	


