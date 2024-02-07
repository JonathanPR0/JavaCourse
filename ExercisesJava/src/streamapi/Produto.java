package streamapi;

public class Produto {
	final String nome;
	final double preco;
	final double desconto;
	final Boolean freteGratis;
	
	Produto(String nome, double preco, double desconto, Boolean freteGratis){
		this.nome = nome;
		this.desconto = desconto;
		this.freteGratis = freteGratis;
		this.preco = preco;
	};
}
