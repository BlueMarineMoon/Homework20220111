package org.comstudy21.myframe;

import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyFrame extends Frame {
	// ����Ʈ ������
	public MyFrame() {
		this("my-frame",200,200);
	}

	public MyFrame(String title, int w, int h) {
		setTitle(title);
		setSize(w, h);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
				System.exit(0);
			}
		});
		// ��ũ�� ȭ���� �� ��� ��ġ
		Toolkit tk = this.getToolkit().getDefaultToolkit();
		int scrWidth = (int)tk.getScreenSize().getWidth();
		int scrHeight = (int)tk.getScreenSize().getHeight();	
		int x = scrWidth/2 - w/2;
		int y = scrHeight/2 - h/2;		
		this.setLocation(x,y);
	}
}