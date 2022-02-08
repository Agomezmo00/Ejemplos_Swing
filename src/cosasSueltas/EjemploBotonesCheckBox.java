package cosasSueltas;

import java.awt.Insets;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.BoxLayout;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class EjemploBotonesCheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame frame = new JFrame("Botones con estado no excluyentes");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		
		BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.Y_AXIS);
		
		panel.setLayout(boxlayout);
		panel.setBorder(new EmptyBorder(new Insets(50,100,50,100)));
		
		
		JLabel LblEligeDeportesFavoritos = new JLabel("Elige tus deportes favoritos");
		JCheckBox baloncesto = new JCheckBox("Baloncesto");
		JCheckBox esqui = new JCheckBox("Esqui");
		JCheckBox curling = new JCheckBox("Curling");
		
		panel.add(LblEligeDeportesFavoritos);
		panel.add(baloncesto);
		panel.add(esqui);
		panel.add(curling);
		
		EscuchadorItem escItem = new EscuchadorItem();
		baloncesto.addItemListener(escItem);
		esqui.addItemListener(escItem);
		curling.addItemListener(escItem);
		
		
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
		

	}
	
	
	private static class EscuchadorItem implements ItemListener {

		@Override
		public void itemStateChanged(ItemEvent e) {
			// TODO Auto-generated method stub
			
			JCheckBox origen = (JCheckBox)e.getItemSelectable();
			String comando = origen.getActionCommand();
			
			switch(e.getStateChange()) {
			case ItemEvent.SELECTED:
				System.out.println("Seleccionado: "+comando);
				break;
			case ItemEvent.DESELECTED:
				System.out.println("Deseleccionado: "+comando);
				break;
			
			}
			
		}
		
	}

}
