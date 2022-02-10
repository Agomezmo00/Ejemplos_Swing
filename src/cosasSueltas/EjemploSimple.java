package cosasSueltas;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class EjemploSimple {
	
	
   private JFrame f = new JFrame("Ejemplo de label dinámica"); // create Frame
   int pulsaciones = 0; //Número de veces que se ha pulsado el botón
   JLabel label1 = new JLabel("Has pulsado 0 veces");
   private JButton boton = new JButton("Clic para empezar!");

   public EjemploSimple() {
	  //Marco principal
      f.getContentPane().setLayout(new GridLayout(0, 1));
      boton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            actualizaTextoLabel();
         }
      });
      
      // Add components
      f.add(label1);
      f.add(boton);
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
   }

   public class ListenMenuQuit implements ActionListener {
      public void actionPerformed(ActionEvent e) {
         System.exit(0);
      }
   }

   public class ListenCloseWdw extends WindowAdapter {
      public void windowClosing(WindowEvent e) {
         System.exit(0);
      }
   }

   public void launchFrame() {
      // Display Frame
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      f.pack(); // Adjusts panel to components for display
      f.setVisible(true);
   }

   public static void main(String args[]) {
     EjemploSimple es = new EjemploSimple();
     es.launchFrame();
   }

   public void actualizaTextoLabel() {
      pulsaciones++;
      System.out.println(pulsaciones);
      label1.setText("Has pulsado "+pulsaciones+" veces");
      f.repaint();
   }
}