package classes;

public class DesafioJantar {
	public static void main(String[] args) {
		DesafioComida comida1 = new DesafioComida("arroz", 0.2);
		DesafioComida comida2 = new DesafioComida("feijão", 0.145);
		DesafioPessoa pessoa = new DesafioPessoa("Jonathan", 53.2);
		
		pessoa.comer(comida1);
		System.out.printf("%.1f - %.2f\n", pessoa.pesoInicial, pessoa.peso);
		pessoa.comer(comida2);
		System.out.printf("%.1f - %.2f\n", pessoa.pesoInicial, pessoa.peso);
	}
}
