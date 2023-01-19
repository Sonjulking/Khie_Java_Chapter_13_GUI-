package khie;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Ex34_Event extends JFrame {
	
	public Ex34_Event() {
	
		setTitle("간단한 계산기");
		
		// 컨테이너를 3개를 만들어야 한다.
		JPanel container1 = new JPanel();  // 상단 컨테이너
		JPanel container2 = new JPanel();  // 중앙 컨테이너
		JPanel container3 = new JPanel();  // 하단 컨테이너
		
		// 1. 컴포넌트를 만들어 보자.
		// 1-1. 상단 컨테이너에 들어갈 컴포넌트를 만들자.
		JLabel jl1 = new JLabel("수 1 : ");
		JTextField jtf1 = new JTextField(5);

		JLabel jl2 = new JLabel("수 2 : ");
		JTextField jtf2 = new JTextField(5);
		
		JLabel jl3 = new JLabel("연산자 : ");
		JTextField jtf3 = new JTextField(1);
		
		// 1-2. 중앙 컨테이너에 들어갈 컴포넌트를 만들자.
		JTextArea jta = new JTextArea(5, 20);
		
		JScrollPane jsp = new JScrollPane(
				jta, 
				ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, 
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		jta.setLineWrap(true);
		
		// 1-3. 하단 컨테이너에 들어갈 컴포넌트를 만들자.
		JButton button1 = new JButton("계 산");
		JButton button2 = new JButton("종 료");
		JButton button3 = new JButton("취 소");
		
		// 2. 컴포넌트들을 컨테이너에 올려주어야 한다.
		// 2-1. 상단 컨테이너에 들어갈 컴포넌트들을 올려 주자.
		container1.add(jl1); container1.add(jtf1);
		container1.add(jl2); container1.add(jtf2);
		container1.add(jl3); container1.add(jtf3);
		
		// 2-2. 중앙 컨테이너에 들어갈 컴포넌트들을 올려 주자.
		container2.add(jsp);
		
		// 2-3. 하단 컨테이너에 들어갈 컴포넌트들을 올려 주자.
		container3.add(button1);
		container3.add(button2); container3.add(button3);
		
		
		// 3. 컨테이너를 프레임에 올려주어야 한다.
		// 컨테이너를 올릴 때 배치를 해서 올려주면 됨.
		
		add(container1, BorderLayout.NORTH);
		add(container2, BorderLayout.CENTER);
		add(container3, BorderLayout.SOUTH);
		
		setBounds(100, 100, 100, 300);
		
		// pack() : JFrame에 올라온 컴포넌트를 알맞게
		//          프레임의 크기를 조절해 주는 메서드.
		
		pack();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setVisible(true);
		
		
		// 4. 이벤트 처리
		// 4-1. 계산(button1) 버튼을 클릭했을 때 이벤트 처리
		button1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				int su1 = Integer.parseInt(jtf1.getText());
				
				int su2 = Integer.parseInt(jtf2.getText());
				
				String operator = jtf3.getText();
				
				String result = "";
				
				switch(operator) {
					case "+" :
						result = 
						  "결과 >>> "+su1+" + "+su2+" = "+(su1+su2);
						break;
					case "-" :
						result = 
						  "결과 >>> "+su1+" - "+su2+" = "+(su1-su2);
						break;
					case "*" :
						result = 
						  "결과 >>> "+su1+" * "+su2+" = "+(su1*su2);
						break;
					case "/" :
						result = 
						  "결과 >>> "+su1+" / "+su2+" = "+(su1/su2);
						break;
				}  // switch~case문 end
				
				jta.append(result + "\n");
				
				jtf1.setText(null); jtf2.setText(null);
				jtf3.setText("");
				
				jtf1.requestFocus();
				
			}
		});
		
		// 4-2. 종료(button2) 버튼을 클릭했을 때 이벤트 처리
		button2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);  // 시스템을 종료시키는 메서드
				
			}
		});
		
		// 4-3. 취소(button3) 버튼을 클릭했을 때 이벤트 처리
		button3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				// 전체 컴포넌트의 값을 초기화 시키는 작업
				jtf1.setText(null); jtf2.setText(null);
				jtf3.setText(""); jta.setText("");
				
				jtf1.requestFocus();
				
			}
		});
	}

	public static void main(String[] args) {
	
		new Ex34_Event();

	}

}
