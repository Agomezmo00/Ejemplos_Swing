package cosasSueltas;

import javax.swing.*;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;


public class EjemploGridBagLayout {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("Grid Layout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panel = new JPanel();
        GridBagLayout layout = new GridBagLayout();
        panel.setLayout(layout);
        
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(new JButton("Casi es la hora"), gbc);
        
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
        

	}

}
