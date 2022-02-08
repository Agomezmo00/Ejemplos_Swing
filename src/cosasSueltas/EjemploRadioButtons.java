package cosasSueltas;

import java.awt.Insets;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EmptyBorder;

public class EjemploRadioButtons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame frame = new JFrame("Botones con estado excluyentes");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		
		BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.Y_AXIS);
		
		panel.setLayout(boxlayout);
		panel.setBorder(new EmptyBorder(new Insets(50,100,50,100)));
		
		
		JLabel LblEligeDeportesFavoritos = new JLabel("Selecciona tu rango de edad");
		panel.add(LblEligeDeportesFavoritos);
		
		JRadioButton UndTwenty = new JRadioButton("Menor de 20");
		JRadioButton TwentyToThirty = new JRadioButton("Entre 20 y 30");
		JRadioButton ThirtyToForty = new JRadioButton("Entre 30 y 40");
		JRadioButton OverForty = new JRadioButton("Más de 40");
		
		
		ButtonGroup GrupoRadio = new ButtonGroup();
		GrupoRadio.add(UndTwenty);
		GrupoRadio.add(TwentyToThirty);
		GrupoRadio.add(ThirtyToForty);
		GrupoRadio.add(OverForty);
		
		
		panel.add(UndTwenty);
		panel.add(TwentyToThirty);
		panel.add(ThirtyToForty);
		panel.add(OverForty);
		
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
		
		
		
		
	}

}
