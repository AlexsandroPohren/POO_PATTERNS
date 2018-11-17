package decorator_visitor;

public class Identificador {
	protected int chave;
	Identificador esquerdo, direito;

	public Identificador(int chave) {
		this.chave = chave;
		esquerdo = null;
		direito = null;
	}

	public String toString() {
		return String.valueOf(chave);
	}

	public int getChave() {
		return chave;
	}

	public Identificador getEsquerdo() {
		return esquerdo;
	}

	public void setEsquerdo(Identificador esquerdo) {
		this.esquerdo = esquerdo;
	}

	public Identificador getDireito() {
		return direito;
	}

	public void setDireito(Identificador direito) {
		this.direito = direito;
	}

}
