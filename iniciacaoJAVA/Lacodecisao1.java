package iniciacaoJAVA;

import java.util.Scanner;

/*Faça um programa que receba três inteiros 
 * e diga qual deles é o maior.
 */
public class Lacodecisao1 {

	public static void main(String[] args) 
	{
		int valor1,valor2,valor3;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro valor inteiro: ");
		valor1 = leia.nextInt();
		
		System.out.println("Entre com o segundo valor inteiro: ");
		valor2 = leia.nextInt();
		
		System.out.println("Entre com o terceiro valor inteiro: ");
		valor3 = leia.nextInt();
		
		
		
		if (valor1 > valor2)
			
			System.out.println("\nNúmero maior é: "+valor1);
		
		else if(valor2 > valor3)
			
			System.out.println("\nNúmero maior é: "+valor2);
			
		else
		
			System.out.println("\nNúmero maior é: "+valor3);
		

	}

}
