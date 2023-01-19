package khie;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class Ex25_Layout extends JFrame {
	
	public Ex25_Layout() {
	
		setTitle("성적 처리");
		
		// 컨테이너를 3개를 만들자.
		JPanel container1 = new JPanel();  // 상단-1 컨테이너
		JPanel container2 = new JPanel();  // 상단-2 컨테이너
		JPanel container3 = new JPanel();  // 하단 컨테이너
		
		// 1. 컴포넌트를 만들어 보자.
		// 1-1. 상단-1 컨테이너에 들어갈 컴포넌트를 만들자.
		JLabel jl1 = new JLabel("이 름 : ");
		JTextField jtf1 = new JTextField(10);
		
		// 1-2. 상단-2 컨테이너에 들어갈 컴포넌트를 만들자.
		JLabel jl2 = new JLabel("국 어 : ");
		JTextField jtf2 = new JTextField(3);
		
		JLabel jl3 = new JLabel("영 어 : ");
		JTextField jtf3 = new JTextField(3);
		
		JLabel jl4 = new JLabel("수 학 : ");
		JTextField jtf4 = new JTextField(3);
		
		// 1-4. 가운데 들어갈 컴포넌트를 만들자.
		JTextArea jta = new JTextArea(5, 20);
		JScrollPane jsp = new JScrollPane(
				jta, 
				ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, 
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		jta.setLineWrap(true);
		
		// 1-5. 하단 컨테이너에 들어갈 컴포넌트를 만들자.
		JButton button1 = new JButton("계 산");
		JButton button2 = new JButton("종 료");
		JButton button3 = new JButton("취 소");
		
		
		// 2. 컴포넌트를 컨테이너에 올려야 한다.
		// 2-1. 상단-1 컨테이너에 올라갈 컴포넌트를 올려 주자.
		container1.add(jl1); container1.add(jtf1);
		
		// 2-2. 상단-2 컨테이너에 올라갈 컴포넌트를 올려 주자.
		container2.add(jl2); container2.add(jtf2);
		container2.add(jl3); container2.add(jtf3);
		container2.add(jl4); container2.add(jtf4);
		
		// 2-3. 하단 컨테이너에 올라갈 컴포넌트를 올려 주자.
		container3.add(button1);
		container3.add(button2); container3.add(button3);
		
		
		// 새로운 컨테이너 하나를 만들자.
		JPanel group = new JPanel(new BorderLayout());
		
		// 새로운 컨테이너에 기존의 컨테이너를 올리자.
		group.add(container2, BorderLayout.NORTH);
		group.add(jsp, BorderLayout.CENTER);
		group.add(container3, BorderLayout.SOUTH);
		
		// 3. 컨테이너를 프레임에 올려주어야 한다.
		add(container1, BorderLayout.NORTH);
		add(group, BorderLayout.CENTER);
		
		setBounds(100, 100, 300, 300);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setVisible(true);
		
		
	}

	public static void main(String[] args) {
	
		new Ex25_Layout();
		
	}

}
