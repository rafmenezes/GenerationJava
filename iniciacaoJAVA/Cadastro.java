package iniciacaoJAVA;

public class Cadastro 
{
	private String nome;
	private String rg;
	private String datanasc;
	private String email;
	private String telefone;
	private String localiza;
	private String doacao;
	private int quantidade;
	
	public Cadastro(String nome,String rg,String datanasc,String email,String telefone
					,String localiza,String doacao,int quantidade)
	{
		super();
		
		this.nome = nome;
		this.rg = rg;
		this.datanasc = datanasc;
		this.email = email;
		this.telefone = telefone;
		this.localiza = localiza;
		this.doacao = doacao;
		this.quantidade = quantidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getDatanasc() {
		return datanasc;
	}

	public void setDatanasc(String datanasc) {
		this.datanasc = datanasc;
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

	public String getLocaliza() {
		return localiza;
	}

	public void setLocaliza(String localiza) {
		this.localiza = localiza;
	}

	public String getDoacao() {
		return doacao;
	}

	public void setDoacao(String doacao) {
		this.doacao = doacao;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public void validarQuantidade()
	{
		if(getQuantidade() > 0)
		{
			System.out.println("\nCadastro realizado com sucesso");
		}	
		else
		{
			System.out.println("\nQuantidade de doação não reconhecida");
		}
	}
	

}
