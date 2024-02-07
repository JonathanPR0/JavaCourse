package main;

import jogo.Direcao;
import jogo.Heroi;
import jogo.Jogador;
import jogo.Monstro;

public class Jogo {
	public static void main(String[] args) {
		Jogador heroi = new Heroi(20, 20);
		heroi.andar(Direcao.NORTE);
		
		Jogador monstro = new Monstro(21, 20);
		
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		
		System.out.println(heroi.vida);
		System.out.println(monstro.vida);
	}
}
