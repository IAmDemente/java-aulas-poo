package br.sesi.gfd.poo;

import br.sesi.gfd.poo.cabeca.Cabeca;
import br.sesi.gfd.poo.cabeca.Olho;

public class Main {
    public static void main(String args []){

        Olho olho1 = new Olho();
        olho1.cego = true;
        olho1.diametroOlho = 2;
        olho1.corIris = "azul";

        Olho olho2 = new Olho();
        olho2.cego = false;
        olho2.diametroOlho = 2;
        olho2.corIris = "castanho";

        Cabeca cabeca1 = new Cabeca();
        cabeca1.olhoDireito = olho2;
        cabeca1.olhoEsquerdo = olho1;

        Pessoa pessoa1 = new Pessoa();

        pessoa1.cabeca = cabeca1;
    }

}
