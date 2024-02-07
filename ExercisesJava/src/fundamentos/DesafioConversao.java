package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite o primeiro salário:");
		double input1 = Double.parseDouble(input.next().replace(",", "."));
		System.out.println("Digite o segundo salário:");
		double input2 = Double.parseDouble(input.next().replace(",", "."));
		System.out.println("Digite o terceiro salário:");
		double input3 = Double.parseDouble(input.next().replace(",", "."));
		System.out.println(input1 + "\t" + input2 + "\t" + input3);
		double media = (input1 + input2 + input3)/3.0;
		System.out.printf("A média de salário é de: "+media);
		input.close();
	}
}
