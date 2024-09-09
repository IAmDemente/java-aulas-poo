package br.sesi.gfd.poo;

import br.sesi.gfd.poo.cabeca.Cabeca;
import br.sesi.gfd.poo.inferior.MembrosInferiores;
import br.sesi.gfd.poo.tronco.Tronco;

public class Pessoa {

        public Cabeca cabeca;
        public Tronco tronco;
        public MembrosInferiores MI;

        public Pessoa(){
                this.cabeca = new Cabeca();
                this.tronco = new Tronco();
                this.MI = new MembrosInferiores();
        }

}
