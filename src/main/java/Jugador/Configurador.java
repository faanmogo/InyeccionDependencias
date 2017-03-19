package Jugador;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

import Hello.MessageService;

@Configuration
@ComponentScan
//@Lazy(true) // utilizado para indicar que los bean solo seran activados cuando se les llame
public class Configurador {
	
	// Beans por INSTANCIACION <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
	@Bean
	@Scope("prototype") // si necesito que sean objetos distintos. para objetos iguales utilizo singleton que se activa por defecto
	public Jugador jugador(){
		return new Jugador();
	}
	@Bean
	public Basket basket(){
		return new Basket();
	}
	@Bean
	public Futbol futbol(){
		return new Futbol();
	}
	@Bean
	public Voleibol voleibol(){
		return new Voleibol();
	}
	@Bean
	public Camiseta camiseta(){
		return new Camiseta();
	}
	@Bean
	public Pantaloneta pantaloneta(){
		return new Pantaloneta();
	}
	@Bean
	public Zapatos zapatos(){
		return new Zapatos();
	}
	
	
	// BEANS por INTERFACE **************************************************************************
	
	@Bean
    public Vestuario camisetagenerica() {
        return new Vestuario() {

			public int getNumero() {
				return 90;
			}
			public String getTalla() {
				return "xxl";
			}
          };
    }
	@Bean
    public Vestuario pantalonetagenerica() {
        return new Vestuario() {

			public int getNumero() {
				return 90;
			}
			public String getTalla() {
				return "xxs";
			}
          };
    }
	@Bean
    public Vestuario zapatosgenerica() {
        return new Vestuario() {

			public int getNumero() {
				return 0;
			}
			public String getTalla() {
				return "50";
			}
          };
    }
	
	// Beans por CONSTRUCTOR >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
	
	
	@Bean
	public Jugador constructor(){
		int a = 999999;
		String b = "NOMBRE-CONSTRUCTOR";
		Deporte c = new Voleibol();
		Vestuario d = new Camiseta();
		return new Jugador(a, b, c, d);
	}
	
	@Bean
	public Camiseta camiauto(){
		int numero = 999999;
		String talla = "TALLA-CONSTRUCTOR";
		return new Camiseta(numero, talla);
	}
	
	@Bean
	public Voleibol voleiauto(){
		String mostrar = "DEPORTE-CONSTRUCTOR";
		String horario = "HORARIO-CONSTRUCTOR";
		return new Voleibol(mostrar, horario);
	}
	
	// Beans especificos +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	
	@Bean
	public String pregunta() {
		return "¿Ingreso de Datos?";
	}
	
	@Bean
	public String [] array(){
		String [] talla = {" S ", " M ", " L ", " XL "};
		return talla;
	}
	
	/*
	@Bean
	public String pregunta(String a) {
		return "¿Ingreso de " + a;
	}
	*/
}
