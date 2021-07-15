package iniciacaoJAVA;

public class CadastroPNA 
{
	private String doador;
	private String entregador;
	private String localizador;
	
	public CadastroPNA (String doador, String entregador, String localizador)
	{
		super();
		
		this.doador = doador;
		this.entregador = entregador;
		this.localizador = localizador;
	}

	public String getDoador() {
		return doador;
	}

	public void setDoador(String doador) {
		this.doador = doador;
	}

	public String getEntregador() {
		return entregador;
	}

	public void setEntregador(String entregador) {
		this.entregador = entregador;
	}

	public String getLocalizador() {
		return localizador;
	}

	public void setLocalizador(String localizador) {
		this.localizador = localizador;
	}
	
	public void Informacao()
	{
		System.out.println("\t\tSeja Bem Vindo ao PNA");
	}
	
}
