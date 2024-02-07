package controle;

import java.util.Scanner;

public class EX9 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double number = 0;
		
		for(int i = 0; i<10; i++) {
			System.out.println("Digite um número:");
			double value = input.nextDouble();
			if(value > number)
				number = value;
		}
		
		System.out.printf("\nO maior valor foi %.0f", number);
		
		input.close();
	}
}
