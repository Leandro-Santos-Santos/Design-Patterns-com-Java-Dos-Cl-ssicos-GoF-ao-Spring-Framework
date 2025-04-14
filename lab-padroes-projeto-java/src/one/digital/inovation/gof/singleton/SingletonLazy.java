package one.digital.inovation.gof.singleton;
/*Singleton "Lento" 
 * @autor Leandro
*/
public class SingletonLazy {
    private static SingletonLazy instancia;
    private SingletonLazy() {
        super();
    }
    public static SingletonLazy getInstancia() {
        if (instancia == null) {
            instancia = new SingletonLazy();
        }
        return instancia;
    }

}
