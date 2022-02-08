package cosasSueltas;

import javax.swing.JFrame;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EjemploBorderLayout {

	
	private static class EscuchadorInterno implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.out.println("Has pulsado el boton. Este es el Listener interno");
		}
	} 
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame frame = new JFrame("Border Layout ITACA");
		
		
		frame.addWindowListener(new EscuchadorVentanaAdaptado());
		
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton jb1 = new JButton("DI");
		JButton jb2 = new JButton("SGE");
		JButton jb3 = new JButton("PSP");
		JButton jb4 = new JButton("AD");
		JButton jb5 = new JButton("PMD");
		JButton jb6 = new JButton("Inglés");
		
		jb6.addActionListener(new EscuchadorInterno());
		
		
		JPanel panelEast = new JPanel();
		BoxLayout boxlayout = new BoxLayout(panelEast, BoxLayout.Y_AXIS);
		panelEast.setLayout(boxlayout);
		panelEast.add(jb3);
		panelEast.add(jb6);
		panelEast.add(new JLabel("A�ado una etiqueta a la zona este"));
		
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		panel.add(jb1, BorderLayout.NORTH);
		panel.add(jb2, BorderLayout.SOUTH);
		panel.add(jb4, BorderLayout.WEST);
		panel.add(jb5, BorderLayout.CENTER);
		
		panel.add(panelEast, BorderLayout.EAST);
		
		
		
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
		
	}

}
