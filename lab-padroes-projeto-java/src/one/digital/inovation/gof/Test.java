package one.digital.inovation.gof;

import one.digital.inovation.gof.facade.Facade;
import one.digital.inovation.gof.singleton.SingletonEager;
import one.digital.inovation.gof.singleton.SingletonLazy;
import one.digital.inovation.gof.singleton.SingletonLazyHolder;
import one.digital.inovation.gof.strategy.Comportamento;
import one.digital.inovation.gof.strategy.ComportamentoAgressivo;
import one.digital.inovation.gof.strategy.ComportamentoDefensivo;
import one.digital.inovation.gof.strategy.ComportamentoNormal;
import one.digital.inovation.gof.strategy.Robo;

public class Test {
    // Testes Design Pattern Singleton
    public static void main (String[] args) {
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);

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
