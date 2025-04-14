package one.digital.inovation.gof.singleton;
/*Singleton "Rapido" 
 * @autor Leandro
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
