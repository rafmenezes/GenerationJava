package iniciacaoJAVA;
/*1) Crie uma classe cliente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informações deste objeto no console.*/

public class Cliente {
	//declaração dos atributos da classe
	private String nomeCliente;
	private int idade;
	private String documento;
	private String endereco;
	
	//método construtor
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
	//declaração dos demais métodos da classe
	
	public void imprimirInfo()
	{
		System.out.println (nomeCliente+ "\nTem uma idade de: "+idade+ "anos \nSeu doc. é: "+documento+ "\nMora na rua: " +endereco);
		
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
