package cosasSueltas;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class EjemploJLabel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("Ejemplo de JLabel");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		
		String html = "<html>" +
	              "Texto en <b>negrita</b><br/>" +
	              "Texto en <i>cursiva</i><br/>" +
	              "Una lista:" + 
	              "<ol><li>Primer item.</li>" +
	              "<li>Segundo item.</li>" +
	              "</ol>" +
	              "</html>";
	
		JLabel etiqueta = new JLabel(html);
		panel.add(etiqueta);
		
		/*
		 * Más info sobre etiquetas: 
		 * https://docs.oracle.com/javase/tutorial/uiswing/components/label.html
		 */
		
		
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
		
	}
	
	
	

}
