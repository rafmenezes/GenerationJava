package iniciacaoJAVA;

import java.util.Scanner;

/*2- Fa�a um programa que receba 6 n�meros inteiros e mostre:
� Os n�meros pares digitados;
� A soma dos n�meros pares digitados;
� Os n�meros �mpares digitados;
� A quantidade de n�meros �mpares digitados.*/

public class ArrayVetor2 {

	public static void main(String[] args) {
	
		int[] numeros = new int[6];
		int x,somapares=0,impares=0;
		
		Scanner leia = new Scanner(System.in);
		
		for(x=0;x<6;x++)
		{
			
			System.out.println("Entre com os n�meros: ");
			numeros[x] = leia.nextInt();
		}
			for(x=0;x<6;x++)
			{
				if(numeros[x] % 2 == 0)
				{	
					System.out.println("\n"+numeros[x] + "n�meros pares: ");
					somapares = somapares + numeros[x];
					}
			else 
			{
				impares++;
				System.out.println("\nOs numeros pares s�o: "+numeros[x]);
			}
			
			
			}
			System.out.println("\nA soma dos n�meros pares s�o: "+somapares);
			System.out.println("\nA quantidade de n�meros �mpares: "+impares);
	}

}
