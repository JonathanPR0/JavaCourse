package polimorfismo;

public class Jantar {
	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa(63.4);
		
		Comida arroz = new Arroz(0.4);
		Comida feijao = new Feijao(0.2);
		Comida sobremesa = new Sorvete(0.15);
		
		System.out.println(pessoa.getPeso());
		
		pessoa.comer(arroz);
		pessoa.comer(feijao);
		
		System.out.println(pessoa.getPeso());

		pessoa.comer(sobremesa);
		
		System.out.println(pessoa.getPeso());
	}
}
