package cosasSueltas;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class EjemploCamposSerializados implements ActionListener {
	
	
	private JFrame frame = new JFrame("Ejemplo Serializacion");
	private JLabel lblName = new JLabel("Nombre: ");
	private JTextField name = new JTextField(10);
	private JLabel lblComment = new JLabel("Comentarios");
	private JTextArea comments = new JTextArea(10,20);
	private JCheckBox adult = new JCheckBox("Mayor de edad");
	private JButton save = new JButton("Guardar y salir");
	
	
	
	
	public EjemploCamposSerializados() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setLayout(new FlowLayout());
		frame.add(lblName);
		frame.add(name);
		frame.add(adult);
		frame.add(lblComment);
		frame.add(comments);
		frame.add(save);
		
		frame.pack();
		frame.setVisible(true);
		
		
		try {
			FileInputStream fin = new FileInputStream("ficheroDatosUsuario.dat");
			ObjectInputStream oin = new ObjectInputStream(fin);
			
			DatosUsuario du = (DatosUsuario) oin.readObject();
			
			name.setText(du.name);
			adult.setSelected(du.adult);
			comments.setText(du.comments);
			
			
		} catch(Exception e) {
			
		}
		
		save.addActionListener(this);
		
		
	
	}
	
	public void actionPerformed(ActionEvent evt) {
		try {
			FileOutputStream fout = new FileOutputStream("ficheroDatosUsuario.dat");
			ObjectOutputStream out = new ObjectOutputStream(fout);
			
			DatosUsuario du = new DatosUsuario();
			du.name = name.getText();
			du.adult = adult.isSelected();
			du.comments = comments.getText();
			
			out.writeObject(du);
			out.close();
			fout.close();
			
			System.exit(0);
			
		} catch(Exception e) {
			
		}
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new EjemploCamposSerializados();

	}

}

class DatosUsuario implements Serializable {
	String name;
	boolean adult;
	String comments;
}
