package iniciacaoJAVA;

import java.util.Scanner;

/* Fa�a um programa que possua um vetor denominado A que armazene 6 n�meros inteiros. 
 * O programa deve executar os seguintes passos: 
 
(a) Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7. 
(b) Armazene em uma vari�vel inteira (simples) a soma entre os valores das posi��es 
    A[0], A[1] e A[5] do vetor e mostre na tela esta soma. 
(c) Modifique o vetor na posi��o 4, atribuindo a esta posi��o o valor 100. 
(d) Mostre na tela cada valor do vetor A, um em cada linha.*/

public class ArrayVetor1 {

	public static void main(String[] args) {
		
		int [] vetor = {1 , 0, 5, -2, -5, 7};
		int x,somap=0;
		
		Scanner leia = new Scanner(System.in);
		
		for(x=0;x<6;x++)
		{
		somap = vetor[0] + vetor[1] + vetor[5];
		
				vetor[4] = 100;
		}
			System.out.println("\nA soma dos valores �: "+somap);
			
			for(x=0;x<6;x++)
			
			{
				System.out.println("\n O valor" +x+ "="  +vetor[x]);
			
			}
	}

}
