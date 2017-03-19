package Jugador;

import org.springframework.stereotype.Component;

@Component
public class Zapatos implements Vestuario {

	private int numero;
	private String talla;
	
	
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
