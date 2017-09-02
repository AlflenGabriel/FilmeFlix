import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		
		BDSimulado bds = new BDSimulado();
		
		ArrayList<Filme> filmes = bds.getFilmes();
		ArrayList<Usuario> usuarios = bds.getUsuarios();
		
		for (int i = 0; i < filmes.size(); i++) {
			if (filmes.get(i).getAnoLancamento() > 2000) {
				System.out.println(filmes.get(i).getTitulo() + " / " + filmes.get(i).getGenero());
			}
			
		}
		
		ArrayList<Filme> filmesPorAno = bds.getFilmesPorAno(1999);
		
		for (int i = 0; i < filmesPorAno.size(); i++) {
			System.out.println(filmesPorAno.get(i).getTitulo());
		}
		
        ArrayList<Filme> FilmesPorDiretor = bds.getFilmesPorDiretor("James Cameron");
        //imprimir
        for (int i = 0; i < FilmesPorDiretor.size(); i++){
        	System.out.println(FilmesPorDiretor.get(i).getTitulo());
              
        	}
		}

	}
