package khie;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Ex37_Event extends JFrame {

	public Ex37_Event() {
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
		JButton button4 = new JButton("새 창");
		
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
		container4.add(button1); container4.add(button2);
		container4.add(button3); container4.add(button4);
		
		
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
		
		// 4. 이벤트 처리
		// 계산(button1) 버튼을 클릭 시 이벤트 처리
		button1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String coffeeStr = null;  // 커피 종류 문자열 변수
				int price = 0;  // 커피 단가 정수형 변수
				
				if(jrb1.isSelected()) {
					coffeeStr = "아메리카노";
					price = 2500;
				}else if(jrb2.isSelected()) {
					coffeeStr = "카페모카";
					price = 3500;
				}else if(jrb3.isSelected()) {
					coffeeStr = "에스프레소";
					price = 2500;
				}else if(jrb4.isSelected()) {
					coffeeStr = "카페라떼";
					price = 4000;
				}
				
				int amount = 
					Integer.parseInt(jtf1.getText());
				
				int money = 
					Integer.parseInt(jtf2.getText());
				
				// 공급가액 계산 : 단가 * 수량
				int sum = price * amount;
				
				// 부가세액 계산 : 공급가액 * 0.1
				int vat = (int)(sum * 0.1);
				
				// 총금액 : 공급가엑 + 부가세액
				int total = sum + vat;
				
				// 잔액 : 입금액 - 총금액
				int change = money - total;
				
				// 결과를 화면에 출력해 보자.
				jta.append("커피종류 : "+coffeeStr + "\n");
				jta.append("커피단가 : "+String.format("%,d",price) + "원\n");
				jta.append("수   량 : "+amount + "\n");
				jta.append("공급가액 : "+String.format("%,d", sum) + "원\n");
				jta.append("부가세액 : "+String.format("%,d", vat) + "원\n");
				jta.append("총 금 액 : "+String.format("%,d", total) + "원\n");
				jta.append("입 금 액 : "+String.format("%,d", money) + "원\n");
				jta.append("거스름돈 : "+String.format("%,d", change) + "원\n");
				
				// 각각의 컴포넌트 초기화 작업
				jtf1.setText(null); jtf2.setText(null);
				bg.clearSelection();
				
			}
		});
		
		// 종료(button2) 버튼을 클릭 시 이벤트 처리
		button2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
				
			}
		});
		
		// 취소(button3) 버튼을 클릭 시 이벤트 처리
		button3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				// 각각의 컴포넌트 초기화 작업
				jtf1.setText(null); jtf2.setText(null);
				jta.setText(null);
				
				bg.clearSelection();
				
			}
		});
		
		// 새 창(button4) 버튼을 클릭 시 이벤트 처리
		button4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				new Ex15_JTabbedPane();
				dispose();  // 기존에 있던 창은 없애주는 메서드.
				
			}
		});
	}
	
	public static void main(String[] args) {
	
		new Ex37_Event();

	}

}
