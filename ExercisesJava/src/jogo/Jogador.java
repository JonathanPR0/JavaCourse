package jogo;

public class Jogador {
	int x;
	int y;
	public int vida = 100;
	
	public Jogador(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public boolean atacar(Jogador oponente) {
		int deltaX = Math.abs(x - oponente.x);
		int deltaY = Math.abs(y - oponente.y);
		if((deltaX == 0 && deltaY == 1)||(deltaX == 1 && deltaY == 0)) {
			vida -= 10;
			return true;
		}
		return false;
	}
	
	public boolean andar(Direcao d) {
		switch(d) {
		case NORTE:
			y--;
			break;
		case LESTE:
			x++; 
			break;
		case SUL:
			y++;
			break;
		case OESTE:
			x--;
			break;
		}
		return true;
	}
}
