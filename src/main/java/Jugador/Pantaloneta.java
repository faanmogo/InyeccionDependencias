package Jugador;

import org.springframework.stereotype.Component;

@Component
public class Pantaloneta implements Vestuario{

	private int numero;
	private String talla;
	
	
	public int getNumero() {
		// TODO Auto-generated method stub
		return numero;
	}
	public String getTalla() {
		// TODO Auto-generated method stub
		return talla;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public void setTalla(String talla) {
		this.talla = talla;
	}
	
	
}
