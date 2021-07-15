package iniciacaoJAVA;

public class TesteAviao {

	public static void main(String[] args) 
	{
		Aviao viao = new Aviao("Boing 667","Fly Emirates","Chicão dos Ares","7 pessoas",185);
	
	
	System.out.println("\t\tDados do Avião");
	viao.setModelo("Boing 667");
	viao.setCompanhia("Fly Emirates");
	viao.setNomePiloto("Chicão dos Ares");
	viao.setTripulantes("7 pessoas");
	viao.setQuantidadelugares(185);
	viao.imprimirInfo();
}
}	