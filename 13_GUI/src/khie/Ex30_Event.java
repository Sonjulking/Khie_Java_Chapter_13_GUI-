package khie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

// 4. 익명 클래스를 이용하는 방법 - 많이 사용이 됨.
public class Ex30_Event extends JFrame {
	
	public Ex30_Event() {
	
		JPanel container = new JPanel();
		
		JButton exit = new JButton("종 료");
		
		container.add(exit);
		
		add(container);
		
		setBounds(100, 100, 300, 300);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setVisible(true);
		
		// 이벤트 처리
		exit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "시스템 종료");
				
				System.exit(0);   // 시스템을 종료시키는 메서드.
				
			}
		});
		
	}

	public static void main(String[] args) {
	
		new Ex30_Event();
		
	}

}
