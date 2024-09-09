package br.sesi.gfd.poo.cabeca;

public class Cabeca {

    public Olho zoio;
    public Orelha orelhao;
    public Nariz nariz;
    public Boca boca;

    public Cabeca(){
        this.zoio = new Olho();
        this.orelhao = new Orelha();
        this.nariz = new Nariz();
        this.boca = new Boca();
    }
}
