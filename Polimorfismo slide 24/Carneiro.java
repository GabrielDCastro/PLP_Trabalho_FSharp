package plp;

/**
 *
 * @author gabri
 */
public class Carneiro extends Animal{

    public Carneiro(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom() {
        System.out.println("O carneiro que tem " +numeroPatas +" patas, faz MÉEEE");
    }
    
}
