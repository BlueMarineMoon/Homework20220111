package org.comstudy21.ex01;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.plaf.basic.BasicOptionPaneUI.ButtonActionListener;

import org.comstudy21.myframe.MyFrame;

public class Ex02BtnEvt extends MyFrame implements ActionListener {
   private Button[] btnArr = new Button[2];
   {
      // �ʱ�ȭ �� - �ʵ带 �ʱ�ȭ �ϴ� ����
      btnArr[0] = new Button("Button1");
      btnArr[1] = new Button("Button2");
   }
   private Label lbl = new Label("[Result] No button pressed");
   public Ex02BtnEvt() {
      super("Button Event Ex", 400, 150);
      start();
      run();
   }

   private void run() {
      // �͸� ���� Ŭ������ �̿��� �̺�Ʈ �ڵ鷯 ó��
      btnArr[0].addActionListener(this);
      
      btnArr[1].addActionListener(this);
   }

   public void start() {
      Panel southPan = new Panel();
      Panel centerPan = new Panel(new GridBagLayout());
      // Panel�� Default Layout�� FlowLayout
      southPan.add(btnArr[0]);
      southPan.add(btnArr[1]);
      centerPan.add(lbl);
      this.add(BorderLayout.SOUTH, southPan);
      this.add(BorderLayout.CENTER, centerPan);
   }

   public static void main(String[] args) {
      new Ex02BtnEvt().setVisible(true);
   }

   @Override
   public void actionPerformed(ActionEvent e) {
      if(btnArr[0].equals(e.getSource())) {
         lbl.setText("[Result] btn1 pressed!!!");
      } else if(btnArr[1].equals(e.getSource())) {
         lbl.setText("[Result] btn2 pressed!!!");
      }
      
//      if(e.getSource() instanceof Button) {
//         Button btn = (Button)e.getSource();
//         if(btnArr[0].equals(btn)) {
//            lbl.setText("[Result] btn1 pressed!");
//         } else if(btnArr[1].equals(btn)) {
//            lbl.setText("[Result] btn2 pressed!");
//         }
//      }
   }
}