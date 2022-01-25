package com.rafael.freela;

public class Freela {

    private int horas;
    private int dias;
    private int duracaoProjeto;
    private float mediaSalario;
    private float valorHora;
    private float valorProjeto;
    
    public Freela(){}

    public void calcularValorHora() {
        float valorHora;
        valorHora = getMediaSalario()/(getHoras()*getDias()*4);
        setValorHora(valorHora);
    }

    public void calcularValorProjeto(){
        float valorProjeto;
        valorProjeto = getValorHora()*getDuracaoProjeto();
        setValorProjeto(valorProjeto);
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public int getDuracaoProjeto() {
        return duracaoProjeto;
    }

    public void setDuracaoProjeto(int duracaoProjeto) {
        this.duracaoProjeto = duracaoProjeto;
    }

    public float getValorHora() {
        return valorHora;
    }

    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }

    public float getMediaSalario() {
        return mediaSalario;
    }

    public void setMediaSalario(float mediaSalario) {
        this.mediaSalario = mediaSalario;
    }

    public float getValorProjeto() {
        return valorProjeto;
    }

    public void setValorProjeto(float valorProjeto) {
        this.valorProjeto = valorProjeto;
    } 
    
}