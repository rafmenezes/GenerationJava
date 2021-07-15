package iniciacaoJAVA;

import java.util.Scanner;

/*Crie um programa que leia um número do teclado até que encontre um número igual a zero. 
No final, mostre a soma dos números digitados.(DO...WHILE)*/

public class LacoRepeticaoDoWhile {

	public static void main(String[] args) 
	{
	
		Scanner leia = new Scanner (System.in);
		
		
		double num=0,soma=0;
		
		do
		{
			
			System.out.println("\nDigite 0 para sair: ");
			System.out.println("\nEntre com um número: ");
			num = leia.nextDouble();
			
			soma=soma+num;
			
		} while(num!=0);
		
		System.out.println("A soma é: "+soma);
		
	}

}
