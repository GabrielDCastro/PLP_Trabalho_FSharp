package TesteHeranca;

import Motorista;

public class Heranca {

    public static void main(String[] args) {
        Motorista objetomotorista = new Motorista("carlos", "55555555555", "6666666666");
        objetomotorista.setNome("gabriel");
        objetomotorista.setCpf("99999999999");
        
        System.out.println("Nome: "+objetomotorista.getNome()+" CPF: "+objetomotorista.getCpf());
    }
    
}
