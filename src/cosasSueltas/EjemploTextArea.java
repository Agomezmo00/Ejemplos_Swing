package cosasSueltas;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import javax.swing.text.BadLocationException;

public class EjemploTextArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				JFrame frame = new JFrame("Ejemplo JTextArea");
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
				
				
				 
				Container contenedor = frame.getContentPane();
				
				//El layout por defecto de JFrame es BorderLayout, pero prefiero flow para este caso
				contenedor.setLayout(new FlowLayout());
				
				JLabel comentarios = new JLabel("Introduce tus comentarios: ");
				contenedor.add(comentarios);
				
				
				JTextArea textoLargo = new JTextArea(15, 30);
				JScrollPane scroll = new JScrollPane(textoLargo);
				
				
				
				
				
				contenedor.add(scroll);
				
				
				
				textoLargo.addCaretListener(new EscuchadoraCaretTextArea());
				
				frame.pack();
				
				frame.setVisible(true);
	}
	
	private static class EscuchadoraCaretTextArea implements CaretListener{

		@Override
		public void caretUpdate(CaretEvent e) {
			// TODO Auto-generated method stub
			int posicion = e.getDot();
	        try {
	        	JTextArea texto = (JTextArea)e.getSource();
	            int linea = texto.getLineOfOffset(posicion);
	            int columna = posicion - texto.getLineStartOffset(linea);
	            String infoTexto = "Linea: " + (linea+1) + 
	                            "; Columna: " + (columna+1);
	            System.out.println(infoTexto);
	        } catch (BadLocationException e1) {
	            e1.printStackTrace();
	        }
		}
		
	}

}
