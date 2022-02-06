package cosasSueltas;

import java.awt.Component;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;

import javax.swing.JFrame;

public class GettingStartedSwing {

	public static void main(String[] args) {
		
		LookAndFeelInfo info[] = UIManager.getInstalledLookAndFeels();
		System.out.println("Look And Feel Disponibles: ");
		for(LookAndFeelInfo look:info) {
			System.out.println("\t- "+look.getClassName());
		}
		
		
		//Hacemos esto para no bloquear el hilo que gestiona los eventos en Swing
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				JFrame frame = new JFrame("Ventana simple, BorderLayout");
				
				
				//Creamos un botón para añadir al PANEL de la VENTANA
				JButton jbtn1 = new JButton("1");
				
				
				frame.setSize(400,400);
				frame.getContentPane().add(jbtn1);
				frame.setVisible(true);
				
				
				
				
				JFrame frame2 = new JFrame("Ventana con JPanel, FlowLayout");
				JPanel panel = new JPanel();
				
				JButton btn1 = new JButton("Flow Button 1");
				panel.add(btn1);
				JButton btn2 = new JButton("Flow Button 2");
				panel.add(btn2);
				JButton btn3 = new JButton("Flow Button 3");
				panel.add(btn3);
				JButton btn4 = new JButton("Flow Button 4");
				panel.add(btn4);
				JButton btn5 = new JButton("Flow Button 5");
				panel.add(btn5);
				JButton btn6 = new JButton("Flow Button 6");
				panel.add(btn6);
				
				frame2.getContentPane().add(panel);
				frame2.pack();
				frame2.setVisible(true);
				
			
				JFrame frame3 = new JFrame("Ventana con JPanel y BoxLayout");
				JPanel panelF3 = new JPanel();
				panelF3.setLayout(new BoxLayout(panelF3, BoxLayout.PAGE_AXIS));
				
				JButton botonCentrado = new JButton("Centrado");
				botonCentrado.addActionListener(new EscuchadoraBoton());
				
				
				botonCentrado.setAlignmentX(Component.CENTER_ALIGNMENT);
				panelF3.add(botonCentrado);
				
				frame3.getContentPane().add(panelF3);
				frame3.pack(); 
				frame3.setVisible(true);
				
				
				
			}
		
		});
		
		
	}
}
