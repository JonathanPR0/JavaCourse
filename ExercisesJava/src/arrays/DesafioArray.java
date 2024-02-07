package arrays;

import java.util.Scanner;

public class DesafioArray {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Quantas notas deseja colocar?");
		int qnt = input.nextInt();
		
		double[] notas = new double[qnt];
		
		for(int i = 0; i<notas.length; i++) {
			System.out.printf("Digite a nota %d:\n", i+1);
			double newNote = input.nextDouble();
			notas[i] = newNote;
		}
		
		double total = 0;
		
		for(double nota: notas) {
			total += nota;
		}
		
		System.out.printf("A média das notas é %.1f", total/notas.length);
		
		
		input.close();
	}
}
