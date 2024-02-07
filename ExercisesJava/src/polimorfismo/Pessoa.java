package polimorfismo;

public class Pessoa {
	private double peso;
	
	public Pessoa(double peso) {
		setPeso(peso);
	}
	
	public void comer(Comida comida) {
		setPeso(this.peso + comida.getPeso());
	}

	public double getPeso() {
		return this.peso;
	}

	public void setPeso(double peso) {
		if(peso>=0) {
			this.peso = peso;
		}
	}
}
