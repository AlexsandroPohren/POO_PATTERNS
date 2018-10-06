package strategy;

public class Ipi extends Imposto {
	
private int valor;
	
	
	public Ipi(int codigo, String nome, int valor) {
		super(codigo, nome);
		this.valor = valor;
		
	}

	@Override
	public void calcularImposto() {
		this.Imposto = this.Imposto+(valor *0.20);
		
	}
	

}
