package org.comstudy21.ex04;

import java.awt.BorderLayout;

import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import org.comstudy21.myframe.MyJFrame;

public class Ex04ListSelectionEx extends MyJFrame implements ListSelectionListener {
   JList list;
   JTextField tf;
   
   private void init() {
      String[] str = {"���","���弭��","����","����","����","��ȭ"};
      list = new JList(str);
      tf = new JTextField();
   }
   
   protected void displayLayer() {
      init();
      this.add(new JLabel("��̸� �����ϼ���."), BorderLayout.NORTH);
      this.add(list, BorderLayout.CENTER);
      add(tf, BorderLayout.SOUTH);
   }

   protected void actionEvent() {
      list.addListSelectionListener(this);
   }
   
   public static void main(String[] args) {
      new Ex04ListSelectionEx().setVisible(true);
   }

   public void valueChanged(ListSelectionEvent e) {
      Object[] item;
      String total = "";
      
      JList li = (JList)e.getSource();
      item = li.getSelectedValues();
      for(int i=0; i<item.length; i++) {
         total = total + item[i] + " ";
      }
      
      tf.setText("���� �� �׸� >> " + total);
   }
}