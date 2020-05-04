/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package alugafacil;

/**
 *
 * @author gabri
 */
public class AlugaFacil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cliente gabriel = new Cliente();
        gabriel.setNome("gabriel");
        gabriel.setCnh(true);
        gabriel.setIdCliente(1);
        gabriel.setCpf(1111111111);
        gabriel.estado();
        
        Cliente sabirila = new Cliente();
        sabirila.setNome("lucas");
        sabirila.setCnh(true);
        sabirila.setIdCliente(2);
        sabirila.setCpf(24242424);
        sabirila.estado();
        
        
        Carro civic = new Carro();
        civic.setAno(1998);
        civic.setCor("prata");
        civic.setFabricante("Honda");
        civic.setModelo("Civic");
        civic.setIdCarro(5);
        civic.setPlaca("jjj-0000");
        civic.setValorDiaria(200);
        civic.estado();
        
        Carro celtaTunado = new Carro();
        celtaTunado.setAno(2004);
        celtaTunado.setCor("Preto mafioso");
        celtaTunado.setFabricante("Chevrolet");
        celtaTunado.setIdCarro(34);
        celtaTunado.setModelo("Celta tunado");
        celtaTunado.setPlaca("kkk-1111");
        celtaTunado.setValorDiaria(500);
        celtaTunado.estado();
    }
    
}
