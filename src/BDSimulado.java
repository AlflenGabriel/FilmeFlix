import java.util.ArrayList;

public class BDSimulado {
	
	private ArrayList<Filme> filmes;
	private ArrayList<Usuario> usuarios;
	private ArrayList<Avaliacao> avaliacoes;
	
	public BDSimulado(){
		this.filmes = new ArrayList<Filme>();
		
		Filme f1 = new Filme("Star Wars 1", "Marcos Vinicios", 1997, "Ficção Cientifica");
		Filme f2 = new Filme("Star Wars: O Despertar da Força", "Marcos Vinicios", 2015, "Ficção Cientifica");
		Filme f3 = new Filme("Forrest Gump", "Robert Zemeckis", 1994, "Drama");
		Filme f4 = new Filme("Clube da Luta", "David Fincher", 1999, "Drama");
		Filme f5 = new Filme("Os Outros", "Alejandro Amenábar", 2001, "Suspense");
		Filme f6 = new Filme("Titanic", "James Cameron", 1997, "Drama");
		
		this.filmes.add(f1);
		this.filmes.add(f2);
		this.filmes.add(f3);
		this.filmes.add(f4);
		this.filmes.add(f5);
		this.filmes.add(f6);
		
		this.usuarios = new ArrayList<Usuario>();
		
		Usuario u1 = new Usuario("Gabriel", "Masculino", 21);
		Usuario u2 = new Usuario("Joao", "Masculino", 34);
		Usuario u3 = new Usuario("Mateus", "Masculino", 23);
		Usuario u4 = new Usuario("Maria", "Feminino", 43);
		Usuario u5 = new Usuario("Carolina", "Feminino", 20);
		Usuario u6 = new Usuario("Josefina", "Feminino", 75);
		
		this.usuarios.add(u1);
		this.usuarios.add(u2);
		this.usuarios.add(u3);
		this.usuarios.add(u4);
		this.usuarios.add(u5);
		this.usuarios.add(u6);
		
		/*
		this.avaliacoes = new ArrayList<Avaliacao>();
		
		Avaliacao a1 = new Avaliacao(u1, 5);
		*/
	}

	public ArrayList<Filme> getFilmes() {
		return filmes;
	}

	public ArrayList<Usuario> getUsuarios() {
		return usuarios;
	}
	
	public ArrayList<Filme> getFilmesPorAno(int ano){
		
		ArrayList<Filme> resultado = new ArrayList<Filme>();
		
		
		for (int i = 0; i < this.filmes.size(); i++) {
			
			if (this.filmes.get(i).getAnoLancamento() == ano) {
				resultado.add(this.filmes.get(i));
			}		
		}
		
		return resultado;
	}
	
	
	public ArrayList<Filme> getFilmesPorDiretor(String diretor){
		
		ArrayList<Filme> resultado = new ArrayList<Filme>();
		
		
		for (int i = 0; i < this.filmes.size(); i++) {
			
			if (this.filmes.get(i).getDiretor().equals(diretor)) {
				resultado.add(this.filmes.get(i));
			}
		}

		return resultado;
	}
	
	public ArrayList<Filme> getFilmesPorGenero(String genero){
		
		ArrayList<Filme> resultado = new ArrayList<Filme>();
		
		
		for (int i = 0; i < this.filmes.size(); i++) {
			
			if (this.filmes.get(i).getGenero().equals(genero)) {
				resultado.add(this.filmes.get(i));
			}
		}

		return resultado;
	}
	
}
