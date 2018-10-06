package strategy;

public class Icms extends Imposto{
	
	private int valorFrete;
	
	
	public Icms(int codigo, String nome, int valor) {
		super(codigo, nome);
		this.valorFrete = valor;
		
	}

	@Override
	public void calcularImposto() {
		this.Imposto = this.Imposto + valorFrete;
		
	}

}
