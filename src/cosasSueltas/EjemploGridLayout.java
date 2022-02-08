package cosasSueltas;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.GridLayout;

public class EjemploGridLayout {
	public static void main(String[] args) {
		
		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame frame = new JFrame("Grid Layout ITACA");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(2,3));
		
		JLabel jl1 = new JLabel("Esto es un GRID");
		JButton jb1 = new JButton("DI");
		JButton jb2 = new JButton("SGE");
		JButton jb3 = new JButton("PSP");
		JButton jb4 = new JButton("AD");
		JButton jb5 = new JButton("PMD");
		JButton jb6 = new JButton("Ingl�s");
		
		panel.add(jb1);
		panel.add(jb2);
		panel.add(jb3);
		panel.add(jb4);
		panel.add(jb5);
		panel.add(jl1);
		panel.add(jb6);
		
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
		
		
	}
}
