package khie;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex11_JComboBox extends JFrame {

	public Ex11_JComboBox() {
	
		setTitle("JComboBox 예제");
		
		JPanel container = new JPanel();
		
		// 1. 컴포넌트를 만들어 보자.
		String[] job = 
			{"회사원", "공무원", "학생", "주부", "무직", "기타"};
		
		JComboBox<String> jcb = new JComboBox<String>(job);
		
		// JComboBox에서 초기값을 설정하여 화면에 나타내는 방법.
		// jcb.setSelectedIndex(2);
		jcb.setSelectedItem("주부");
		
		
		// 2. 컴포넌트를 컨테이너에 올려야 한다.
		container.add(jcb);
		
		// 3. 컨테이너를 프레임에 올려야 한다.
		add(container);
		
		setBounds(100, 100, 300, 300);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
		new Ex11_JComboBox();

	}

}
