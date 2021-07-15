/*Crie uma hierarquia de classes conforme abaixo com os seguintes atributos e comportamentos 
 * (observe a tabela), utilize os seus conhecimentos e distribua as características 
 * de forma que tudo o que for comum a todos os animais fique na classe Animal: 
 */

package iniciacaoJAVA;

public class Animal 
{
	private String nome;
	private int idade;
	private String patas;

	public Animal(String nome,int idade,String patas)
{
	super();
	this.nome = nome;
	this.idade = idade;
	this.patas = patas;		
}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getPatas() {
		return patas;
	}

	public void setPatas(String patas) {
		this.patas = patas;
	}
	
	public void numeroPatas()
	{
		if (getPatas().length()!=6)
		{
			System.out.println("\nAnimal desconhecido");
		}
		else
		{
			System.out.println("Animal reconhecido");
		}
	}
	
	
}
