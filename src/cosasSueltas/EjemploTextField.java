package cosasSueltas;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;

public class EjemploTextField {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("Ejemplo JTextField");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		 
		Container contenedor = frame.getContentPane();
		//El layout por defecto de JFrame es BorderLayout, pero prefiero flow para este caso
		contenedor.setLayout(new FlowLayout());
		
		JLabel nifLabel = new JLabel("NIF: ");
		contenedor.add(nifLabel);
		
		//El parámetro del constructor es el ancho del TextField
		JTextField nif = new JTextField(20);
		contenedor.add(nif);
		
		
		nif.addActionListener(new EscuchadoraActionTextField());
		nif.addCaretListener(new EscuchadoraCaretTextField());
		
		frame.pack();
		
		frame.setVisible(true);
	}
	
	
	private static class EscuchadoraActionTextField implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.out.println("Enter en el TextField");
			
			
		}		
	}
	
	private static class EscuchadoraCaretTextField implements CaretListener{

		
			@Override
			public void caretUpdate(CaretEvent e) {
				// TODO Auto-generated method stub
				System.out.println(e.getDot());
		        System.out.println(e.getMark());
			}
		
		
	}

}
