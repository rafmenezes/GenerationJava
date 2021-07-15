/*Escreva um sistema que lê os coeficientes a,b,c,d,e e f 
 * e calcula e mostra os valores de x e y. 
 */


package iniciacaoJAVA;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) 
	{
	
		float a,b,c,d,e,f,x,y;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Entre com o valor de A: ");
		a = leia.nextFloat();
		System.out.println("Entre com o valor de B: ");
		b = leia.nextFloat();
		System.out.println("Entre com o valor de C: ");
		c = leia.nextFloat();
		System.out.println("Entre com o valor de D: ");
		d = leia.nextFloat();
		System.out.println("Entre com o valor de E: ");
		e = leia.nextFloat();
		System.out.println("Entre com o valor de F: ");
		f = leia.nextFloat();
		
		x = (c*e - b*f) / (a*e - b*d);
		
		y = (a*f - c*b) / (a*e -b*d);
		
		System.out.println("O valor de X é: "+x);
		
		System.out.println("O valor de Y é: "+y);
		
	}

}
