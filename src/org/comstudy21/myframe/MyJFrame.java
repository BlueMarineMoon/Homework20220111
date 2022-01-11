package org.comstudy21.myframe;

import java.awt.Container;

import javax.swing.JFrame;

public abstract class MyJFrame extends JFrame {
   protected Container contentPan = null;
   
   public MyJFrame() {
      this("My JFrame",200,200);
   }
   public MyJFrame(String title, int w, int h)  {
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      setTitle(title);
      setSize(w, h);
      
      displayLayer();
      actionEvent();
   }
   
   protected abstract void displayLayer();
   protected abstract void actionEvent();
}