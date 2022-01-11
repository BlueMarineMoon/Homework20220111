package org.comstudy21.ex02;

import javax.swing.JFrame;

public class Ex02 extends JFrame {
	public Ex02() {
		// 닫기 버튼 누를때 강제종료 이벤트 처리
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// 타이틀 지정
		setTitle("첫번째 스윙 실습");
		// 크기 설정
		setSize(640, 480);
	}
	
	public static void main(String[] args) {
		new Ex02().setVisible(true);

	}

}
