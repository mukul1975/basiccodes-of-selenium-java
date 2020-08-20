package inheritance;

public class pprent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		child cd=new child();
		cd.start();
		cd.stop();
		cd.speed();
		cd.slow();
		cd.gparent();
		cd.ggparent();
		
		
	
		System.out.println("********");
		parent pn=new parent();
		pn.start();
		pn.stop();
		pn.speed();
		pn.gparent();
		pn.ggparent();
		System.out.println("***********");
	
		parent pm=new child();
		pn.start();
		pm.stop();
		pm.speed();
		pm.gparent();
		pm.ggparent();
		
				
				
	}

}
