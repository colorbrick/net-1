package net.api.frame;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Notepad extends Frame {

	private static final long serialVersionUID = 1L;
	
	private TextArea textArea = new TextArea();
	private Font font = new Font("�ü�ü", Font.BOLD, 30);
	
	public Notepad() {
		textArea.setFont(font);
		this.add(textArea);
		
		// ȭ�� ������ ��� ũ�� �����
		this.setTitle("�޸���");
		
		Panel panel = new Panel();
		panel.setBackground(Color.YELLOW);
		add(panel);
		
//		this.setBackground(Color.YELLOW); // ����ȭ�� ������ �ַ��� Panel�� �־�� ��
		this.setBounds(100, 100, 600, 450); // ��ǥ, ����, ����
		this.setVisible(true); // ȭ���� �����ֱ�
		
		ExitAdapter exitAdapter = new ExitAdapter();
		this.addWindowListener(exitAdapter);
	}
	
	public static void main(String[] args) {
		new Notepad(); // ��ü �̸��� ���� ==> ��ϸӽ�
	}
	
	class ExitAdapter extends WindowAdapter{
		@Override
		public void windowClosing(WindowEvent e) {
			System.out.println("������ â�� �ݽ��ϴ�.");
			System.exit(1);
			// ��¥ ����ó�� ... ���� ���� ���� ���α׷��� ������� ���
		}
	}
	
}
