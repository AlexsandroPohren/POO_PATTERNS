package decorator_visitor;

public class ExibirPreOrderVisitor implements CoquetelVisitor {

	@Override
	public void coquetel(Identificador identificador) {
		if (identificador == null)
			return;
		System.out.println(identificador);
		coquetel(identificador.getEsquerdo());
		coquetel(identificador.getDireito());
		
	}

}
