package Jugador;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Camiseta implements Vestuario{

	// variables
	private int numero = 15;
	private String talla = "talla-por-defecto";
	
	
	//constructor
	public Camiseta() {
	}
	
	public Camiseta(int numero2, String talla2) {
		this.numero = numero2;
		this.talla = talla2;
	}
	
	


	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getTalla() {
		return talla;
	}
	public void setTalla(String talla) {
		this.talla = talla;
	}
	
	
}
