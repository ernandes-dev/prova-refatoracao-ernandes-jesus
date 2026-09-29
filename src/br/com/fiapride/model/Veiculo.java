package br.com.fiapride.model;

public class Veiculo {

    private String proprietario;
    private String placa;
    private double nivelCombustivel;
    private double capacidadeTanque;

    public Veiculo(String proprietario, String placa,
                   double nivelCombustivel, double capacidadeTanque) {

        this.setProprietario(proprietario);
        this.setPlaca(placa);
        this.setCapacidadeTanque(capacidadeTanque);
        this.setNivelCombustivel(nivelCombustivel);
    }

    public void abastecer(double quantidade) {

        if (quantidade > 0 &&
            this.nivelCombustivel + quantidade <= this.capacidadeTanque) {

            this.nivelCombustivel += quantidade;
        }
    }

    public void consumirCombustivel(double quantidade) {

        if (quantidade > 0 &&
            quantidade <= this.nivelCombustivel) {

            this.nivelCombustivel -= quantidade;
        }
    }

    public String getProprietario() {
        return this.proprietario;
    }

    private void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public String getPlaca() {
        return this.placa;
    }

    private void setPlaca(String placa) {
        this.placa = placa;
    }

    public double getNivelCombustivel() {
        return this.nivelCombustivel;
    }

    public double getCapacidadeTanque() {
        return this.capacidadeTanque;
    }

    private void setNivelCombustivel(double nivelCombustivel) {

        if (nivelCombustivel >= 0 &&
            nivelCombustivel <= this.capacidadeTanque) {

            this.nivelCombustivel = nivelCombustivel;
        }
    }

    private void setCapacidadeTanque(double capacidadeTanque) {

        if (capacidadeTanque > 0) {
            this.capacidadeTanque = capacidadeTanque;
        }
    }
}