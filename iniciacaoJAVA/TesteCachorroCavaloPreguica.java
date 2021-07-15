package iniciacaoJAVA;

public class TesteCachorroCavaloPreguica {

	public static void main(String[] args) 
	{
		Cachorro cao = new Cachorro ("Pingo",5,"4patas","cocker","preto","macho");
		cao.ImprimirInfo();
		
		Cavalo crina = new Cavalo ("Pé de Pano",12,"4patas",800,196,"sim");
		crina.ImprimirInfo();
		
		Preguica bicho = new Preguica ("Barrichello",18,"4patas","Folhas e Frutos","11 meses","Médio");
		bicho.ImprimirInfo();
}
	

}
