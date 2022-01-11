package org.comstudy21.ex03;

import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import org.comstudy21.myframe.MyJFrame;

public class Ex03JOptionPan extends MyJFrame {
   JButton openBtn;
   
   protected void init() {
      openBtn = new JButton("message ����");
   }
   
   protected void displayLayer() {
      init();
      contentPan = getContentPane();
      contentPan.setLayout(new GridBagLayout());
      contentPan.add(openBtn);
   }
   
   protected void actionEvent() {
      openBtn.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            // ��ư�� Ŭ���ϸ� ���̾�α� â ���̰� �ϱ�
            JOptionPane.showMessageDialog(Ex03JOptionPan.this, "ȯ���մϴ�!");
         }
      });
   }
   
   public static void main(String[] args) {
      new Ex03JOptionPan().setVisible(true);
   }

   public static void test01(String[] args) {
      JOptionPane.showMessageDialog(null, "Hello world!");
   }

}