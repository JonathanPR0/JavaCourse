package controle;

import java.util.Scanner;

public class NotasAlunos {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double value = 0;
		double number = 0;
		int cont = 0;
		do{
			System.out.print("Digite a nota: ");
			value = input.nextDouble();
			if(value >= 0 && value <= 10  ) {
				number += value;
				cont++;
			}else if(value == (-1)) {
				System.out.println("Tchau!");
			}else {
				System.out.println("Valor inválido, tente novamente");
			}
		}while(value != (-1));
		System.out.printf("\nA média das notas é %.1f", number/cont);
		input.close();
	}
}
