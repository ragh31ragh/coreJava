package rdtest.coreJava;

public class OverridingChild extends OverridingParent{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OverridingChild o = new OverridingChild();
		o.AudioSystem();
		

	}
	
	public void AudioSystem() {
		System.out.println("Child Audio System");
	}


}
