package fundamentos;

import java.util.Scanner;

public class FahrenheitCelsius {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em Fahrenheit: ");
		double fahrenheit = Double.parseDouble(input.next().replace(",", "."));
		double celcius = (fahrenheit - 32)/1.8;
		System.out.printf("A temperatura em celcius é de: %.1f", celcius);
		
		input.close();
	}
}
