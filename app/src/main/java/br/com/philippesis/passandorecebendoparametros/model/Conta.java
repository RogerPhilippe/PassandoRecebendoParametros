package br.com.philippesis.passandorecebendoparametros.model;

public class Conta {

    private Long number1, number2;

    public Conta() {
    }

    public Conta(Long number1, Long number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public Long getNumber1() {
        return number1;
    }

    public void setNumber1(Long number1) {
        this.number1 = number1;
    }
}
