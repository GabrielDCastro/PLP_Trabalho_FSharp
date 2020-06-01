package TesteHeranca;

import Cachorro;
import Gato;

public class testeHerancaAnimal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        Gato gato = new Gato();
        
        cachorro.setNome("Lupy");
        cachorro.setRaca("Fox");
        gato.setNome("Yuki");
        
        System.out.println("O cachorro "+cachorro.getNome()
                           +" da raça "+cachorro.getRaca()
                           +" faz "+cachorro.late());
    }
    
}
