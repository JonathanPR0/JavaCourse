package classes;

public class ProdutoTeste {
	public static void main(String[] args) {
		Produto p1 = new Produto();
		p1.nome = "Notebook";
		p1.preco = 4356.89;
		
		Produto.desconto = 0.5;
		
		Produto p2 = new Produto();
		p2.nome = "Funko Pop";
		p2.preco = 128.3;
		
		System.out.println(p1.precoComDesconto());
		System.out.println(p2.precoComDesconto());
	}
}
