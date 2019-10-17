package br.edu.ifsul.model;

public class ContaCorrente extends Conta implements AssociadoVip{

    private double valorCota;
    private int qdeCotas;

    public ContaCorrente(){  super(); }

    public ContaCorrente(int id, double saldo) {
        super(id, saldo);
    }



    public ContaCorrente(double valorCota, int qdeCota) {
        this.valorCota = valorCota;
        this.qdeCotas = qdeCota;
    }

    public ContaCorrente(int id, double saldo, double valorCota, int qdeCota) {
        super(id, saldo);
        this.valorCota = valorCota;
        this.qdeCotas = qdeCota;
    }

    @Override
    public double lucros(int qdeCotas, double valorCota) {
        this.qdeCotas = qdeCotas;
        this.valorCota = valorCota;
        return 0;
    }

    @Override
    public int getqdeCotas() {
        return this.qdeCotas;
    }

    @Override
    public void setqdeCotas(int qdeCotas) {
        this.qdeCotas = qdeCotas;
    }

    @Override
    public int getQdeCotas() {
        return 0;
    }

    @Override
    public void setQdeCotas(int qdeCota) {

    }


    @Override
    public String toString() {
        return "ContaCorrente{" +
                "valorCota=" + valorCota +
                ", qdeCota=" + qdeCotas +
                ", id=" + id +
                ", saldo=" + saldo +
                ", valor=" + valor +
                ", taxa=" + taxa +
                '}';
    }
}

