package br.com.fiapride.main;

import br.com.fiapride.model.Veiculo;

public class SistemaPrincipal {

    public static void main(String[] args) {

        Veiculo veiculo1 = new Veiculo("Carlos", "ABC-1234", 40, 150);

        veiculo1.abastecer(70);
        veiculo1.consumirCombustivel(80);

        System.out.println("Proprietário: " + veiculo1.getProprietario());
        System.out.println("Placa: " + veiculo1.getPlaca());
        System.out.println("Nível de Combustível: "
                + veiculo1.getNivelCombustivel());
        System.out.println("Capacidade do Tanque: "
                + veiculo1.getCapacidadeTanque());

        System.out.println("\n--- TESTANDO MÉTODOS ---");

        // Teste válido
        veiculo1.abastecer(20);
        System.out.println("Abastecimento de 20 litros realizado.");
        System.out.println("Nível atual: "
                + veiculo1.getNivelCombustivel());

        // Teste inválido
        veiculo1.abastecer(150);
        System.out.println("Tentativa de abastecer 150 litros rejeitada.");
        System.out.println("Nível permanece: "
                + veiculo1.getNivelCombustivel());

        // Teste válido
        veiculo1.consumirCombustivel(10);
        System.out.println("Consumo de 10 litros realizado.");
        System.out.println("Nível atual: "
                + veiculo1.getNivelCombustivel());

        // Teste inválido
        veiculo1.consumirCombustivel(500);
        System.out.println("Tentativa de consumir 500 litros rejeitada.");
        System.out.println("Nível permanece: "
                + veiculo1.getNivelCombustivel());
    }
}