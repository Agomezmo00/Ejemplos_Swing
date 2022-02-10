package cosasSueltas;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class EjemploSimple {
   private JFrame f = new JFrame("Basic GUI"); // create Frame
   int pressed = 0; // tracks number of button presses.
   JLabel label1 = new JLabel("You have pressed button " + pressed + "times.");
   private JButton start = new JButton("Click To Start!");

   public EjemploSimple() {
      // Setup Main Frame
      f.getContentPane().setLayout(new GridLayout(0, 1));
      start.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            calculate();
         }
      });
      // Add components
      f.add(label1);
      f.add(start);
      // Allows the Swing App to be closed
      f.addWindowListener(new ListenCloseWdw());
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

   public void calculate() {
	   
	   
      pressed++;
      System.out.println(pressed);
      label1.setText("Has pulsado "+pressed+" veces");
      f.repaint();
   }
}