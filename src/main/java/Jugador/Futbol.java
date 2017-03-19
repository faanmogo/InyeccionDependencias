package Jugador;

import org.springframework.stereotype.Component;

@Component
public class Futbol implements Deporte{

	String horario = "Noche";
	
	public String mostrar() {
		return "Futbol"; // se cambia manualmente lo que se desea retornar
	}

	public String getHorario() {
		return horario;
	}
	
	
}
