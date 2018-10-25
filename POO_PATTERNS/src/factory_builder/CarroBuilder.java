package factory_builder;

import java.io.File;

public class CarroBuilder {
	
	private Carro carro;
	
	public CarroBuilder (Carro carro){
		this.carro = carro;
	}
	
	public CarroBuilder nome(String nome){
		carro.setNome(nome);
		return this;
	}

	public CarroBuilder cor(String cor){
		carro.setCor(cor);
		return this;
	}
	
	public CarroBuilder anoFabricacao(double anoFabricacao){
		carro.setAnoFabricacao(anoFabricacao);
		return this;
	}
	
	public CarroBuilder montadora (String montadora){
		carro.getMontadoras().add(montadora);
		return this;
	}
	
	public CarroBuilder acessorio (String acessorio){
		carro.getAcessorios().add(acessorio);
		return this;
	}
}


