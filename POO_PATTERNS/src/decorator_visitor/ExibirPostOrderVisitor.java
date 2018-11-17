package decorator_visitor;

public class ExibirPostOrderVisitor implements CoquetelVisitor {

	@Override
	public void coquetel(Identificador identificador) {
		if (identificador == null)
			return;
		coquetel(identificador.getEsquerdo());
		coquetel(identificador.getDireito());
		System.out.println(identificador);
		
	}

}
