package cosasSueltas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class EscuchadoraBoton implements ActionListener {
	 @Override
	    public void actionPerformed(ActionEvent e) {
	       
	        
	        System.out.println("Pulsaste el botón:");
	        System.out.println("\tAction Command:"+e.getActionCommand());
	        
	        //Otra forma, quizá menos óptima porque hay que hacer casting etc
	        JButton btn = (JButton)e.getSource();
	        System.out.println("\tTexto: "+btn.getText());
	    }
}
