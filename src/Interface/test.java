package Interface;

public class test extends two implements primary,highschool{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
test tt=new test();
tt.freeeducation();
tt.freetution();
primary.freetiffin();
tt.freebook();
tt.phisicalactivities();
tt.nin();
System.out.println(test.minimum_fee);
System.out.println(primary.minimum_fee);

	}

	@Override
	public void freebook() {
		System.out.println("freebook");
		
	}

	@Override
	public void phisicalactivities() {
		System.out.println("phisicalactivities");
		
	}

	@Override
	public void freeeducation() {
		System.out.println("freeeducation");
		
	}

	@Override
	public void freetution() {
		System.out.println("freetution");
		
	}

}
