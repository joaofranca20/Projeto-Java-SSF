package one.digital.projeto;

import one.digital.projeto.facade.Facade;
import one.digital.projeto.singleton.SingletonEager;
import one.digital.projeto.singleton.SingletonLazy;
import one.digital.projeto.singleton.SingletonLazyHolder;
import one.digital.projeto.strategy.Comportamento;
import one.digital.projeto.strategy.ComportamentoAgressivo;
import one.digital.projeto.strategy.ComportamentoDefensivo;
import one.digital.projeto.strategy.ComportamentoNormal;
import one.digital.projeto.strategy.Robo;

public class teste {

    public static void main(String[] args) {

        // Singleton

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
        facade.migrarCliente("João", "11223377");
    }

}
