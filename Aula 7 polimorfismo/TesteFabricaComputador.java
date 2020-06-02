package teste;

import Polimorfismo.Computador;
import Polimorfismo.ComputadorFactory;

public class TesteFabricaComputador {

    public static void main(String[] args) {
        Computador pc =  ComputadorFactory.getComputador("Computador Pessoal","16GB","1TB","3.4Ghz");
        Computador server =  ComputadorFactory.getComputador("Servidor","128GB","3TB","5.4Ghz");
        
        System.out.println("Fabrica computador pessoal: "+pc);
        System.out.println("Fabrica servidor: "+server);
    }
    
}
