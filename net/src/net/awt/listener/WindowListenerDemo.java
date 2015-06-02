package net.awt.listener;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class WindowListenerDemo {
	public static void main(String[] args) {
		/*
		 * [1] ������Ʈ�� ����
		 */ 
		
		Frame frame = new Frame("�޸���");
		frame.setSize(500, 300);
		Toolkit toolkit = Toolkit.getDefaultToolkit(); 
		// toolkit ��ü ����...new �� �ƴ� �޼ҵ� ���Ϲ������ ��ü�� ������Ŵ
		Dimension dim = toolkit.getScreenSize(); // ȭ��ũ��
		
		/*
		 * [2] ������Ʈ ��üȭ
		 */
		frame.setLocation(dim.width/2, dim.height/2);
		
		// ��üȭ�鿡�� ����, ������ ��ġ�� �ΰڴ�.
		// Ư�� ����� ���ϴ� �ͺ��� ����ó�� dim �� ����ϸ�
		// �������� ȭ�鿡 ���� �������� ������ ȭ���� ũ�� �۵�
		// �߾� �αٿ� ��ġ�ϰ� ��.
		frame.addWindowListener(new EventHandler());
		// �̺�Ʈ�� ���ս�Ŵ
		frame.setVisible(true);
		
	}
}

class EventHandler implements WindowListener{

	@Override
	public void windowActivated(WindowEvent e) {
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
	
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// ������ �ݱ� ��ư�� Ŭ������ �� ȣ��
		e.getWindow().setVisible(false);
		e.getWindow().dispose();
		System.exit(0); // 0�� �ǹ̴� �� ������ �������� ���ᰪ�̴�.
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		
	}

	@Override
	public void windowOpened(WindowEvent e) {
		
	}
	
}
