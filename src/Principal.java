import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		
		BDSimulado bds = new BDSimulado();
		
		ArrayList<Filme> filmes = bds.getFilmes();
		ArrayList<Usuario> usuarios = bds.getUsuarios();

	}

}
