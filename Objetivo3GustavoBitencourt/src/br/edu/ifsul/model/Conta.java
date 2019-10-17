package br.edu.ifsul.model;

public abstract class Conta {

    protected int id;
    protected double saldo;
    protected double valor;
    protected double taxa;


    public Conta(){

    }

    public void deposita(double valor) {this.saldo += valor;}

    public void saca(double valor){this.saldo -= valor;}

    public void atualiza(double taxa){this.saldo = this.valor * taxa;}


    public int getSaldo() {
        return (int) this.saldo;
    }


    public void saldo(int qdeCotas) {
        this.saldo = qdeCotas;
    }


    public Conta(int id, double saldo) {
        this.id = id;
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "id=" + id +
                ", saldo=" + saldo +
                '}';
    }
}
