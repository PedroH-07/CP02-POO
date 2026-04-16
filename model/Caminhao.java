package model;

/**
 * Representa um caminhao de entrega.
 */
public class Caminhao extends Veiculo {
	private int eixos;

	public Caminhao(String placa, double capacidadeKg, int eixos) {
		super(placa, capacidadeKg);
		this.eixos = eixos;
	}

	public int getEixos() {
		return eixos;
	}
}

