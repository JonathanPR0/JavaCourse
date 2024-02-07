package streamapi;

import java.util.Arrays;
import java.util.List;

public class DesafioFilter1 {
	public static void main(String[] args) {
		Livro livro1 = new Livro("O código perdigo", 22.40, 252);
		Livro livro2 = new Livro("O pequeno principe", 15.88, 96);
		Livro livro3 = new Livro("Extraordinário",47.92, 320);
		Livro livro4 = new Livro("O mundo perdido", 64.10, 448);
		Livro livro5 = new Livro("Essenscialismo", 43.12, 272);
		
		List<Livro> livros = Arrays.asList(livro1, livro2, livro3, livro4, livro5);
		
		livros.stream()
			.filter(livro -> livro.preco <= 50)
			.filter(livro -> livro.paginas >= 250)
			.map(livro -> livro.name)
			.forEach(System.out::println);;
	}
}
