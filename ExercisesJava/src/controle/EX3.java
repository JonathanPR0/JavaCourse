package controle;

import java.util.Scanner;

public class EX3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		/*
		 * Criar um programa que receba duas notas parciais,
		 *  calcular a média final. Se a nota do aluno for 
		 *  maior ou igual a 7.0 imprime no console "Aprovado", 
		 *  se a nota for menor que 7.0 e maior do que 4.0 imprime 
		 *  no console "Recuperação", caso contrário imprime no 
		 *  console "Reprovado".
		 */
		
		System.out.println("Digite a primeira nota:");
		double first = input.nextDouble();
		System.out.println("Digite a segunda nota:");
		double second = input.nextDouble();
		
		double media = (first + second)/2;
		
		if(media >= 7)
			System.out.println("Aprovado");
		else if(media > 4)
			System.out.println("Recuperação");
		else
			System.out.println("Reprovado");
		
		input.close();
	}
}
