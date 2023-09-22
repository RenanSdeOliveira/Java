package subsistema2.cep;

public class CepApi {

	private static CepApi instancia = new CepApi();

	private CepApi() {
		super();
	}

	public static CepApi getInstancia() {
		return instancia;
	}
	
	public String recuperarCidade(String cep) {
		return "Serra";
	}
	
	public String recuperarEstado(String cep) {
		return "ES";
	}
}
