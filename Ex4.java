package ListaExercicios;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		/*Faça um programa em que permita a entrada de um número qualquer e exiba se este
		número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
		ímpar exiba o número elevado ao quadrado.*/

		Scanner ler=new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int n =ler.nextInt();
		
		if(n%2==0) {
			System.out.printf("O número é "+n+" par. E a sua raíz é: %.2f",Math.sqrt(n));
		}
		else {
			System.out.printf("O número é "+n+" ímpar. E o seu quadrado é: %.2f",Math.pow(n, 2));
		}
			
	}

}
