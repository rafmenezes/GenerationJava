package iniciacaoJAVA;

import java.util.Scanner;

public class PrimeiroPrograma {

	public static void main(String[] args) 
	{
		double nota1,nota2,nota3,media;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com a prmeira nota: ");
		nota1 = leia.nextFloat();
		System.out.println("\nEntre com a segunda nota: ");
		nota2 = leia.nextFloat();
		System.out.println("\nEntre com a terceira nota: ");
		nota3 = leia.nextFloat();
		
		media = (nota1+nota2+nota3)/3;
		
		System.out.println("\nMedia: "+media);
		System.out.printf("\nMedia: %2.2f",media);
		
		nota1 = Math.sqrt(nota2);
		nota2 = Math.pow(nota3,3);
		nota3 = nota1 % 2;
	}

}
