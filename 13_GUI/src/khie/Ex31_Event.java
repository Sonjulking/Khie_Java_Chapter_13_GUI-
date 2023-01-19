package khie;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Ex31_Event extends JFrame implements ActionListener {

	JLabel result;
	
	public Ex31_Event() {
	
		setTitle("이벤트 예제");
		
		JPanel container = new JPanel();
		
		// 1. 컴포넌트를 만들어 보자.
		JButton male = new JButton("남자");
		JButton female = new JButton("여자");
		
		JLabel jl1 = new JLabel("당신의 성별은? >>> ");
		
		result = new JLabel("");  // 결과 출력 컴포넌트
		
		// setForeground() : 글자색 지정하는 메서드
		result.setForeground(Color.RED);
		
		// 2. 컴포넌트를 컨테이너에 올려야 한다.
		container.add(male); container.add(female);
		container.add(jl1); container.add(result);
		
		// 3. 컨테이너를 프레임에 올려야 한다.
		add(container);
		
		setBounds(100, 100, 300, 300);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setVisible(true);
		
		// 4. 중요한 작업 - 이벤트 처리
		// 이벤트를 받을 컴포넌트에 이벤트 리스너를 등록하는 작업.
		male.addActionListener(this);
		female.addActionListener(this);
		
		
	}
	
	public static void main(String[] args) {
	
		new Ex31_Event();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		// getActionCommand()
		// ==> 이벤트를 처리한 컴포넌트(버튼)의 타이틀(문자열)을
		//     가져오는 메서드.
		String str = e.getActionCommand();
		
		result.setText(str);
		
	}

}
