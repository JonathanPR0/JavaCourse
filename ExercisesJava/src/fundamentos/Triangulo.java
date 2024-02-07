package fundamentos;

import java.util.Scanner;

public class Triangulo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Informe o tamanho da base em cm:");
		double base = Double.parseDouble(input.next());
		System.out.println("Informe o tamanho da altura em cm:");
		double height = Double.parseDouble(input.next());
		double area = (base * height)/2;
		System.out.printf("A área do triângulo é de %.1fcm²", area);
		
		input.close();
	}
}
