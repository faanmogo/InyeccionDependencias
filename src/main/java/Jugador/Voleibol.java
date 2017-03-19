package Jugador;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Voleibol implements Deporte{
	
	//variables
	@Value("Voleibol")
	private String mostrar;
	String horario = "Tarde";
	

	// constructores
	public Voleibol() {
	}

	public Voleibol(String mostrar2, String horario2) {
		this.mostrar = mostrar2;
		this.horario = horario2;
	}

	public String mostrar() {
		return mostrar; // se cambia manualmente lo que se desea retornar
	}

	public String getHorario() {
		return horario;
	}
	
}
