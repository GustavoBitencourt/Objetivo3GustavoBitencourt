package br.edu.ifsul.model;

public class Associado implements AssociadoVip {

    private int id;
    private int qdeCotas;
    private double valorCota;


    public Associado(){

    }

    public Associado(int id) {
        this.id = id;
    }

    public Associado(int id, int qdeCotas, double valorCota) {
        this.id = id;
        this.qdeCotas = qdeCotas;
        this.valorCota = valorCota;
    }


    @Override
    public String toString() {
        return "Associado{" +
                "id=" + id +
                ", qdeCotas=" + qdeCotas +
                ", valorCota=" + valorCota +
                '}';
    }

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


}
