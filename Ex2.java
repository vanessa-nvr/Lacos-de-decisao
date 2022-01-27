package ListaExercicios;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		//Faça um programa que entre com três números e coloque em ordem crescente.
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o 1º número: ");
		int a = ler.nextInt();
		
		System.out.println("Digite o 2º número: ");
		int b = ler.nextInt();
		
		System.out.println("Digite o 3º número: ");
		int c = ler.nextInt();
		
		if(a>b && a>c) {
			if(b>c) {
				System.out.println(c+"<"+b+"<"+a);
			}
			else {
				System.out.println(b+"<"+c+"<"+a);
			}
		}
		else if(a>=b && a>c) {
				System.out.println(c+"<"+b+"="+a);
		}
		else if(a>=c && a>b) {
			System.out.println(b+"<"+c+"="+a);
		}
		
		else if(b>a && b>c) {
			if(a>c) {
				System.out.println(c+"<"+a+"<"+b);
			}
			else {
				System.out.println(a+"<"+c+"<"+b);
			}
		}
		else if(b>=a && b>c) {
				System.out.println(c+"<"+a+"="+b);
			}
			
		else if(c>b && c>a  ) {
			if(b>a) {
				System.out.println(a+"<"+b+"<"+c);
			}
			else {
				System.out.println(b+"<"+a+"<"+c);
			}
		}
		else if (c>=b && c>a) {
			System.out.println(a+"<"+b+"="+c);
		}
		else {
			System.out.println(c+"="+b+"="+a);
		}

	}
}
