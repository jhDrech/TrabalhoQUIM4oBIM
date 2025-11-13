package model;

public class Metal {
    private String nome;
    private String sigla;
    private double potencial;
    private String estado;

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Metal(String nome, String sigla, double potencial) {
        this.nome = nome;
        this.sigla = sigla;
        this.potencial = potencial;
    }

    public void compararMetais(Metal metal1, Metal metal2){
        if (metal1.getNome() == metal2.getNome()) {
            System.out.println("insira espécies diferentes");
        }else if(metal1.getEstado() == metal2.getEstado()){
            System.out.println("insira espécies em estados diferentes");                                                                                                           
        }
    } 
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public double getPotencial() {
        return potencial;
    }

    public void setPotencial(double potencial) {
        this.potencial = potencial;
    }

}