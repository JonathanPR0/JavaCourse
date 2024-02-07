package classes;

public class DesafioPessoa {
	String nome;
	double peso;
	final double pesoInicial; 
	
	public DesafioPessoa(String nome, double peso){
		this.nome = nome;
		this.pesoInicial = peso;
		this.peso = this.pesoInicial;
	}
	double comer(DesafioComida comida) {
		peso += comida.peso; 
		return peso;
	}
}
