package decorator_visitor;


public class ExibirIndentadoVisitor implements CoquetelVisitor {

	@Override
	public void coquetel(Identificador identificador) {
		if (identificador == null) {
			return;
		}
		System.out.println(identificador);
		coquetel(identificador.getEsquerdo(), 1);
		coquetel(identificador.getDireito(), 1);
	}

	private void coquetel(Identificador identificador, int qtdEspacos) {
		if (identificador == null) {
			return;
		}
		for (int i = 0; i < qtdEspacos; i++) {
			System.out.print("-");
		}
		System.out.println(identificador);
		coquetel(identificador.getEsquerdo(), qtdEspacos + 1);
		coquetel(identificador.getDireito(), qtdEspacos + 1);
	}
}
