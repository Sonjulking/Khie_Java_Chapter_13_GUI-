package khie;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Ex35_Event extends JFrame {
	
	public Ex35_Event() {
	
		setTitle("계산기 예제");
		
		// 컨테이너를 3개를 만들어야 한다.
		JPanel container1 = new JPanel();  // 상단-1 컨테이너
		JPanel container2 = new JPanel();  // 상단-2 컨테이너
		JPanel container3 = new JPanel();  // 하단 컨테이너
		JPanel container4 = 
				new JPanel(new BorderLayout());  // 여분 컨테이너
		
		// 1. 컴포넌트를 만들어 보자.
		// 1-1. 상단-1 컨테이너에 들어갈 컴포넌트를 만들자.
		JLabel jl1 = new JLabel("수 1 : ");
		JTextField jtf1 = new JTextField(5);

		JLabel jl2 = new JLabel("수 2 : ");
		JTextField jtf2 = new JTextField(5);
		
		// 1-2. 상단-2 컨테이너에 들어갈 컴포넌트를 만들자.
		JLabel jl3 = new JLabel("연산자 : ");
		JRadioButton jrb1 = new JRadioButton("+");
		JRadioButton jrb2 = new JRadioButton("-");
		JRadioButton jrb3 = new JRadioButton("*");
		JRadioButton jrb4 = new JRadioButton("/");
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(jrb1); bg.add(jrb2);
		bg.add(jrb3); bg.add(jrb4);
		
		// 1-3. 중앙 컨테이너에 들어갈 컴포넌트를 만들자.
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
		// 2-1. 상단-1 컨테이너에 들어갈 컴포넌트들을 올려 주자.
		container1.add(jl1); container1.add(jtf1);
		container1.add(jl2); container1.add(jtf2);
		
		// 2-2. 상단-2 컨테이너에 들어갈 컴포넌트들을 올려 주자.
		container2.add(jl3); 
		container2.add(jrb1); container2.add(jrb2);
		container2.add(jrb3); container2.add(jrb4);
		
		// 2-3. 하단 컨테이너에 들어갈 컴포넌트들을 올려 주자.
		container3.add(button1);
		container3.add(button2); container3.add(button3);
		
		// 2-4. 여분 컨테이너에 기존 컨테이너를 올려 주자.
		container4.add(container2, BorderLayout.NORTH);
		container4.add(jsp, BorderLayout.CENTER);
		container4.add(container3, BorderLayout.SOUTH);
		
		
		// 3. 컨테이너를 프레임에 올려주어야 한다.
		// 컨테이너를 올릴 때 배치를 해서 올려주면 됨.
		
		add(container1, BorderLayout.NORTH);
		add(container4, BorderLayout.CENTER);
		
		
		setBounds(100, 100, 300, 300);
		
		// pack() : JFrame에 올라온 컴포넌트를 알맞게
		//          프레임의 크기를 조절해 주는 메서드.
		
		pack();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setVisible(true);
		
		// 4. 이벤트 처리
		// 계산(button1) 버튼을 클릭 시 이벤트 처리
		button1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				int num1 = 
					Integer.parseInt(jtf1.getText());
				
				int num2 = 
						Integer.parseInt(jtf2.getText());
				
				String result = null;
				
				if(jrb1.isSelected()) {
					result = 
						"결과 >>> "+num1+" + "+num2+" = "+(num1+num2);
				}else if(jrb2.isSelected()) {
					result = 
							"결과 >>> "+num1+" - "+num2+" = "+(num1-num2);
				}else if(jrb3.isSelected()) {
					result = 
							"결과 >>> "+num1+" * "+num2+" = "+(num1*num2);
				}else if(jrb4.isSelected()) {
					result = 
							"결과 >>> "+num1+" / "+num2+" = "+(num1/num2);
				}
				
				jta.setText(result + "\n");
				
				// 입력 받은 컴포넌트들은 모두 초기화 해 주자.
				jtf1.setText(null); jtf2.setText(null);
				
				// 라디오 버튼도 초기화 해 주자.
				bg.clearSelection();
				
				jtf1.requestFocus();
				
			}
		});
		
		// 종료(button2) 버튼을 클릭했을 때 이벤트 처리
		button2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
				
			}
		});
		
		// 취소(button3) 버튼을 클릭했을 때 이벤트 처리
		button3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				// 입력 받은 컴포넌트들은 모두 초기화 해 주자.
				jtf1.setText(null); jtf2.setText(null);
				
				// 라디오 버튼도 초기화 해 주자.
				bg.clearSelection();
				
				jta.setText(null);
				
				jtf1.requestFocus();
				
			}
		});
	}

	public static void main(String[] args) {
	
		new Ex35_Event();

	}

}
