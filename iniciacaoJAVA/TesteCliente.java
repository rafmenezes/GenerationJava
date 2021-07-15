package iniciacaoJAVA;

public class TesteCliente {

	public static void main(String[] args) 
	{
	//instaciando um objeto da classe automovel
		Cliente clit = new Cliente("Rafael Menezes",29,"123456","Paisagem noturna");
		
		
		System.out.println("\t\tMeu Cliente");
		clit.setNomeCliente("Rafael Menezes");
		clit.setIdade(29);
		clit.setDocumento("123456");
		clit.setEndereco("Paisagem noturna");
		clit.imprimirInfo();

	}

}
