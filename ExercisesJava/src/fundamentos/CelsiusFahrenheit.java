package fundamentos;

import java.util.Scanner;

public class CelsiusFahrenheit {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em celcius:");
		double celcius = Double.parseDouble(input.next().replace(",", "."));
		double fahrenheit = (celcius * 1.8) + 32;
		System.out.printf("A temperatura em fahrenheit é de: %.1f", fahrenheit);
		
		input.close();
	}
}
