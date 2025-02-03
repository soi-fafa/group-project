package guiTest1;

import java.awt.*;

public class GuiTest1 {

	public static void main(String[] args) {

		//Frame(String title)
		Frame f=new Frame("나의 첫 GUI");
		
		f.setSize(300,300); //이 숫자는 픽셀수
		
		
		//f.setVisible(true);//기본값 false로 되어있다
		
		//도화지 처음 생성하면 절차 지향이므로 맨 왼쪽 위에 출력된다.
		
		//f.setLocation(1000,500);//도화지를 어느 위치에 지정할지 ,세로 가로 얼마나 떨어뜨릴지
		
		//Dimension 정보클래스 :정보를 담기위한 클래스 		
		Dimension dim=(Toolkit.getDefaultToolkit().getScreenSize());//무명객체?
		int x=(int)dim.getWidth();
		int y=(int)dim.getHeight();
//		f.setLocation(x,y);
//		System.out.println("x="+x+"/y="+y);
		
		//해상도 반띵하는것
//		x=(int)dim.getWidth()/2;
//		y=(int)dim.getHeight()/2;
//		f.setLocation(x,y);
		
		//실제론 반띵 안되니까 위치조정 필요
		x=(int)dim.getWidth()/2-150;
		y=(int)dim.getHeight()/2-150;
		f.setLocation(x,y);
		
		
		////////////////////////////////////////////////////////////////
		//FlowLayout(int align, int hgap, int vgap)
		//어떤 식으로 만들지 배치하는 배치 관리자
		FlowLayout f1=new FlowLayout(FlowLayout.LEFT,35,35);//배치 간격이 넓어지면 다음 행으로 이동
//		
		
		f.setLayout(f1);//김밥천국에서 아줌마한테 메뉴판을 전달하는 느낌
		
		//BorderLayout (int hgap,int vgap)
		BorderLayout b1=new BorderLayout(20,20);
		f.setLayout(b1);
		
		Button bt1= new Button("bt1");//그냥 버튼 만 만든상태 도화지에 부착해야함
		Button bt2= new Button("bt2");
		Button bt3= new Button("bt3");
		Button bt4= new Button("bt4");
		Button bt5= new Button("bt5");
		
		f.add(bt1,BorderLayout.EAST);//도화지에 버튼을 붙이는 행위,절대배치보다 상대배치 많이씀(디바이스가 너무 많다)
		f.add(bt2,BorderLayout.NORTH);
		f.add(bt3,"Center");
		f.add(bt4,"West");
		f.add(bt5,"South");
		
		////////////////////////////////////////////////////////////////
		f.setVisible(true);
	}

}
