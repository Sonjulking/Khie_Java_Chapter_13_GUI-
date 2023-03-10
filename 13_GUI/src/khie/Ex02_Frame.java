package khie;

import java.awt.Frame;

/*
 * Frame을 만드는 방법 - 두번째 방법
 * - Frame 이라는 클래스의 객체를 생성해서 사용.
 */
public class Ex02_Frame {

	public static void main(String[] args) {
		
		Frame frame = new Frame();
		
		// 프레임의 제목 설정
		frame.setTitle("두번째 예제");
		
		// 프레임의 위치 설정
		// frame.setLocation(200, 200);
		
		// 프레임의 크기 설정
		// frame.setSize(300, 300);
		
		// 프레임의 위치 + 프레임의 크기
		frame.setBounds(200, 200, 300, 300);
		
		// 프레임을 화면에 보여 주는 방법
		frame.setVisible(true);

	}

}
