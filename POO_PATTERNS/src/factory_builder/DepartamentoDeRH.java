package factory_builder;

public class DepartamentoDeRH {
	
private CarroFactory carrofactory;
	
	public DepartamentoDeRH (CarroFactory cf){
		this.carrofactory = cf;
	}
	
	public ICarro contratar(String tipo){
		return carrofactory.getCarro(tipo);
	}

}
