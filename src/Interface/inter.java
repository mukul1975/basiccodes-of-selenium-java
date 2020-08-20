package Interface;

public class inter implements inter1,inter2{

	public static void main(String[] args) {
		inter t=new inter();
		t.one();
		t.two();
		System.out.println("*********");
		inter1 tt=new inter();
		tt.one();
		System.out.println(tt.a);
		System.out.println("*********");
		inter2 ttt=new inter();
		ttt.two();
		System.out.println(inter1.a);
		
		
		

	}

	@Override
	public void two() {
		System.out.println("two");
		
	}

	@Override
	public void one() {
		System.out.println("one");
		
	}

}
