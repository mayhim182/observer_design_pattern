package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingObserverExample {
  JFrame jFrame;

  public static void main(String[] args) {
    SwingObserverExample swingObserverExample = new SwingObserverExample();
    System.out.println("Swing Observer");
    swingObserverExample.go();
  }

  public void go() {
    jFrame = new JFrame();
    JButton jButton = new JButton("Should I do it?");
    jButton.addActionListener(new AngelListener());
    jButton.addActionListener(new DevilListener());

    // Same things can be achieved using Lambda expressions
    jButton.addActionListener(event-> System.out.println("Don't do it, you might regret it!"));
    jButton.addActionListener(event-> System.out.println("Come on, do it!"));

    //Set Frame properties here <--------- code to set up the frame goes here.
    jFrame.getContentPane().add(jButton);
    jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    jFrame.setSize(400, 300);
    jFrame.setVisible(true);
  }

}

class AngelListener implements ActionListener {
  public void actionPerformed(ActionEvent e) {
    System.out.println("Don't do it you might regret it!");
  }
}

class DevilListener implements ActionListener{

  public void actionPerformed(ActionEvent e) {
    System.out.println("Come on, do it!");
  }
}
