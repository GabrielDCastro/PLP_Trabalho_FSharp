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
public class Carro {
    private int idCarro;
    private String placa;
    private String fabricante;
    private String modelo;
    private int ano;
    private String cor;
    private float valorDiaria;
    
       public void estado(){
        System.out.println("-------------------------------------");
        System.out.println("ID "+this.getIdCarro());
        System.out.println("Placa "+this.getPlaca());
        System.out.println("Fabricante "+this.getFabricante());
        System.out.println("Modelo "+this.getModelo());
        System.out.println("Ano "+this.getAno());
        System.out.println("Cor "+this.getCor());
        System.out.println("Diária: R$ "+this.getValorDiaria());
    }

    public int getIdCarro() {
        return idCarro;
    }

    public void setIdCarro(int idCarro) {
        this.idCarro = idCarro;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(float valorDiaria) {
        this.valorDiaria = valorDiaria;
    }
}
