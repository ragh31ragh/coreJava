package rdtest.coreJava;

public class ChildEmirites extends ParentAircraft{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChildEmirites c = new ChildEmirites();
		c.bodycolour();
		c.engine();
		c.SafetyGuidelines();

	}
	
	

	@Override
	public void bodycolour() {
		// TODO Auto-generated method stub
		System.out.println("Red Colour on the body");
		
	}
	

}
