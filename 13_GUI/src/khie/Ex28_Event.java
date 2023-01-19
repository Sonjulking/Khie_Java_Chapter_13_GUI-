package khie;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


import javax.swing.*;

// 2. Adapter 클래스를 구현하는 방법
class B extends MouseAdapter {

	@Override
	public void mouseClicked(MouseEvent e) {
		
		JOptionPane.showMessageDialog(null, "시스템 종료");
		
		System.exit(0);   // 시스템을 종료시키는 메서드.
	}
	
}

public class Ex28_Event extends JFrame {
	
	public Ex28_Event() {
	
		JPanel container = new JPanel();
		
		JButton exit = new JButton("종 료");
		
		container.add(exit);
		
		add(container);
		
		setBounds(100, 100, 300, 300);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setVisible(true);
		
		// B b = new B();
		
		exit.addMouseListener(new B());
		
	}

	public static void main(String[] args) {
		
		new Ex28_Event();

	}

}
