package app;
// Arquivo principal
import model.Caminhao;
import model.Moto;
import model.Pacote;
import model.Rota;

public class Principal {
	public static void main(String[] args) {
		Caminhao caminhao = new Caminhao("ABC1234", 500.0, 4);
		Pacote pacoteCaminhao = new Pacote("BR999", 10.5, "Pendente");
		Rota rotaCaminhao = new Rota(caminhao, pacoteCaminhao);
		rotaCaminhao.entregar();

		Moto moto = new Moto("XYZ9876", 35.0, true);
		Pacote pacoteMoto = new Pacote("SP123", 2.0, "Pendente");
		Rota rotaMoto = new Rota(moto, pacoteMoto);
		rotaMoto.entregar();
	}
}

