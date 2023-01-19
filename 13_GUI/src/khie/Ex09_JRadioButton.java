package khie;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Ex09_JRadioButton extends JFrame {
	
	public Ex09_JRadioButton() {
	
		setTitle("JRadioButton 예제");
		
		JPanel container = new JPanel();
		
		// 1. 라디오 컴포넌트를 만들어 보자.
		JRadioButton jrb1 = new JRadioButton("게임");
		JRadioButton jrb2 = new JRadioButton("여행", true);
		JRadioButton jrb3 = new JRadioButton("운동");
		JRadioButton jrb4 = new JRadioButton("독서");
		
		// 라디오버튼은 반드시 ButtonGroup에 올려져야 합니다.
		ButtonGroup group = new ButtonGroup();
		group.add(jrb1); group.add(jrb2);
		group.add(jrb3); group.add(jrb4);
		
		// 2. 컴포넌트들을 컨테이너에 올려야 한다.
		container.add(jrb1); container.add(jrb2);
		container.add(jrb3); container.add(jrb4);
		
		// 3. 컨테이너를 프레임에 올려야 한다.
		add(container);
		
		setBounds(100, 100, 300, 300);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setVisible(true);
		
	}

	public static void main(String[] args) {
		
		new Ex09_JRadioButton();

	}

}
