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
public class Cliente {
    private int idCliente;
    private int cpf;
    private String nome;
    private boolean cnh;

    
      public void estado(){
        System.out.println("-------------------------------------");
        System.out.println("ID "+this.getIdCliente());
        System.out.println("CPF "+this.getCpf());
        System.out.println("Cliente "+this.getNome());
        System.out.println("CNH "+this.getCnh());
        
    }
      
    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean getCnh() {
        return cnh;
    }

    public void setCnh(boolean cnh) {
        this.cnh = cnh;
    }
}
