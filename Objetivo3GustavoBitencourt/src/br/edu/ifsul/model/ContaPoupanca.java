package br.edu.ifsul.model;

public class ContaPoupanca extends Conta{


    public ContaPoupanca(){

    }

    public ContaPoupanca(int id, double saldo) {
        super(id, saldo);
    }


    @Override
    public String toString() {
        return "ContaPoupanca{" +
                "id=" + id +
                ", saldo=" + saldo +
                '}';
    }
}
