package desafio;

public class Ferrari extends Carro implements Esportivo, Luxo{
	private boolean isTurboOn;
	private boolean isArOn;
	
	public Ferrari(){
		super(340);
	}
	
	public void ligarTurbo() {
		this.isTurboOn = true;
	}
	public void desligarTurbo() {
		this.isTurboOn = false;		
	}
	public void ligarAr() {
		this.isArOn = true;
	}
	public void desligarAr() {
		this.isArOn = false;	
	}
	
	public int getIncremento() {
		if(isTurboOn && !isArOn) {
			return 35;
		}else if(isTurboOn && isArOn) {
			return 30;
		}else if(!isTurboOn && !isArOn) {
			return 25;
		}else {
			return 15;
		}
	}
}
