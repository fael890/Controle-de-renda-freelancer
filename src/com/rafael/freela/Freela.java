package com.rafael.freela;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Freela {

    private int hora;
    private int dia;
    private float salarioMedio;
    private float salarioHora;
    private float totalHora;
    private float custoHora;

    public float[] custosFixos = new float[4];
    public float[] custosVariaveis = new float[4];
    
    public Freela(){}

    public void calcularCustosHora(){
        float custoHora;
        custoHora = ((calcularTotalCustoFixo()/calcularHoraTrabalho()) + (calcularTotalCustoVariavel()/160))*1.40f;
        setCustoHora(custoHora);
    }
    public void calcularSalarioHora(){
        float salarioHora = 0;
        salarioHora = salarioMedio/calcularHoraTrabalho();
        setSalarioHora(salarioHora);
    }
    public void calcularTotalHora(){
        float totalHora = 0;
        totalHora = getSalarioHora()+getCustoHora();
        setTotalHora(totalHora);
    }

    public float calcularTotalCustoFixo(){
        float custoFixoTotal = 0;
        for (float custo : this.custosFixos) {
            custoFixoTotal = custoFixoTotal + custo;
        }
        return custoFixoTotal;
    }
    public float calcularTotalCustoVariavel(){
        float custoVariavelTotal = 0;
        for (float custo : this.custosVariaveis) {
            custoVariavelTotal = custoVariavelTotal + custo;
        }
        return custoVariavelTotal;
    }
    public int calcularHoraTrabalho(){
        int totalHora = 0;
        totalHora = getHora()*getDia()*4;
        return totalHora;
    }

    public int getHora() {
        return hora;
    }
    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getDia() {
        return dia;
    }
    public void setDia(int dia) {
        this.dia = dia;
    }

    public float getSalarioMedio() {
        return salarioMedio;
    }
    public void setSalarioMedio(float salarioMedio) {
        this.salarioMedio = salarioMedio;
    }

    public float getCustoHora() {
        return custoHora;
    }
    public void setCustoHora(float custoHora) {
        this.custoHora = custoHora;
    }

    public float[] getCustosFixos() {
        return custosFixos;
    }
    public void setCustosFixos(float[] custosFixos) {
        this.custosFixos = custosFixos;
    }

    public float[] getCustosVariaveis() {
        return custosVariaveis;
    }
    public void setCustosVariaveis(float[] custosVariaveis) {
        this.custosVariaveis = custosVariaveis;
    }

    public float getSalarioHora() {
        return salarioHora;
    }

    public void setSalarioHora(float salarioHora) {
        this.salarioHora = salarioHora;
    }

    public float getTotalHora(){
        return this.totalHora;
    }

    public void setTotalHora(float totalHora) {
        this.totalHora = totalHora;
    }
    
}