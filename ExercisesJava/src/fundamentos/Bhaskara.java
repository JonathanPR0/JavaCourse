package fundamentos;

import java.util.Scanner;

public class Bhaskara {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Possuindo o (ax2 + bx + c = 0) como modelo de uma equação do segundo grau informe:");
		System.out.println("O valor de a:");
		double a = Double.parseDouble(input.next());
		System.out.println("O valor de b:");
		double b = Double.parseDouble(input.next());
		System.out.println("O valor de c:");
		double c = Double.parseDouble(input.next());
		double delta = Math.pow(b, 2) - 4 * a * c;
		System.out.printf("O valor de Delta é %.1f\n", delta);
		double result1 = (-b + Math.sqrt(delta))/2*a;
		double result2 = (-b - Math.sqrt(delta))/2*a;
		System.out.printf("Dessa forma temos que os valores são\n%.1f\nou\n%.1f", result1, result2);
		
		input.close();
	}
}
