package iniciacaoJAVA;

import java.util.Scanner;

/*2- Faça um programa que receba 6 números inteiros e mostre:
• Os números pares digitados;
• A soma dos números pares digitados;
• Os números ímpares digitados;
• A quantidade de números ímpares digitados.*/

public class ArrayVetor2 {

	public static void main(String[] args) {
	
		int[] numeros = new int[6];
		int x,somapares=0,impares=0;
		
		Scanner leia = new Scanner(System.in);
		
		for(x=0;x<6;x++)
		{
			
			System.out.println("Entre com os números: ");
			numeros[x] = leia.nextInt();
		}
			for(x=0;x<6;x++)
			{
				if(numeros[x] % 2 == 0)
				{	
					System.out.println("\n"+numeros[x] + "números pares: ");
					somapares = somapares + numeros[x];
					}
			else 
			{
				impares++;
				System.out.println("\nOs numeros pares são: "+numeros[x]);
			}
			
			
			}
			System.out.println("\nA soma dos números pares são: "+somapares);
			System.out.println("\nA quantidade de números ímpares: "+impares);
	}

}
