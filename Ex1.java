package ListaExercicios;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		//Faça um programa que receba três inteiros e diga qual deles é o maior.
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o 1º número: ");
		int a = ler.nextInt();
		
		System.out.println("Digite o 2º número: ");
		int b = ler.nextInt();
		
		System.out.println("Digite o 3º número: ");
		int c = ler.nextInt();
		
		if(a>b && a>c) {
			System.out.println("O maior número é o "+a);
		}
		
		else if(b>a && b>c) {
			System.out.println("O maior número é o "+b);
		}
		
		else if(c>b && c>a) {
			System.out.println("O maior número é o "+c);
		}
		
		else {
			System.out.println("Há números iguais. Logo, não há um único número.");
		}

	}

}
