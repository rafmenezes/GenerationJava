package iniciacaoJAVA;

import java.util.*;

public class CadastroDoador extends CadastroPNA{
	
	Scanner leia = new Scanner(System.in);
	
	private boolean nome;
	private String rg;
	private String email;
	private String telefone;
	private String localizacao;
	private String pontoRetirada;

	public CadastroDoador(String doador, String entregador, String localizador, boolean nome, String rg
			, String email, String telefone, String localizacao, String pontoRetirada)
	{
		super(doador, entregador, localizador);
		this.nome = nome;
		this.rg = rg;
		this.email = email;
		this.telefone = telefone;
		this.localizacao = localizacao;
		this.pontoRetirada = pontoRetirada;
	}

	public boolean isNome() {
		return nome;
	}

	public void setNome(boolean nome) {
		this.nome = nome;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}

	public String getPontoRetirada() {
		return pontoRetirada;
	}

	public void setPontoRetirada(String pontoRetirada) {
		this.pontoRetirada = pontoRetirada;
	}
	
	public void Mostrar()
	{		
		System.out.println("\t\tCadastro Doador");
		System.out.println("");
		System.out.println("Nome: "+"\nRG:"+"\nE-mail:"+"\nTelefone: ");
		System.out.println("Onde deseja fazer a doação?"
				+"\n1- Casa\t\t2-Outro lugar");
		int escolha = leia.nextInt();
		if(escolha==1)
		{
			System.out.println("Localização A: ");
		}
		else
		{
			System.out.println("Localização B: ");
		}
		
	}

}

