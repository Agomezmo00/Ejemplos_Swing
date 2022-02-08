package cosasSueltas;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class EjemploFlowLayout {
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("Ventana con JPanel, FlowLayout");
		
		JFrame.setDefaultLookAndFeelDecorated(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
		
		frame.getContentPane().add(panel);
		frame.pack();
		frame.setVisible(true);
	}
}
