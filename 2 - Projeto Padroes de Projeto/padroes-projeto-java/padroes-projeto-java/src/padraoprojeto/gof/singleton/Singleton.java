package padraoprojeto.gof.singleton;

/**
 * Singleton.
 * 
 * @author renan
 */
public class Singleton {

	private static Singleton instancia;
	
	private Singleton() {
		super();
	}
	
	public static Singleton getInstancia() {
		if (instancia == null) {
			instancia = new Singleton();
		}
		return instancia;
	}
}
