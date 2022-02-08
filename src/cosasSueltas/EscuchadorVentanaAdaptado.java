package cosasSueltas;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class EscuchadorVentanaAdaptado extends WindowAdapter {
	
	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("Cerrando la ventana y la aplicación");
		System.exit(0);
		
	}

}
