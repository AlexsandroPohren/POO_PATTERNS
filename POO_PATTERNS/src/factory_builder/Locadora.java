package factory_builder;

public class Locadora {
	
private CarroFactory carrofactory;
	
	public Locadora (CarroFactory cf){
		this.carrofactory = cf;
	}
	
	public ICarro alugar(String tipo){
		return carrofactory.getCarro(tipo);
	}

}
