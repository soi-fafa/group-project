package guiTest3;
//ȭ�� ��ȯ ��� ����
import java.awt.*;
import java.awt.event.*;

public class ViewChangeTest extends Frame implements ActionListener{
	
	//����и� ������Ʈ
	//������
	MenuBar menubar;
	//�ʰ���
	Menu m_menu;
	//����
	MenuItem mi_class_add,mi_student_add,mi_close;
	Panel p_main;
	
	//main�� ������Ʈ
	Label lb_main_title;
	
	//�ݵ�� ������Ʈ
	Label lb_class_title,lb_class_name,lb_class_teacher,lb_class_msg;
	TextField tf_class_name,tf_class_teacher;
	Button bt_class_result;
	
	
	public ViewChangeTest() {

		//�����ٻ缭
		menubar=new MenuBar();
		//������ ��ġ
		this.setMenuBar(menubar);
		
		//�������� ���������� �������� �ʰ��̴� �߰��� ���� ����
		m_menu=new Menu("�޴�");
		menubar.add(m_menu);
		mi_class_add=new MenuItem("������ ����ϱ�");
		mi_student_add=new MenuItem("�л����� ����ϱ�");
		mi_close=new MenuItem("�ݱ�");
				
		
		m_menu.add(mi_class_add);
		m_menu.add(mi_student_add);
		m_menu.addSeparator();
		m_menu.add(mi_close);
		
		//�г� ������Ʈ�� �����Ҽ� �ִ� �����̳��̸鼭 ���ÿ� ������Ʈ(���� ���̾ƿ� Ȱ���Ҷ� ��)
		p_main=new Panel(new BorderLayout());
		lb_main_title=new Label("�л� �������α׷� v3.0",Label.CENTER);
		p_main.add(lb_main_title);
		this.add(p_main);
		
		//�������� �������ִ� �⺻���̾ƿ��� �������̾ƿ�
		//lb_main_title=new Label("�л� �������α׷� v3.0",Label.CENTER);
		//this.add(lb_main_title);
		
		mi_class_add.addActionListener(this);
		mi_student_add.addActionListener(this);
		mi_close.addActionListener(this);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj=e.getSource();
		if(obj==mi_class_add) {
			this.remove(p_main); //this �ȿ� �ִ� �ٱ��ϸ� �����
			makeClassAddView();
			this.add(p_main);
			this.validate();//ȭ�鿡 ���� ������Ʈ �����
		}else if(obj==mi_student_add) {
			
		}else if(obj==mi_close) {
			System.exit(0);
		}
		
	}
	
	/**������ ���ȭ�� ���� �޼���*/
	public void makeClassAddView() {
		p_main=new Panel(new BorderLayout(5,5));
		//���
		lb_class_title=new Label("������ ����ϱ�",Label.CENTER);
		p_main.add(lb_class_title,"North");
		//�ߴ�
		Panel p_center_temp=new Panel(new GridLayout(2,2,10,10));
		lb_class_name=new Label("�� �̸�:");
		lb_class_teacher=new Label("��� ������:");
		tf_class_name=new TextField();
		tf_class_teacher=new TextField();
		p_center_temp.add(lb_class_name);
		p_center_temp.add(tf_class_name);
		p_center_temp.add(lb_class_teacher);
		p_center_temp.add(tf_class_teacher);
		p_main.add(p_center_temp,"Center");
		//�ϴ�
		Panel p_south_temp=new Panel(new BorderLayout(5,5));
		lb_class_msg=new Label("�޼���:");
		bt_class_result=new Button("����ϱ�");
		p_south_temp.add(lb_class_msg,"Center");
		p_south_temp.add(bt_class_result,"East");
		p_main.add(p_south_temp,"South");
		
		
	}
	
	
	public static void main(String[] args) {

		ViewChangeTest vct=new ViewChangeTest();
		vct.setSize(300,300);
		vct.setVisible(true);
		
		
	}

}
