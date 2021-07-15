package iniciacaoJAVA;

import java.util.Scanner;

/*3- Leia uma matriz 3 x 3, conte e 
 * escreva quantos valores maiores que 10 ela possui
 */
public class ArrayMatriz {

	public static void main(String[] args) {
	
      float[][] matriz = new float[3][3];
      int l,c,x=0;
      
      Scanner leia = new Scanner(System.in);
      
      for(l=0;l<3;l++)
      {
    	 for(c=0;c<3;c++) 
    	  {
    		  System.out.println("Entre com os valores: "); 
    		  matriz[l][c] = leia.nextFloat();
    		  
    		  if(l>10 && c>10)
    		  {
    			  x++;
    			  
    		  }
    	  }
      }
      		System.out.println("\nOs valores maiores que 10 são: "+x);
	}
	
	

}
