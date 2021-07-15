package iniciacaoJAVA;
/*1) Crie uma classe cliente e apresente os atributos e m�todos referentes
esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informa��es deste objeto no console.*/

public class Cliente {
	//declara��o dos atributos da classe
	private String nomeCliente;
	private int idade;
	private String documento;
	private String endereco;
	
	//m�todo construtor
	public Cliente (String nomeCliente,int idade, String documento, String endereco)
	
	{
		this.nomeCliente = nomeCliente;
		this.idade = idade;
		this.documento = documento;
		this.endereco = endereco;		
	}
	
	public Cliente (String documento)
	{
		this.documento = documento;
	}
	//declara��o dos demais m�todos da classe
	
	public void imprimirInfo()
	{
		System.out.println (nomeCliente+ "\nTem uma idade de: "+idade+ "anos \nSeu doc. �: "+documento+ "\nMora na rua: " +endereco);
		
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	
}
