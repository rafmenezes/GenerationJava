package iniciacaoJAVA;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*Crie uma um programa para trabalhar com estoque de uma loja
 *o programa deverá trabalhar com Collection do tipo List do Java 
 *para manipular os dados desse estoque, o programa deverá atender as seguintes funcionalidades:
 Armazenar dados da List
Remover dados da list;
Atualizar dados da list.
Apresentar todos os dados da list.*/

public class Colection {

	public static void main(String[] args) 
	{
		int op;
		Scanner leia = new Scanner (System.in);
		
		ArrayList<String> estoque = new ArrayList();
		
		do {
			System.out.println("\n(1)Deseja adicionar produtos ao estoque\n"
					+ "(2)Deseja remover um produto? \n(3)Atualizar\n(4)Mostrar todos os produtos do estoque"
					+ "\n(0) Encerrar o programa");
			System.out.println("\n-----------------------------------------");
			System.out.println("\n\t\tDigite sua opção: ");
			System.out.println("\n-----------------------------------------");
			op = leia.nextInt();
			
			switch(op)
			{
			case 1:
				leia.nextLine();
				System.out.println("\nDigite o produto para adicionar ao estoque: ");
				String produto = leia.nextLine();//ler uma variável do tipo String
				estoque.add(produto);//adicionar um produto no meu ArrayList
				break;
			case 2:
				leia.nextLine();
				System.out.println("\nDigite o produto para remover do estoque: ");
				String produto1 = leia.nextLine();
				if(estoque.contains(produto1))
				{
					estoque.remove(produto1);
				}
				else
				{
					System.out.println("\nProduto não existe no estoque...");
				}
				System.out.println(estoque);
				break;
			case 3:
				leia.nextLine();
				System.out.println("\nDigite o produto que quer atualizar: ");
				String verifica = leia.nextLine();
				System.out.println("\nDigite o nome do produto que entrará no lugar de "+verifica+" : ");
				String novo = leia.nextLine();
				
				if(estoque.contains(verifica))
				{
					estoque.remove(verifica);
					estoque.add(novo);
				}
				else
				{
					System.out.println("\nProduto não existente...");
				}
				System.out.println(estoque);
				break;
			case 4:
				System.out.println("\nOs produtos do estoque são: ");
				System.out.println(estoque);
				break;
				default:
					System.out.println("\nFinalizou o programa... Volte sempre...");
				
			}
			
		}
		while(op!=0);
	}

}
