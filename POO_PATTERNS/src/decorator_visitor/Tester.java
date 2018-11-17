package decorator_visitor;

public class Tester {
	public static void main(String[] args) {
		
		Coquetel meuCoquetel = new Cachaca();
		System.out.println(meuCoquetel.getNome() + " = "
				+ meuCoquetel.getPreco());

		meuCoquetel = new Refrigerante(meuCoquetel);
		System.out.println(meuCoquetel.getNome() + " = "
				+ meuCoquetel.getPreco());
		
		CoquetelBinario coquetel = new CoquetelBinario(7);

		coquetel.inserir(15);
		coquetel.inserir(10);
		coquetel.inserir(5);
		coquetel.inserir(2);
		coquetel.inserir(1);
		coquetel.inserir(20);

		System.out.println(" Exibindo em ordem ");
		coquetel.aceitarCoquetel(new ExibirInOrderVisitor());
		System.out.println(" Exibindo pre ordem ");
		coquetel.aceitarCoquetel(new ExibirPreOrderVisitor());
		System.out.println(" Exibindo pos ordem ");
		coquetel.aceitarCoquetel(new ExibirPostOrderVisitor());
		System.out.println(" Exibindo identado ");
		coquetel.aceitarCoquetel(new ExibirIndentadoVisitor());
	}
}
