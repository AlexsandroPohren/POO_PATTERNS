package strategy;

public class Icms extends Imposto{
	
	private int valor;
	
	
	public Icms(int codigo, String nome, int valor) {
		super(codigo, nome);
		this.valor = valor;
		
	}

	@Override
	public void calcularImposto() {
		this.Imposto = this.Imposto+(valor *0.10);
		
	}
	

}
