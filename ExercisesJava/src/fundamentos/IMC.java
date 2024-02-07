package fundamentos;

import java.util.Scanner;

public class IMC {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o peso:");
		double weight = Double.parseDouble(input.next().replace(",", "."));
		System.out.println("Digite a altura:");
		double height = Double.parseDouble(input.next().replace(",", "."));
		double imc = weight/(Math.pow(height,2));
		System.out.printf("O IMC do indivíduo é de: %.1f", imc);
		
		input.close();
	}
}
