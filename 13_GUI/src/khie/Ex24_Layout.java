package khie;

import java.awt.BorderLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class Ex24_Layout extends JFrame {
	
	public Ex24_Layout() {
	
		setTitle("계산기 예제-3");
		
		JPanel container1 = new JPanel();  // 상단-1 컨테이너
		JPanel container2 = new JPanel();  // 상단-2 컨테이너
		JPanel container3 = new JPanel();  // 하단 컨테이너
		
		// 1. 컴포넌트를 만들어 보자.
		// 1-1. 상단-1 컨테이너에 올려질 컴포넌트를 만들자.
		JLabel jl1 = new JLabel("수 1 : ");
		JTextField jtf1 = new JTextField(5);
		
		JLabel jl2 = new JLabel("수 2 : ");
		JTextField jtf2 = new JTextField(5);
		
		// 1-2. 상단-1 컨테이너에 올려질 컴포넌트를 만들자.
		JLabel jl3 = new JLabel("연산자 : ");
		JRadioButton jrb1 = new JRadioButton("+");
		JRadioButton jrb2 = new JRadioButton("-");
		JRadioButton jrb3 = new JRadioButton("*");
		JRadioButton jrb4 = new JRadioButton("/");
		JRadioButton jrb5 = new JRadioButton("%");
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(jrb1); 
		bg.add(jrb2); bg.add(jrb3);
		bg.add(jrb4); bg.add(jrb5);
		
		// 1-3. 중앙에 들어갈 컴포넌트를 만들자.
		JTextArea jta = new JTextArea(5, 20);
		
		JScrollPane jsp = new JScrollPane(
				jta, 
				ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, 
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		jta.setLineWrap(true);
		
		// 1-4. 하단 컨테이너에 들어갈 컴포넌트를 만들자.
		JButton button1 = new JButton("계 산");
		JButton button2 = new JButton("종 료");
		JButton button3 = new JButton("취 소");
		
		
		// 2. 컴포넌트들을 컨테이너에 올려주어야 한다.
		// 2-1. 상단-1 컨테이너에 컴포넌트를 올려 주자.
		container1.add(jl1); container1.add(jtf1);
		container1.add(jl2); container1.add(jtf2);
		
		// 2-2. 상단-2 컨테이너에 컴포넌트를 올려 주자.
		container2.add(jl3); container2.add(jrb1);
		container2.add(jrb2); container2.add(jrb3);
		container2.add(jrb4); container2.add(jrb5);
		
		// 2-3. 하단 컨테이너에 컴포넌트를 올려 주자.
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
	
		new Ex24_Layout();
		
	}

}
