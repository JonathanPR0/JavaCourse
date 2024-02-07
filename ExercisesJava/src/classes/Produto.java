package classes;

public class Produto {
	String nome;
	double preco;
	static double desconto = 0.25;
	
	Produto(){
		
	}
	
	Produto(int descontoFinal){
		desconto = descontoFinal;
	}
	
	double precoComDesconto() {
		return preco * (1 - desconto);
	}
}
