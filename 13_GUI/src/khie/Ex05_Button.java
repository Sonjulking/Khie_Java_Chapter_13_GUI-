package khie;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;

public class Ex05_Button extends Frame {

	public Ex05_Button() {
	
		setTitle("Button 예제");
		
		// 컨테이너를 만들어 보자.
		Panel container = new Panel();
		
		// 1. 컴포넌트를 만들어야 한다.
		Button button1 = new Button("버튼1");
		
		// 2. 컴포넌트를 컨테이너에 올려야 한다.
		container.add(button1);
		
		// 3. 컨테이너를 프레임에 올려야 한다.
		add(container);
		
		setBounds(100, 100, 300, 300);
		
		setVisible(true);
		
	}
	
	
	public static void main(String[] args) {
		
		new Ex05_Button();

	}

}
