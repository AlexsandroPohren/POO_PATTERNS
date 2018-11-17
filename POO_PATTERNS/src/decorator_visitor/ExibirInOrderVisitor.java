package decorator_visitor;

public class ExibirInOrderVisitor implements CoquetelVisitor {

	@Override
	public void coquetel(Identificador identificador) {
		if (identificador == null)
			return;
		this.coquetel(identificador.getEsquerdo());
		System.out.println(identificador);
		this.coquetel(identificador.getDireito());
		
	}

}
