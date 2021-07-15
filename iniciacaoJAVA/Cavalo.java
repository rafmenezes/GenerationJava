package iniciacaoJAVA;

public class Cavalo extends Animal 
{
private float peso;
private float tamanho;
private String corrida;

public Cavalo(String nome,int idade,String patas,float peso, float tamanho,String corrida)
{
	super(nome,idade,patas);
	
	this.peso = peso;
	this.tamanho = tamanho;
	this.corrida = corrida;
}

public float getPeso() {
	return peso;
}

public void setPeso(float peso) {
	this.peso = peso;
}

public float getTamanho() {
	return tamanho;
}

public void setTamanho(float tamanho) {
	this.tamanho = tamanho;
}

public String getCorrida() {
	return corrida;
}

public void setCorrida(String corrida) {
	this.corrida = corrida;
}
public void ImprimirInfo()
{
	System.out.println("\nNome do Animal: "+getNome()+"\nIdade do Animal: "+getIdade()
	+"\nQuantidade de patas È: "+getPatas()+"\nO peso do Cavalo È: "+peso
	+"\nO tamanho do Cavalo È: "+tamanho+"\n… um Cavalo de corrida: "+corrida);
}
}
