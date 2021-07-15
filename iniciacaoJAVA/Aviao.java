package iniciacaoJAVA;
/*Crie uma classe avião e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto avião, defina as instancias deste
objeto e apresente as informações deste objeto no console.*/

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
	System.out.println("Modelo do Avião: " +modelo+ "\nA companhia é: "+companhia+ "\nNome do piloto é: "+nomePiloto+ "\nTemos uma tripulação de: "+tripulantes+ "\nNúmero total de passareiros: "+quantidadelugares);
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
