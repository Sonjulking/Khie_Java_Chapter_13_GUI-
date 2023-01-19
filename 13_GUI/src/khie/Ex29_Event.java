package khie;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

// 3. Frame 클래스에 Listener 구현하는 방법 - 가장 많이 사용.
public class Ex29_Event extends JFrame implements MouseListener{

	public Ex29_Event() {
	
		JPanel container = new JPanel();
		
		JButton exit = new JButton("종 료");
		
		container.add(exit);
		
		add(container);
		
		setBounds(100, 100, 300, 300);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setVisible(true);
		
		// 이벤트 처리
		exit.addMouseListener(this);
	}
	
	public static void main(String[] args) {
	
		new Ex29_Event();

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		JOptionPane.showMessageDialog(null, "시스템 종료");
		
		System.exit(0);   // 시스템을 종료시키는 메서드.
	}

	@Override
	public void mousePressed(MouseEvent e) {
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		
	}

}
