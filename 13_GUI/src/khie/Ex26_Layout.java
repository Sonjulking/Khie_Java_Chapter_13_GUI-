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

public class Ex26_Layout extends JFrame {
	
	public Ex26_Layout() {
	
		setTitle("커피 자판기");
		
		// 컨테이너를 4개를 만들자.
		JPanel container1 = new JPanel();  // 상단-1 컨테이너
		JPanel container2 = new JPanel();  // 상단-2 컨테이너
		JPanel container3 = new JPanel();  // 상단-3 컨테이너
		JPanel container4 = new JPanel();  // 하단 컨테이너
		
		// 1. 컴포넌트를 만들어 보자.
		// 1-1. 상단-1 컨테이너에 올려질 컴포넌트를 만들자.
		JLabel jl1 = new JLabel("원하는 커피 선택");
		
		// 1-2. 상단-2 컨테이너에 올려질 컴포넌트를 만들자.
		JRadioButton jrb1 = new JRadioButton("아메리카노(2500)");
		JRadioButton jrb2 = new JRadioButton("카페모카(3500)");
		JRadioButton jrb3 = new JRadioButton("에스프레소(2500)");
		JRadioButton jrb4 = new JRadioButton("카페라떼(4000)");
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(jrb1); bg.add(jrb2);
		bg.add(jrb3); bg.add(jrb4);
		
		// 1-3. 상단-3 컨테이너에 올려질 컴포넌트를 만들자.
		JLabel jl2 = new JLabel("수 량 : ");
		JTextField jtf1 = new JTextField(5);
		
		JLabel jl3 = new JLabel("입금액 : ");
		JTextField jtf2 = new JTextField(10);
		
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
		
		// 2. 컴포넌트들을 컨테이너에 올리자.
		// 2-1. 상단-1 컨테이너에 들어갈 컴포넌트를 올리자.
		container1.add(jl1);
		
		// 2-2. 상단-2 컨테이너에 들어갈 컴포넌트를 올리자.
		container2.add(jrb1); container2.add(jrb2);
		container2.add(jrb3); container2.add(jrb4);
		
		// 2-3. 상단-3 컨테이너에 들어갈 컴포넌트를 올리자.
		container3.add(jl2); container3.add(jtf1);
		container3.add(jl3); container3.add(jtf2);
		
		// 2-4. 하단 컨테이너에 들어갈 컴포넌트를 올리자.
		container4.add(button1);
		container4.add(button2); container4.add(button3);
		
		
		// 새로운 컨테이너를 두 개를 더 만들자.
		JPanel group1 = new JPanel(new BorderLayout());
		JPanel group2 = new JPanel(new BorderLayout());
		
		// group1 컨테이너에는 기존의 container1, container2를
		// 올려 주자.
		group1.add(container1, BorderLayout.NORTH);
		group1.add(container2, BorderLayout.CENTER);
		
		// group2 컨테이너에는 기존의 container3, jsp,
		// container4를 올려 주자.
		group2.add(container3, BorderLayout.NORTH);
		group2.add(jsp, BorderLayout.CENTER);
		group2.add(container4, BorderLayout.SOUTH);
		
		
		// 3. 컨테이너를 프레임에 올려주어야 한다.
		//    ==> 새로 만든 group1, group2 컨테이너를 올리자.
		add(group1, BorderLayout.NORTH);
		add(group2, BorderLayout.CENTER);
		
		setBounds(100, 100, 300, 300);
		
		pack();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setVisible(true);
		
	}

	public static void main(String[] args) {
	
		new Ex26_Layout();

	}

}
