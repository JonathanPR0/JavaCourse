package controle;

import java.util.Scanner;

public class EX7 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double number = 0;
			
		do {
			System.out.println("Digite um número:");
			double oldNumber = number;
			number = input.nextDouble();
			double newNumber = number + oldNumber;
			if(number < 0) {
				System.out.println("Tchau!!!");
				break;
			}
			System.out.println("Soma: " + newNumber);
			number = newNumber;
			
		}while(number > 0);
		
		input.close();
	}
}
