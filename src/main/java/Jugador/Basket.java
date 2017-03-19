package Jugador;

import org.springframework.stereotype.Component;

@Component
public class Basket implements Deporte {
	
	String horario = "Mañana";
	
	public String mostrar() {
		return "Basket"; // se cambia manualmente lo que se desea retornar
	}

	public String getHorario() {
		return horario;
	}

	
}
