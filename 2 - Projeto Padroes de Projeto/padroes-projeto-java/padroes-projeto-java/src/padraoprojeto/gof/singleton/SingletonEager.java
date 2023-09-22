package padraoprojeto.gof.singleton;

/**
 * Singleton rapido.
 * 
 * @author renan
 */
public class SingletonEager {

	private static SingletonEager instancia = new SingletonEager();
	
	private SingletonEager() {
		super();
	}
	
	public static SingletonEager getInstancia() {
		return instancia;
	}
}
