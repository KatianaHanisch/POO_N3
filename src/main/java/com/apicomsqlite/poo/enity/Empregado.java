package com.apicomsqlite.poo.enity;

public class Empregado extends Usuario {

    private String funcao;
    private double salario;

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}