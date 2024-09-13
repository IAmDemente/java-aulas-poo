package br.sesi.gfd.poo.cabeca;

public class Cabeca {

    public Olho olhoEsquerdo;
    public Olho olhoDireito;
    public Orelha orelhao;
    public Nariz nariz;
    public Boca boca;

    public Cabeca(){
        this.olhoDireito = new Olho();
        this.olhoEsquerdo = new Olho();
        this.orelhao = new Orelha();
        this.nariz = new Nariz();
        this.boca = new Boca();
    }
}
