package ListaExercicios;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		//Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o 1� n�mero: ");
		int a = ler.nextInt();
		
		System.out.println("Digite o 2� n�mero: ");
		int b = ler.nextInt();
		
		System.out.println("Digite o 3� n�mero: ");
		int c = ler.nextInt();
		
		if(a>b && a>c) {
			System.out.println("O maior n�mero � o "+a);
		}
		
		else if(b>a && b>c) {
			System.out.println("O maior n�mero � o "+b);
		}
		
		else if(c>b && c>a) {
			System.out.println("O maior n�mero � o "+c);
		}
		
		else {
			System.out.println("H� n�meros iguais. Logo, n�o h� um �nico n�mero.");
		}

	}

}
