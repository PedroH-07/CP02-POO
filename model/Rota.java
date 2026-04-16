package model;

// Rota de entrega com um veiculo e um pacote.

public class Rota {
	private final Veiculo veiculo;
	private final Pacote pacote;

	public Rota(Veiculo veiculo, Pacote pacote) {
		this.veiculo = veiculo;
		this.pacote = pacote;
	}

	public void entregar() {
		pacote.setStatus("Em rota");
		System.out.println("Levando pacote " + pacote.getCodigo() + " no veiculo " + veiculo.getPlaca());
	}
}


