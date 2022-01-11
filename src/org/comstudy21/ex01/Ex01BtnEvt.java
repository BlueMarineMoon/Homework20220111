package org.comstudy21.ex01;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.GridBagLayout;
import java.awt.Label;
import java.awt.Panel;

import org.comstudy21.myframe.MyFrame;


public class Ex01BtnEvt extends MyFrame {
   private Button[] btnArr = new Button[2];
   {
      // 초기화 블럭 - 필드를 초기화 하는 구역
      btnArr[0] = new Button("Button1");
      btnArr[1] = new Button("Button2");
   }
   private Label lbl = new Label("[Result] No button pressed");
   public Ex01BtnEvt() {
      super("Button Event Ex", 400, 150);
      start();
   }

   public void start() {
      Panel southPan = new Panel();
      Panel centerPan = new Panel(new GridBagLayout());
      // Panel의 Default Layout은 FlowLayout
      southPan.add(btnArr[0]);
      southPan.add(btnArr[1]);
      centerPan.add(lbl);
      this.add(BorderLayout.SOUTH, southPan);
      this.add(BorderLayout.CENTER, centerPan);
   }

   public static void main(String[] args) {
      new Ex01BtnEvt().setVisible(true);
   }

}