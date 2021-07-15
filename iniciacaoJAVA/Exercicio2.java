/* Faça um sistema que leia a idade de uma pessoa expressa em dias 
 * e mostre-a expressa em anos, meses e dias
 */

package iniciacaoJAVA;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args)
	{
float dias,meses;
		
		Scanner leia = new Scanner(System.in);
		
		
		System.out.println("Entre com a quantidade de dias desejado: ");
		dias = leia.nextFloat();
		
		
		dias = dias / 365;
		meses = dias * 12;
		
		
		System.out.printf("\nA idade em anos é: %3.0f",dias);
		System.out.printf("\nA idade em meses é: %3.0f",meses);
		
	}

}
