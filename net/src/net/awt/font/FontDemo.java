package net.awt.font;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Toolkit;

public class FontDemo {
	public static void main(String[] args) {
		/*
		 * [1] ������Ʈ�� ����
		 */ 
		
		Frame frame = new Frame("�޸���");
		frame.setSize(500, 300);
		Toolkit toolkit = Toolkit.getDefaultToolkit(); 
		// toolkit ��ü ����...new �� �ƴ� �޼ҵ� ���Ϲ������ ��ü�� ������Ŵ
		Dimension dim = toolkit.getScreenSize(); // ȭ��ũ��
		
		Label labId = new Label("Hello AWT");
		labId.setBounds(50, 50, 30, 10); // 50, 50�� ��ġ. 30, 10�� ���� ����
		
		Font plain = new Font("Serif", Font.PLAIN, 20);
		Font italic = new Font("Serif", Font.ITALIC, 20);
		Font bold = new Font("Serif", Font.BOLD, 20);
		Font boldItalic = new Font("Serif", Font.ITALIC + Font.BOLD, 20);
		
		/*
		 * [2] ������Ʈ ����
		 */
		labId.setFont(boldItalic);
		frame.setLayout(new FlowLayout());
		frame.add(labId);
		
		/*
		 * [3] ������Ʈ ��üȭ
		 */
		frame.setLocation(dim.width/2, dim.height/2);
		// ��üȭ�鿡�� ����, ������ ��ġ�� �ΰڴ�.
		// Ư�� ����� ���ϴ� �ͺ��� ����ó�� dim �� ����ϸ�
		// �������� ȭ�鿡 ���� �������� ������ ȭ���� ũ�� �۵�
		// �߾� �αٿ� ��ġ�ϰ� ��.
		frame.setVisible(true);
		
	}
}