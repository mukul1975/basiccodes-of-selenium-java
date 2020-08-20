package Roza;

public class interfaceclass implements inerfacepathan,interfacemig{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		inerfacepathan aa=new interfaceclass();
		interfacemig bb=new interfaceclass();
		aa.aslam();
		bb.mig();
	}

	@Override
	public void mig() {
		// TODO Auto-generated method stub
		System.out.println("i am mig");
	}

	@Override
	public void aslam() {
		// TODO Auto-generated method stub
		System.out.println("I am pathan");
	}

}
