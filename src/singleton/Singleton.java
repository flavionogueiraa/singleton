package singleton;

public class Singleton {
	private static Singleton instanciaUnica;

	private Singleton() {

	}

	public static synchronized Singleton getInstance() {
		if(instanciaUnica == null) {
			instanciaUnica = new Singleton();
		}
		
		return instanciaUnica;
	}
}
