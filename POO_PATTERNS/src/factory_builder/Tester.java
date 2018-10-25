package factory_builder;


public class Tester {

	public static void main(String[] args) {
	
		CarroFactory cf = new CarroFactory();
		
		DepartamentoDeRH rh = new DepartamentoDeRH(cf);
		
		ICarro novo = rh.contratar("SUV");
		
		System.out.println(novo.getCargo());
		
		Carro carro = new Carro("Honda","HRV",2019,"Cinza");
		
		CarroBuilder cb = new CarroBuilder(carro);
		
			cb
			
				.montadora("Honda")
				.nome("HRV")
				.anoFabricacao(2019)
				.cor("Cinza")
				.acessorio("Ar Condicionado")
				.acessorio("Rodas de Liga Leve")
				.acessorio("Central Multimidea")
				.acessorio("Sensor de estacionamento")
				.acessorio("Camera de Ré")
				.acessorio("Farol de Milha");
			
			System.out.println(carro);

	}

	}

