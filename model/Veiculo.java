package model;

// Classe base com os dados comuns de um veiculo.

public class Veiculo {
    private String placa;
    private double capacidadeKg;

    public Veiculo(String placa, double capacidadeKg) {
        this.placa = placa;
        this.capacidadeKg = capacidadeKg;
    }

    public String getPlaca() {
        return placa;
    }

    public double getCapacidadeKg() {
        return capacidadeKg;
    }
}


