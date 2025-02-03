package guiTest3;
//화면 전환 방법 예시
import java.awt.*;
import java.awt.event.*;

public class ViewChangeTest extends Frame implements ActionListener{
	
	//공통분모 컴포넌트
	//빨래줄
	MenuBar menubar;
	//옷걸이
	Menu m_menu;
	//빨래
	MenuItem mi_class_add,mi_student_add,mi_close;
	Panel p_main;
	
	//main용 컴포넌트
	Label lb_main_title;
	
	//반등록 컴포넌트
	Label lb_class_title,lb_class_name,lb_class_teacher,lb_class_msg;
	TextField tf_class_name,tf_class_teacher;
	Button bt_class_result;
	
	
	public ViewChangeTest() {

		//빨래줄사서
		menubar=new MenuBar();
		//빨래줄 설치
		this.setMenuBar(menubar);
		
		//빨래줄은 셋팅이지만 빨래줄의 옷걸이는 추가로 가는 느낌
		m_menu=new Menu("메뉴");
		menubar.add(m_menu);
		mi_class_add=new MenuItem("반정보 등록하기");
		mi_student_add=new MenuItem("학생정보 등록하기");
		mi_close=new MenuItem("닫기");
				
		
		m_menu.add(mi_class_add);
		m_menu.add(mi_student_add);
		m_menu.addSeparator();
		m_menu.add(mi_close);
		
		//패널 컴포넌트를 부착할수 있는 컨테이너이면서 동시에 컴포넌트(여러 레이아웃 활용할때 씀)
		p_main=new Panel(new BorderLayout());
		lb_main_title=new Label("학사 관리프로그램 v3.0",Label.CENTER);
		p_main.add(lb_main_title);
		this.add(p_main);
		
		//프레임이 가지고있는 기본레이아웃이 보더레이아웃
		//lb_main_title=new Label("학사 관리프로그램 v3.0",Label.CENTER);
		//this.add(lb_main_title);
		
		mi_class_add.addActionListener(this);
		mi_student_add.addActionListener(this);
		mi_close.addActionListener(this);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj=e.getSource();
		if(obj==mi_class_add) {
			this.remove(p_main); //this 안에 있는 바구니를 지운다
			makeClassAddView();
			this.add(p_main);
			this.validate();//화면에 대한 컴포넌트 재검증
		}else if(obj==mi_student_add) {
			
		}else if(obj==mi_close) {
			System.exit(0);
		}
		
	}
	
	/**반정보 등록화면 구성 메서드*/
	public void makeClassAddView() {
		p_main=new Panel(new BorderLayout(5,5));
		//상단
		lb_class_title=new Label("반정보 등록하기",Label.CENTER);
		p_main.add(lb_class_title,"North");
		//중단
		Panel p_center_temp=new Panel(new GridLayout(2,2,10,10));
		lb_class_name=new Label("반 이름:");
		lb_class_teacher=new Label("담당 선생님:");
		tf_class_name=new TextField();
		tf_class_teacher=new TextField();
		p_center_temp.add(lb_class_name);
		p_center_temp.add(tf_class_name);
		p_center_temp.add(lb_class_teacher);
		p_center_temp.add(tf_class_teacher);
		p_main.add(p_center_temp,"Center");
		//하단
		Panel p_south_temp=new Panel(new BorderLayout(5,5));
		lb_class_msg=new Label("메세지:");
		bt_class_result=new Button("등록하기");
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
