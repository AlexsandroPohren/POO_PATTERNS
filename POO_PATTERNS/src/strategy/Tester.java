package strategy;

public class Tester {
	
public static void main(String[] args) {
		
		Imposto icms = new Icms(1,"ICMS",150);
		
		Imposto ipi = new Ipi(2,"IPI",200);
		
		CalculadoraDeImpostos ci = new CalculadoraDeImpostos();
		
		ci.calcularImposto(icms);
		System.out.println(icms);
		
		ci.calcularImposto(ipi);
		System.out.println(ipi);

	}

}
