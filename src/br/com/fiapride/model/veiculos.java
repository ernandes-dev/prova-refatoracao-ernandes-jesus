package br.com.fiapride.model;

public class veiculos {

    private String individuo;
    private String pl;
    private int gas;

    public void adicionar(int v) {
        if (v > 0) {
            gas = gas + v;
        }
    }

    public void gasta(double v) {
        if (v > 0 && v <= gas) {
            gas = gas - (int) v;
        }
    }

    public String get_individuo() {
        return individuo;
    }

    public void set_individuo(String individuo) {
        this.individuo = individuo;
    }

    public String get_pl() {
        return pl;
    }

    public void set_pl(String pl) {
        this.pl = pl;
    }

    public int get_gas() {
        return gas;
    }

    public void setGas(int gas) {
        if (gas >= 0) {
            this.gas = gas;
        }
    }
}
