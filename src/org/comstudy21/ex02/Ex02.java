package org.comstudy21.ex02;

import javax.swing.JFrame;

public class Ex02 extends JFrame {
	public Ex02() {
		// �ݱ� ��ư ������ �������� �̺�Ʈ ó��
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// Ÿ��Ʋ ����
		setTitle("ù��° ���� �ǽ�");
		// ũ�� ����
		setSize(640, 480);
	}
	
	public static void main(String[] args) {
		new Ex02().setVisible(true);

	}

}
