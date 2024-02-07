package main;

import desafio.Carro;
import desafio.Ferrari;
import desafio.Fusca;

public class CarroTeste {
	public static void main(String[] args) {
		Ferrari ferrari = new Ferrari();
		Carro fusca = new Fusca();
		
		System.out.println("Inicio -> " + ferrari.getVelocidade());
		System.out.println("Inicio -> " + fusca.getVelocidade());
		
		ferrari.acelerar();//25
		ferrari.acelerar();//50
		ferrari.ligarTurbo();
		ferrari.acelerar();//85
		ferrari.ligarAr();
		ferrari.acelerar();//115
		ferrari.acelerar();//145
		
		fusca.acelerar();//10
		fusca.acelerar();//20
		fusca.acelerar();//30
		fusca.acelerar();//40
		fusca.acelerar();//50
		fusca.acelerar();//60
		fusca.acelerar();//70
		fusca.acelerar();//80
		fusca.acelerar();//90
		fusca.acelerar();//100
		fusca.acelerar();//110
		fusca.acelerar();//120
		fusca.acelerar();//130
		fusca.acelerar();//140
		fusca.acelerar();//150
		fusca.acelerar();//160 Max
		fusca.acelerar();//160 Max
		
		System.out.println("Acelerado - > " + ferrari.getVelocidade());
		System.out.println("Acelerado - > " + fusca.getVelocidade());
	
		ferrari.frear();
		ferrari.frear();
		fusca.frear();
		fusca.frear();
		
		System.out.println("Frear -> " + ferrari.getVelocidade());
		System.out.println("Frear -> " + fusca.getVelocidade());
	}
}
