package cosasSueltas;

import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;

public class LookAndFeelDisponibles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LookAndFeelInfo info[] = UIManager.getInstalledLookAndFeels();
		System.out.println("Look And Feel Disponibles: ");
		for(LookAndFeelInfo look:info) {
			System.out.println("\t- "+look.getClassName());
		}
	}

}
