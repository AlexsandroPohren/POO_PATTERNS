package composicao;

public class Tester {
	
	public static void main(String[] args) {
		
		Categoria cat = new Categoria("Olhos Famintos","Lanšamento");
		
		Terror terror = new Terror();
		terror.setIdTerror(1);
		terror.setCategoria(cat);
		
		System.out.println(terror.getCategoria().getNome());
	
	}
}


