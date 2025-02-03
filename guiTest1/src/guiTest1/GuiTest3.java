package guiTest1;

import java.awt.*;

public class GuiTest3 extends Frame{

	public GuiTest3() {
		super("�ǽ�1");
		
		BorderLayout bl=new BorderLayout(10,10);
		this.setLayout(bl);
		//�ߴ�
		Panel p_center=new Panel();
		GridLayout gl=new GridLayout(2,2,10,10);
		p_center.setLayout(gl);
		Button bt1=new Button("bt1");//�̸� ���� ��� x
		Button bt2=new Button("bt2");
		Button bt3=new Button("bt3");
		Button bt4=new Button("bt4");
		p_center.add(bt1);
		p_center.add(bt2);
		p_center.add(bt3);
		p_center.add(bt4);
		
		this.add(p_center,"Center");
		p_center.setBackground(Color.pink);
		
		//�ϴ�
		Panel p_south=new Panel();
		BorderLayout bl2=new BorderLayout(10,10);
		p_south.setLayout(bl2);
		p_south.setBackground(Color.blue);
		Button bt5=new Button("bt5");
		Button bt6=new Button("bt6");
		p_south.add(bt5,"North");
		p_south.add(bt6,"South");
		this.add(p_south,"South");
		
	}
		
		@Override
	public Insets getInsets() { //���۳�Ʈ�� ��輱�� ������ �ټ� �ִ�. FrameŬ������ �������̵�
		Insets i=new Insets(40,20,20,20);
		return i;
	}
	
	
	public static void main(String[] args) {
		
		GuiTest3 gt3=new GuiTest3();
		gt3.setSize(300,300);
		gt3.setVisible(true);
		
	}

}
