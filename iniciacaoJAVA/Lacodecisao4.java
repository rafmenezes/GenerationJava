package iniciacaoJAVA;

import java.util.Scanner;

/* Faça um programa em que permita a entrada de um número qualquer e 
 * exiba se este número é par ou ímpar. 
 * Se for par exiba também a raiz quadrada do mesmo; 
 * se for ímpar exiba o número elevado ao quadrado.
 */
public class Lacodecisao4 {

	public static void main(String[] args) 
	{
		double num,raiz = 0,pot = 0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Entre com o numero desejado: ");
		num = leia.nextFloat();
		
		if (num % 2 == 0)
		{	 
			System.out.println("Este número é par: "+num);
		    raiz = Math.sqrt(num);
		    System.out.println("\nE sua raiz é: "+raiz);
		}   
		else 
		{	
			System.out.println("Este número é impar: "+num);
			pot = Math.pow(num, 2);
			System.out.println("\nE sua potência é: "+pot);
		}	

	}
		
}
