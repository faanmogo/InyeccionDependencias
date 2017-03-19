package Jugador;

import javax.swing.JOptionPane;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String mensaje = "";
		int x;
		
		AnnotationConfigApplicationContext ann = new AnnotationConfigApplicationContext();
		//System.out.println("antes de config");
		ann.register(Configurador.class);
		ann.refresh();
		//System.out.println("luego de config");
		
		
		
		x = JOptionPane.showOptionDialog(null, ann.getBean("pregunta"), null, 0, 3, null, new String[] {"Manual", "Automatico"}, null);
		if(x == 0)
		{
			Jugador j = (Jugador) ann.getBean("jugador");
			Jugador jj = (Jugador) ann.getBean("jugador");
			System.out.println(j);
			System.out.println(jj);
			j.setCc(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la CC del jugador")));
			j.setNombre(JOptionPane.showInputDialog("Ingrese el nombre del jugador"));
			mensaje += "El jugador " + j.getNombre() + " con cedula " + j.getCc();


			String opc = (String) JOptionPane.showInputDialog(null, "Escoja el Deporte", null, 1, null, new String[] {"basket", "futbol", "voleibol"}, "voleibol");
			Object d = ann.getBean(opc);
			mensaje += "\n Juega al " + ((Deporte) d).mostrar() + " en el horario de la " + ((Deporte) d).getHorario();



			x = JOptionPane.showOptionDialog(null, "¿Se le otorgara Vestuario?", null, 0, 3, null, new String[] {"nuevo", "usado"}, null);
			if(x == 0){
				String [] t = (String[]) ann.getBean("array");

				x = JOptionPane.showOptionDialog(null, "¿Se le otorgara camiseta?", null, 0, 3, null, null, null);
				if (x == 0) {
					Camiseta c = (Camiseta) ann.getBean("camiseta");
					c.setTalla((String) JOptionPane.showInputDialog(null, "Escoja su talla", null, 2, null, t , t[1]));
					mensaje += "\n Tiene camiseta con talla " + c.getTalla();
				}

				x = JOptionPane.showOptionDialog(null, "¿Se le otorgara pantaloneta?", null, 0, 3, null, null, null);
				if (x == 0) {
					Pantaloneta c = (Pantaloneta) ann.getBean("pantaloneta");
					c.setTalla((String) JOptionPane.showInputDialog(null, "Escoja su talla", null, 1, null, t, t[2]));
					mensaje += "\n Tiene pantaloneta con talla " + c.getTalla();
				}

				x = JOptionPane.showOptionDialog(null, "¿Se le otorgaran zapatos?", null, 0, 3, null, null, null);
				if (x == 0) {
					Zapatos c = (Zapatos) ann.getBean("zapatos");
					c.setTalla((String) JOptionPane.showInputDialog(null, "Escoja su numero", null, 2, null, new String[] {"38","40","42"}, "40"));
					mensaje += "\n Tiene zapatos numero " + c.getTalla();
				}
			}
			else{
				Vestuario c = (Vestuario) ann.getBean("camisetagenerica");
				mensaje += "\n Tiene camiseta con talla " + c.getTalla();
				Vestuario p = (Vestuario) ann.getBean("pantalonetagenerica");
				mensaje += "\n Tiene pantaloneta con talla " + p.getTalla();
				Vestuario z = (Vestuario) ann.getBean("zapatosgenerica");
				mensaje += "\n Tiene zapatos numero " + z.getTalla();
			}
		}
		else{
			
			Jugador autoo = (Jugador) ann.getBean("constructor");
			mensaje += "El jugador " + autoo.getNombre() + " con cedula " + autoo.getCc();
			
			Voleibol ddd = (Voleibol) ann.getBean("voleiauto");
			mensaje += "\n Juega al " +  ddd.mostrar() + " en el horario de la " + ddd.getHorario();
			
			Camiseta ccc = (Camiseta) ann.getBean("camiauto");
			mensaje += "\n Tiene camiseta # " + ccc.getNumero() + " con talla " + ccc.getTalla();
			//System.out.println(autoo.getDeporte().getMostrar()); no lo permite hacer porque no tiene valor inicial. tiene @value
			System.out.println(autoo.getDeporte().getHorario());
			System.out.println(autoo.getVestuario().getNumero());
			System.out.println(autoo.getVestuario().getTalla());
		}
			
			
		JOptionPane.showMessageDialog(null, mensaje);
		
		
		((ConfigurableApplicationContext)ann).close();
		// cierra el recurso abierto inicialmente
	}

}
