package polymorphism;

public class prac implements interface1, interface2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		interface1 ps= new prac();
		ps.face1();
		ps.face2();
		interface2 pq=new prac();
		pq.face3();
		pq.face4();
	}

	@Override
	public void face1() {
		// TODO Auto-generated method stub
		System.out.println("face1");
	}

	@Override
	public void face2() {
		// TODO Auto-generated method stub
		System.out.println("face2");
	}

	@Override
	public void face3() {
		// TODO Auto-generated method stub
		System.out.println("face3");
	}

	@Override
	public void face4() {
		// TODO Auto-generated method stub
		System.out.println("face4");	
	}

}
