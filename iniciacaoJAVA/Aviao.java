package iniciacaoJAVA;
/*Crie uma classe avi�o e apresente os atributos e m�todos referentes
esta classe, em seguida crie um objeto avi�o, defina as instancias deste
objeto e apresente as informa��es deste objeto no console.*/

public class Aviao 
{
private String modelo;
private String companhia;
private String nomePiloto;
private String tripulantes;
private int quantidadelugares;

public Aviao(String modelo,String companhia,String nomePiloto,String tripulantes,int quantidadelugares)
{
	this.modelo = modelo;
	this.companhia = companhia;
	this.nomePiloto = nomePiloto;
	this.tripulantes = tripulantes;
	this.quantidadelugares = quantidadelugares;
			
}
public void imprimirInfo()
{
	System.out.println("Modelo do Avi�o: " +modelo+ "\nA companhia �: "+companhia+ "\nNome do piloto �: "+nomePiloto+ "\nTemos uma tripula��o de: "+tripulantes+ "\nN�mero total de passareiros: "+quantidadelugares);
}
public String getModelo() {
	return modelo;
}
public void setModelo(String modelo) {
	this.modelo = modelo;
}
public String getCompanhia() {
	return companhia;
}
public void setCompanhia(String companhia) {
	this.companhia = companhia;
}
public String getNomePiloto() {
	return nomePiloto;
}
public void setNomePiloto(String nomePiloto) {
	this.nomePiloto = nomePiloto;
}
public String getTripulantes() {
	return tripulantes;
}
public void setTripulantes(String tripulantes) {
	this.tripulantes = tripulantes;
}
public int getQuantidadelugares() {
	return quantidadelugares;
}
public void setQuantidadelugares(int quantidadelugares) {
	this.quantidadelugares = quantidadelugares;
}

}
