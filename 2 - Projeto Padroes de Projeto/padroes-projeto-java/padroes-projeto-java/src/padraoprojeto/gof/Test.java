package padraoprojeto.gof;

import padraoprojeto.gof.facade.Facade;
import padraoprojeto.gof.singleton.Singleton;
import padraoprojeto.gof.singleton.SingletonEager;
import padraoprojeto.gof.singleton.SingletonHolder;
import padraoprojeto.gof.strategy.Comportamento;
import padraoprojeto.gof.strategy.ComportamentoAgressivo;
import padraoprojeto.gof.strategy.ComportamentoDefensivo;
import padraoprojeto.gof.strategy.ComportamentoNormal;
import padraoprojeto.gof.strategy.Robo;

public class Test {

	public static void main(String[] args) {
		
		// Singleton
		
		Singleton singleton = Singleton.getInstancia();
		System.out.println(singleton);
		singleton = Singleton.getInstancia();
		System.out.println(singleton);
		
		SingletonEager eager = SingletonEager.getInstancia();
		System.out.println(eager);
		eager = SingletonEager.getInstancia();
		System.out.println(eager);
		
		SingletonHolder holder = SingletonHolder.getInstancia();
		System.out.println(holder);
		holder = SingletonHolder.getInstancia();
		System.out.println(holder);
		
		// Strategy
		
		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento normal = new ComportamentoNormal();
		Comportamento agressivo = new ComportamentoAgressivo();
		
		Robo robo = new Robo();
		robo.setComportamento(normal);
		robo.mover();
		robo.mover();
		robo.setComportamento(defensivo);
		robo.mover();
		robo.setComportamento(agressivo);
		robo.mover();
		robo.mover();
		robo.mover();
		
		// Facade
		
		Facade facade = new Facade();
		facade.migrarCliente("Venilton", "14801788");
	}

}
