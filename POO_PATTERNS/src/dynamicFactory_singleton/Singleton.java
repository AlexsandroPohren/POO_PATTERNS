package dynamicFactory_singleton;

public class Singleton {
	
	private static Singleton instance;
	
	public Singleton() {}
	
	public static Singleton getInstance() {
		if(instance == null) {
			instance = new Singleton();
			System.out.println("NOVO");
		} else {
			System.out.println("ANTIGO");
		}
		return instance;
	}

}
