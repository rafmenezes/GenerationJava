/*Faça um sistema que leia a idade de uma pessoa expressa em anos, 
 * meses e dias e mostre-a expressa apenas em dias. 
 */

package iniciacaoJAVA;

import java.util.Scanner;

public class PrimeirosExercicios {

	public static void main(String[] args) 
	{
		float idade,dias=365,meses=12;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Entre com a idade desejada: ");
		idade = leia.nextFloat();
		
		idade = idade*dias;
		meses = idade/meses;
	
		
		System.out.printf("\nA idade em dias é: "+idade);
		System.out.printf("\nA idade em meses é: "+meses);
		
		
		
	}


}
