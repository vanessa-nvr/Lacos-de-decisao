package ListaExercicios;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		/*Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
		*categoria ela se encontra:
		* 10-14 infantil
		* 15-17 juvenil
		* 18-25 adulto*/
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Qual a idade? ");
		int i = ler.nextInt();
		
		if(i>=10 && i<=14) {
			System.out.println("Infantil. Idade = "+i);
		}
		else if(i>=15 && i<=17) {
			System.out.println("Juvenil. Idade = "+i);
		}
		else if(i>=18 && i<=25) {
			System.out.println("Adulto. Idade = "+i);
		}
		else {
			System.out.println("A idade "+i+" não está em nenhuma categoria.");
		}
	}

}
