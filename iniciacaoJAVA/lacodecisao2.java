package iniciacaoJAVA;

import java.util.Scanner;

/*Fa�a um programa que entre com tr�s n�meros 
 * e coloque em ordem crescente.
 */

public class lacodecisao2 {

	public static void main(String[] args) {
		
      int num1,num2,num3;
      
      Scanner leia = new Scanner(System.in);
      
      System.out.println("Entre com o primeiro valor: ");
      num1 = leia.nextInt();
      System.out.println("Entre com o segundo valor: ");
      num2 = leia.nextInt();
      System.out.println("Entre com o terceiro valor: ");
      num3 = leia.nextInt();
      
      if (num1 > num2 && num2 > num3)
      
    	  System.out.println("A ordem crescente �: "+num3+num2+num1);
      
      
      else if (num2 > num1 && num2 < num3)
    	  
    	  System.out.println("A ordem crescente �: "+num1+num2+num3);
      
      else
    	  
    	  System.out.println("A ordem crescente �: "+num2+num3+num1);
	}
	
	

}
