package Roza;

public class interfaces implements pathanpara,mirgonj{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pathanpara fi=new interfaces();
		fi.borobaba();
		fi.mejobaba();
		mirgonj mi=new interfaces();
		mi.khanbaba();
		mi.kanomma();
		interfaces ci=new interfaces();
		ci.myself();
		
	}

	@Override
	public void borobaba() {
		// TODO Auto-generated method stub
		System.out.println("He is my borobaba");
	}

	@Override
	public void mejobaba() {
		// TODO Auto-generated method stub
		System.out.println("He is my mejobaba");
	}

	@Override
	public void khanbaba() {
		// TODO Auto-generated method stub
		System.out.println("He is my khanbaba");
	}

	@Override
	public void kanomma() {
		// TODO Auto-generated method stub
		System.out.println("He is my khanomma");
	}
	
	public void myself()
	{
		System.out.println("I m wonself");
	}

}
