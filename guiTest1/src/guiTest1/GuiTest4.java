package guiTest1;

import java.awt.*;

public class GuiTest4 extends Frame{

	public GuiTest4() {
		
		
	//���
	Panel p_north=new Panel();
	GridLayout gl=new GridLayout(2,2,10,10);
	p_north.setLayout(gl);
	
	Label lb_from=new Label("������ ��:");
	Label lb_to=new Label("�޴� ��:");
	TextField tf_from=new TextField();
	TextField tf_to=new TextField();
	p_north.add(lb_from);
	p_north.add(tf_from);
	p_north.add(lb_to);
	p_north.add(tf_to);
	
	this.add(p_north,BorderLayout.NORTH);
	
	
	//�ߴ�
	Panel p_center=new Panel(new BorderLayout(5,5));
	Label lb_msg=new Label("�Ʒ��� �޼����� �Է��ϼ���.",Label.CENTER);
	Label lb_title=new Label("�޼���:");
	TextArea ta_content=new TextArea();
	p_center.add(lb_msg,"North");
	p_center.add(lb_title,"West");
	p_center.add(ta_content,"Center");
	
	
	Panel p_center_south=new Panel();
	Button bt_send=new Button("������");
	Button bt_cancel=new Button("���");
	p_center_south.add(bt_send);
	p_center_south.add(bt_cancel);
	p_center.add(p_center_south,"South");
	
	this.add(p_center,"Center");
		
		
	}
	
	@Override
	public Insets getInsets() {
		Insets i=new Insets(45,20,20,20);
		return i;
	}
	
	public static void main(String[] args) {
		
		GuiTest4 gt4=new GuiTest4();
		gt4.setSize(450,300);
		gt4.setVisible(true);
		
	}

}
