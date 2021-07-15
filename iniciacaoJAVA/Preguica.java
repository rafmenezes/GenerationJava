package iniciacaoJAVA;

public class Preguica extends Animal
{
	private String alimento;
	private String gestacao;
	private String porte;
	
	public Preguica(String nome,int idade,String patas,String alimento,String gestacao,String porte)
	{
		super(nome,idade,patas);
		
		this.alimento = alimento;
		this.gestacao = gestacao;
		this.porte = porte;
				
	}

	public String getAlimento() {
		return alimento;
	}

	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}

	public String getGestacao() {
		return gestacao;
	}

	public void setGestacao(String gestacao) {
		this.gestacao = gestacao;
	}

	public String getPorte() {
		return porte;
	}

	public void setPorte(String porte) {
		this.porte = porte;
	}
	public void ImprimirInfo()
	{
		System.out.println("\nNome do Animal: "+getNome()+"\nIdade do Animal: "+getIdade()
		+"\nQuantidade de patas é: "+getPatas()+"\nO que a Preguiça come?: "+alimento
		+"\nO tempo de gestação da Preguiça é de?: "+gestacao+"\nO porte da Preguiça é: "+porte);
	}
}

