package decorator_visitor;

public class CoquetelBinario {
	
	Identificador raiz;
	int quantidadeDeElementos;

	public CoquetelBinario(int chaveRaiz) {
		raiz = new Identificador(chaveRaiz);
		quantidadeDeElementos = 0;
	}

	public void inserir(int chave) {
		inserir(chave, raiz);
	}
	
	public void remover(int chave){
	}
	
	public void buscar(int chave){
		
	}

	private void inserir(int chave, Identificador identificador) {
		if (identificador.getChave() == chave)
			return;
		if (chave > identificador.getChave()) {
			if (identificador.getDireito() == null) {
				identificador.setDireito(new Identificador(chave));
				quantidadeDeElementos++;
				return;
			}
			inserir(chave, identificador.getDireito());
		} else {
			if (identificador.getEsquerdo() == null) {
				identificador.setEsquerdo(new Identificador(chave));
				quantidadeDeElementos++;
				return;
			}
			inserir(chave, identificador.getEsquerdo());
		}
	}

	public void aceitarCoquetel(CoquetelVisitor visitor) {
		visitor.coquetel(raiz);
	}

}
