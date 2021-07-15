package iniciacaoJAVA;

import java.util.Scanner;

/*Solicitar a idade de várias pessoas e imprimir: 
 * Total de pessoas com menos de 21 anos. Total de pessoas com mais de 50 anos. 
 * O programa termina quando idade for =-99. (WHILE)
 */

public class LacoRepeticaoWhile {

	public static void main(String[] args) {

		int idade=0,idamenos=0,idamais=0;
		
		 Scanner leia = new Scanner (System.in); 
		 
		 
		 
		 while(idade!=-99)
		 {
			 System.out.println("Entre com a idade desejada: ");
			 idade = leia.nextInt();
		 
		   if(idade < 21)
		   {
			   idamenos++;
		   }
		   
		   if(idade> 50)
		   {
			   idamais++;
		   }
		   
		 }
			System.out.println("\nO total de pessoas com menos de 21 anos é: "+idamenos);   
			System.out.println("\nO total de pessoas com mais de 50 anos é: "+idamais); 
			 
		   
	}

}
