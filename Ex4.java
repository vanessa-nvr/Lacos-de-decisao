package ListaExercicios;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		/*Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
		n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for
		�mpar exiba o n�mero elevado ao quadrado.*/

		Scanner ler=new Scanner(System.in);
		
		System.out.println("Digite um n�mero: ");
		int n =ler.nextInt();
		
		if(n%2==0) {
			System.out.printf("O n�mero � "+n+" par. E a sua ra�z �: %.2f",Math.sqrt(n));
		}
		else {
			System.out.printf("O n�mero � "+n+" �mpar. E o seu quadrado �: %.2f",Math.pow(n, 2));
		}
			
	}

}
