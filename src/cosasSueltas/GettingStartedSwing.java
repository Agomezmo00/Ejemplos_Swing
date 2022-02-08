package cosasSueltas;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;


public class GettingStartedSwing {

	public static void main(String[] args) {
		
		//Hacemos esto para no bloquear el hilo que gestiona los eventos en Swing
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				
				JFrame frame = new JFrame("Ventana simple, BorderLayout y tamaño fijo");
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
				//Creamos un botón para añadir al PANEL de la VENTANA
				JButton jbtn1 = new JButton("1");
				frame.getContentPane().add(jbtn1);
				
				
				//Establecemos el tamaño de la ventana
				frame.setSize(400,400);
				frame.setVisible(true);
				
			}
		
		});
		
		
	}
}
