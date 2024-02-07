package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite o primeiro número:");
		double num1 = Double.parseDouble(input.next().replace(",", "."));
		System.out.println("Digite o segundo número:");
		double num2 = Double.parseDouble(input.next().replace(",", "."));
		System.out.println("Digite o tipo de operação realizada");
		String operation = input.next();
		// + - * / %
		double result = 0;
		result = operation.equals("+") ? (num1 + num2) : result;  
		result = operation.equals("-") ? (num1 - num2) : result; 
		result = operation.equals("*") ? (num1 * num2) : result; 
		result = operation.equals("/") ? (num1 / num2) : result; 
		result = operation.equals("%") ? (num1 % num2) : result; 
		System.out.printf("O resultado da operação é: %.1f", result);
		input.close();
	}
}
