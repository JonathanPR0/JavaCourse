package controle;

import java.util.Scanner;

public class DesafioSemana {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o dia:");
		String day = input.next().toUpperCase();
		int num;
		
		
		if(day.equals("DOMINGO")) {
			num = 1;
		}else if(day.equals("SEGUNDA")) {
			num = 2;
		}else if(day.equals("TERCA")) {
			num = 3;
		}else if(day.equals("QUARTA")) {
			num = 4;
		}else if(day.equals("QUINTA")) {
			num = 5;
		}else if(day.equals("SEXTA")) {
			num = 6;
		}else if(day.equals("SABADO")) {
			num = 7;
		}else {
			num = 0;
		}
		
		System.out.println(num == 0 ? "Valor inválido" : num);
		
		input.close();
	}
}
