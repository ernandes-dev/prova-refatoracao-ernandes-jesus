package br.com.fiapride.main;

import br.com.fiapride.model.veiculos;

public class SistemaPrincipal {

    public static void main(String[] args) {

        veiculos v1 = new veiculos();

        v1.set_individuo("Carlos");
        v1.set_pl("ABC-1234");

        v1.setGas(0);

        v1.adicionar(50);
        v1.gasta(100);

        System.out.println("Indivíduo: " + v1.get_individuo());
        System.out.println("Placa: " + v1.get_pl());
        System.out.println("Gasolina: " + v1.get_gas());
    }
}
