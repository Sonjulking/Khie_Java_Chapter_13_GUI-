package khie;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class Ex17_ETC extends JFrame {
	
	public Ex17_ETC() {
	
		setTitle("기타 예제");
		
		JPanel container = new JPanel();
		
		// 1. 컴포넌트를 만들어 보자.
		JLabel jl1 = new JLabel("아이디 : ");
		JTextField id = new JTextField(10);
		
		JLabel jl2 = new JLabel("비밀번호 : ");
		JPasswordField pwd = new JPasswordField(10);
		
		JLabel jl3 = new JLabel("하고 싶은 말 : ");
		JTextArea jta = new JTextArea(5, 25);
		
		JScrollPane jsp = new JScrollPane(
				jta, 
				ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, 
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		// JTextArea 컴포넌트에서 자동으로 줄바꿈 기능을
		// 제공해 주는 메서드.
		jta.setLineWrap(true);
		
		// 2. 컴포넌트들을 컨테이너에 올려야 한다.
		container.add(jl1); container.add(id);
		container.add(jl2); container.add(pwd);
		container.add(jl3); container.add(jsp);
		
		// 3. 컨테이너를 프레임에 올려야 한다.
		add(container);
		
		setBounds(100, 100, 200, 300);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setVisible(true);
		
	}

	public static void main(String[] args) {
	
		new Ex17_ETC();

	}

}
