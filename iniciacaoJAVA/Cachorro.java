package iniciacaoJAVA;

public class Cachorro extends Animal
{
private String raca;
private String cor;
private String sexo;

public Cachorro(String nome,int idade,String patas,String raca,String cor,String sexo)
{
	super(nome,idade,patas);
	
	this.raca = raca;
	this.cor = cor;
	this.sexo = sexo;
}

public String getRaca() {
	return raca;
}

public void setRaca(String raca) {
	this.raca = raca;
}

public String getCor() {
	return cor;
}

public void setCor(String cor) {
	this.cor = cor;
}

public String getSexo() {
	return sexo;
}

public void setSexo(String sexo) {
	this.sexo = sexo;
}
public void ImprimirInfo()
{
	System.out.println("Nome do Animal: "+getNome()+"\nIdade do Animal: "+getIdade()
	+"\nQuantidade de patas é: "+getPatas()+"\nA raça do cahorro é: "+raca
	+"\nA cor do cachorro é: "+cor+"\nO sexo do cachorro é: "+sexo);
}

}
