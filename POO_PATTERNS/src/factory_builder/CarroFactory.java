package factory_builder;


public class CarroFactory {
	
	public ICarro getCarro(String tipo){
		ICarro carro = null;
		
		if (tipo.equalsIgnoreCase("SUV")){
			carro = new SUV();
		} else if (tipo.equalsIgnoreCase("Hatch")){
			carro = new Hatch();
		} else if (tipo.equalsIgnoreCase("Sedan")){
			carro = new Sedan();
		}
		
		return carro;
	}

}
