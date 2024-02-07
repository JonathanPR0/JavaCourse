package controle;

import java.util.Scanner;

public class EX4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite um número e lhe falarei se ele é primo:");
		double number = input.nextDouble();
		
		for(double i = 2; i < number; i++) {
			if(number % i == 0) {				
				System.out.println("Não é número primo");
				break;
			}else {
				if(i <= number/2)
					continue;
				else {
					System.out.println("É número primo");
}					break;
				}
		}
					
		
		input.close();
	}
}
