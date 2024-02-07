package controle;

import java.util.Scanner;

public class EX6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double number = Math.ceil( Math.random()*100);
		
		for(int i = 10; i >= 0; --i) {
			if (i==0) {
				System.out.println("Não foi dessa vez ;-;");
				break;
			}
			
			System.out.println("Digite um valor entre 0 e 100:");
			double value = input.nextDouble();
			
			
			if(number == value) {
				System.out.println("******* Número correto *******");
				System.out.println("********** PARABÉNS **********");
				break;
			}else if(value > number) {
				System.out.println("O númemo correto é menor");
			}else if(value < number) {
				System.out.println("O número correto é maior");
			}
			
			System.out.printf("Ainda restam %d tentativas\n", i-1);
			System.out.printf("--------------------------------\n\n");
		}
		
		
		input.close();
	}
}
