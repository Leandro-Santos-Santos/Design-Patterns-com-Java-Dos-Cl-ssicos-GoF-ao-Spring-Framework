package one.digital.inovation.gof.strategy;

public class ComportamentoAgressivo implements Comportamento{

    @Override
    public void mover() {
        System.out.println("Movendo-se agressivament...");
    }

}
