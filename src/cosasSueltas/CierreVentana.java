package cosasSueltas;


import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CierreVentana {
	
	
	private static class EscuchadoraInterna extends WindowAdapter{
		@Override
		public void windowClosing(WindowEvent e) {
			System.out.println("Cerrando la app con un escuchador del cierre de la ventana. El escuchador está en una clase interna");
			System.exit(0);
		}
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		JFrame frame = new JFrame("Ventana con cierre");
		frame.addWindowListener(new EscuchadoraInterna());
		
		JPanel panel = new JPanel();
		
		
		
		JLabel label = new JLabel("Etiqueta en ventana con escuchadores");
		panel.add(label);
		
		JButton jbtn = new JButton("Pulsa aquí");
		jbtn.setActionCommand("1");
		panel.add(jbtn);
		
		jbtn.addActionListener(new EscuchadoraBoton());
		
		
		frame.getContentPane().add(panel);
		
		frame.pack();
		frame.setVisible(true);
	}
	
	

}
