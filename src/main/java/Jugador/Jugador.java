package Jugador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Jugador {

	@Value("123456789")
	private int cc;
	
	private String nombre = "Pepito Perez";
	@Autowired
	@Qualifier("voleibol")
	private Deporte deporte;
	@Autowired
	@Qualifier("camiseta")
	private Vestuario vestuario;
	
	
	
	// constructores
	public Jugador() {
	}

	public Jugador(int a, String b, Deporte c, Vestuario d) {
		this.cc = a;
		this.nombre = b;
		this.deporte = c;
		this.vestuario = d;
	}
	
	

	// getter and setters
	public int getCc() {
		return cc;
	}
	public void setCc(int cc) {
		this.cc = cc;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Deporte getDeporte() {
		return deporte;
	}
	public void setDeporte(Deporte deporte) {
		this.deporte = deporte;
	}
	public Vestuario getVestuario() {
		return vestuario;
	}
	public void setVestuario(Vestuario vestuario) {
		this.vestuario = vestuario;
	}
	
	
}
