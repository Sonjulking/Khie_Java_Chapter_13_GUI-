package khie;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;



public class Ex32_Event extends JFrame {

	public Ex32_Event() {
		
		setTitle("글자 이동");
		
		JPanel container = new JPanel();
		
		// 1. 컴포넌트를 만들어 보자.
		JLabel label = new JLabel("JAVA");
		
		// 2. 컴포넌트를 컨테이너에 올려야 한다.
		container.add(label);
		
		// 3. 컨테이너를 프레임에 올려야 한다.
		add(container);
		
		
		setBounds(100, 100, 1000, 500);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setVisible(true);
		
		
		// 4. 이벤트 처리
		// container에서 특정 영역에 마우스를 클릭 시 이벤트 진행
		container.addMouseListener(new MouseListener() {
			
			// 눌려진 마우스 버튼이 떼어질 때
			@Override
			public void mouseReleased(MouseEvent e) {
				
			}
			
			// 마우스 버튼이 눌려질 때
			@Override
			public void mousePressed(MouseEvent e) {
				
				int x = e.getX();  // 마우스 버튼이 눌려질 때의 X 좌표값
				int y = e.getY();  // 마우스 버튼이 눌려질 때의 Y 좌표값
				
				// 라벨 컴포넌트이 위치를 (x, y)로 이동
				label.setLocation(x, y);
			}
			
			// 컴포넌트 위에 올라가 있던 마우스가 해당 컴포넌트를
			// 떠날 때
			@Override
			public void mouseExited(MouseEvent e) {
				
			}
			
			// 컴포넌트 위에 마우스가 올라왔을 때
			@Override
			public void mouseEntered(MouseEvent e) {
					
			}
			
			// 마우스 버튼이 클릭 되었을 때
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});

	}
	
	
	public static void main(String[] args) {

		new Ex32_Event();

	}

}
