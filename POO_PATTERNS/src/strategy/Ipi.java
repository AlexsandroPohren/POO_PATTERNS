package strategy;

public class Ipi extends Imposto {
	
private int aliquota;
	
	
	public Ipi(int codigo, String nome, int valor) {
		super(codigo, nome);
		this.aliquota = valor;
		
	}

	@Override
	public void calcularImposto() {
		this.Imposto = this.Imposto * (aliquota/100);
		
	}
	
}
