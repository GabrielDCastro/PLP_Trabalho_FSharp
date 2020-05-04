
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
public class Locacao {
    private int idLocacao;
    private int idCarro;
    private int idCliente;
    private float valorLocado;
    private String dataInicio;
    private String dataFim;
    
     public void estado(){
        System.out.println("-------------------------------------");
        System.out.println("ID "+this.getIdLocacao());
        System.out.println("IdCarro "+this.getIdCarro());
        System.out.println("IdCliente "+this.getIdCliente());
        System.out.println("Valor "+this.getValorLocado());
        System.out.println("Data de Inicio "+this.getDataInicio());
        System.out.println("Data de fim "+this.getDataFim());
    }

    public int getIdLocacao() {
        return idLocacao;
    }

    public void setIdLocacao(int idLocacao) {
        this.idLocacao = idLocacao;
    }

    public int getIdCarro() {
        return idCarro;
    }

    public void setIdCarro(int idCarro) {
        this.idCarro = idCarro;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public float getValorLocado() {
        return valorLocado;
    }

    public void setValorLocado(float valorLocado) {
        this.valorLocado = valorLocado;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getDataFim() {
        return dataFim;
    }

    public void setDataFim(String dataFim) {
        this.dataFim = dataFim;
    }
    

}
