package khie;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/*
 * 2. BorderLayout 배치관리자
 *    - 배치 : 동쪽, 서쪽, 남쪽, 북쪽, 중앙
 */

public class Ex19_BorderLayout extends JFrame {
	
	public Ex19_BorderLayout() {
	
		setTitle("BorderLayout 배치관리자");
		
		JPanel container = new JPanel();
		
		// 1. 컴포넌트를 만들어 보자.
		JButton button1 = new JButton("North");
		JButton button2 = new JButton("South");
		JButton button3 = new JButton("East");
		JButton button4 = new JButton("West");
		JButton button5 = new JButton("Center");
		
		// 1-1. 컴포넌트를 올릴 컨테이너의 배치관리자를 정하자.
		// 형식)
		//      new BorderLayout()
		//      new BorderLayout(수평간격, 수직간격)
		//        - 수평간격 : 좌우 컴포넌트 사이의 간격 - 기본값은 0px
		//        - 수직간격 : 상하 컴포넌트 사이의 간격 - 기본값은 0px
		
		container.setLayout(new BorderLayout(10, 20));
		
		// 2. 컴포넌트를 컨테이너에 올려야 한다.
		container.add(button1, BorderLayout.NORTH);
		container.add(button2, BorderLayout.SOUTH);
		container.add(button3, BorderLayout.EAST);
		container.add(button4, BorderLayout.WEST);
		container.add(button5, BorderLayout.CENTER);
		
		// 3. 컨테이너를 프레임에 올려야 한다.
		add(container);
		
		setBounds(100, 100, 300, 300);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setVisible(true);
		
	}

	public static void main(String[] args) {
		
		new Ex19_BorderLayout();
		
	}
}
