package iniciacaoJAVA;

import java.util.Scanner;

/* Fa�a um programa em que permita a entrada de um n�mero qualquer e 
 * exiba se este n�mero � par ou �mpar. 
 * Se for par exiba tamb�m a raiz quadrada do mesmo; 
 * se for �mpar exiba o n�mero elevado ao quadrado.
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
			System.out.println("Este n�mero � par: "+num);
		    raiz = Math.sqrt(num);
		    System.out.println("\nE sua raiz �: "+raiz);
		}   
		else 
		{	
			System.out.println("Este n�mero � impar: "+num);
			pot = Math.pow(num, 2);
			System.out.println("\nE sua pot�ncia �: "+pot);
		}	

	}
		
}
