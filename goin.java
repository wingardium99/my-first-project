
import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Lighting;
import org.opentutorials.iot.Security;

public class goin {

	public static void main(String[] args) {
		
		
		
		String id = args[0];

		Elevator myElevator = new Elevator(id);
		myElevator.callForUp(1);
		
		
		
		
		Lighting myLighting = new Lighting(id+ " 507 HALL");
		myLighting.on();
		
	

	}

}
