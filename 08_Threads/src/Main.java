import controller.Controller;
import model.Rocket;
import view.View;

public class Main {

	public static void main(String[] args) {
		
		
		View view = new View();
		Controller controller = new Controller(view);
		
		
		controller.addRocket("32WESSDS", new int[] {10, 30, 80});	
		controller.addRocket("LDSFJA32", new int[] {30, 40, 50, 50, 30, 10});
		
		Rocket rocket1 = controller.getRocket(0);
		Rocket rocket2 = controller.getRocket(1);
		
		controller.printRocketInfo(rocket1);
		controller.printRocketInfo(rocket2);
		
		controller.accelerateRocket(rocket1);

	}

}
