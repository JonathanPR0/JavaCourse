package controle;

import java.util.Scanner;

public class EX1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Informe um valor entre 0 e 10");
		
		double value = input.nextDouble();
		
		if(value >= 0 && value <=10 && value % 2 == 0) {
			System.out.println("O número informado está entre 0 e 10 (PAR)");
		}else if(value >= 0 && value <=10 && value % 2 == 1) {
			System.out.println("O número informado está entre 0 e 10 (ÍMPAR)");
		}else {
			System.out.println("Valor fora do escopo fornecido");
		}
		
		input.close();
	}
}
