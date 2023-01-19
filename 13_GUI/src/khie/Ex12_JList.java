package khie;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;

public class Ex12_JList extends JFrame {
	
	public Ex12_JList() {
		
		setTitle("JList 예제");
		
		JPanel container = new JPanel();
		
		// 1. 컴포넌트를 만들자.
		String[] job = 
			{"회사원", "공무원", "학생", "주부", "무직", "기타"};
		
		JList<String> list = new JList<String>(job);
		
		// 2. 컴포넌트를 컨테이너에 올려야 한다.
		container.add(list);
		
		// 3. 컨테이너를 프레임에 올려야 한다.
		add(container);
		
		setBounds(100, 100, 300, 300);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setVisible(true);
		
	}

	public static void main(String[] args) {
		
		new Ex12_JList();

	}

}
