package streamapi;

import java.util.Arrays;
import java.util.List;

public class DesafioFilter2 {
	public static void main(String[] args) {
		Produto p1 = new Produto("Livro", 34.56, 0.2, true);
		Produto p2 = new Produto("Smartphone", 1894.99, 0.2, false);
		Produto p3 = new Produto("Notebook", 2565.50, 0.36, true);
		Produto p4 = new Produto("Relógio", 153.70, 0.25, true);
		Produto p5 = new Produto("Caderno", 22.55, 0.34, true);
		Produto p6 = new Produto("Teclado", 98.6, 0.21, false);
		
		List<Produto> produtos = Arrays.asList(p1,p2,p3,p4,p5,p6);
		
		produtos.stream()
			.filter(p -> p.freteGratis)
			.filter(p -> p.desconto >= 0.3)
			.map(p -> String.format("Superpromoção: O produto %s de R$%.2f", p.nome, p.preco))
			.forEach(System.out::println);;
	}
}
