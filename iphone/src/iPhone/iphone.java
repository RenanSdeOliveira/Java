package iPhone;
import aplicativos.AparelhoTelefonico;
import aplicativos.NavegadorInternet;
import aplicativos.RepodutorMusical;


public class iphone {

	public static void main(String[] args) {
		AparelhoTelefonico aparelhoTelefonico = new AparelhoTelefonico();			
		aparelhoTelefonico.ligar();
		aparelhoTelefonico.atender();
		aparelhoTelefonico.iniciarCorrerioVoz();
		
		NavegadorInternet navegadorInternet = new NavegadorInternet();			
		navegadorInternet.exibirPagina();
		navegadorInternet.adicionarNovaAba();
		navegadorInternet.atualizarPagina();
		
		RepodutorMusical repodutorMusical = new RepodutorMusical();			
		repodutorMusical.tocar();
		repodutorMusical.pausar();
		repodutorMusical.selecionarMusica();
	}

}
