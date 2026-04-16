package model;

/**
 * Entidade de carga que sera transportada na rota.
 */
public class Pacote {
	private String codigo;
	private double pesoKg;
	private String status;

	public Pacote(String codigo, double pesoKg, String statusInicial) {
		this.codigo = codigo;
		this.pesoKg = pesoKg;
		this.status = statusInicial;
	}

	public String getCodigo() {
		return codigo;
	}

	public double getPesoKg() {
		return pesoKg;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}

