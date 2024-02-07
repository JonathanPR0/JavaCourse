package desafio;

public class Carro {
	private int velocidade;
	private int incremento = 10;
	final int VELOCIDADE_MAXIMA;
	
	public Carro(int velocidadeMaxima){
		this.VELOCIDADE_MAXIMA = velocidadeMaxima;
	}
	public Carro(){
		this.VELOCIDADE_MAXIMA = 160;
	}
	
	
	public int getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(int velocidade) {
		if(velocidade >= 0) {
			this.velocidade = velocidade;
		}
	}
	
	public int getIncremento() {
		return incremento;
	}
	public void setIncremento(int incremento) {
		if(incremento > 0) {
			this.incremento = incremento;
		}
	}
	
	public boolean acelerar() {
		if(this.velocidade + getIncremento() > this.VELOCIDADE_MAXIMA)
			this.velocidade = this.VELOCIDADE_MAXIMA;
		else
			this.velocidade += getIncremento();
		return true;
	}
	public boolean frear() {
		boolean condition = this.velocidade >= 8;
		if(condition)
			this.velocidade -= 8;	
		return condition ;
	}
}
