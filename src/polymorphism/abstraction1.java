package polymorphism;

public class abstraction1 extends abstraction{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		abstraction1 ab=new abstraction1();
		ab.ami();
		ab.tumi();
		ab.amra();
	}

	@Override
	public void ami() {
		// TODO Auto-generated method stub
		System.out.println("ami");
	}

	@Override
	public void tumi() {
		// TODO Auto-generated method stub
		System.out.println("tumi");
	}
	public void amra()
	{
		System.out.println("amra");
	}

}
