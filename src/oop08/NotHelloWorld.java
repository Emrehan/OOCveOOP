package oop08;

import javax.swing.*;
import java.awt.*;
public class NotHelloWorld {
   public static void main(String[] args) {
      EventQueue.invokeLater(new Runnable() {
         public void run() {
            NotHelloWorldFrame frame = new NotHelloWorldFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
         }
      });
   }
}
