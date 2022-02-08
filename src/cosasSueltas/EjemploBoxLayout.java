package cosasSueltas;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import java.awt.Insets;

public class EjemploBoxLayout {
	
	public static void main(String[] args) {
		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame frame = new JFrame("Box Layout ITACA");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		
		BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.Y_AXIS);
		
		panel.setLayout(boxlayout);
		panel.setBorder(new EmptyBorder(new Insets(100,100,100,100)));
		
		JButton jb1 = new JButton("DI");
		JButton jb2 = new JButton("SGE");
		JButton jb3 = new JButton("PSP");
		JButton jb4 = new JButton("AD");
		JButton jb5 = new JButton("PMD");
		JButton jb6 = new JButton("Inglés");
		
		panel.add(jb1);
		panel.add(jb2);
		panel.add(jb3);
		panel.add(jb4);
		panel.add(jb5);
		panel.add(jb6);
		
		
		EscuchadoraBoton eb = new EscuchadoraBoton();
		jb1.addActionListener(eb);
		jb2.addActionListener(eb);
		jb3.addActionListener(eb);
		jb4.addActionListener(eb);
		jb5.addActionListener(eb);
		jb6.addActionListener(eb);
		
		
		
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);

	}
	
}
