package controller;

import java.util.ArrayList;
import java.util.List;

import model.Rocket;
import view.View;

public class Controller {
	List <Rocket> rocketList = new ArrayList<>();
	View view;	
	
	public Controller(View view){
		this.view = view;
	}
	
	
	public void addRocket(String rocketName, int[] maxPowerArray) {
		if (rocketName.matches(".{8}")) {
			Rocket rocket = new Rocket(rocketName, maxPowerArray);	
			rocketList.add(rocket);
		}
		else {
			System.out.println("Impossible to add rocket, it need a name o 8 characters");
		}
    }
	
    
    public Rocket getRocket(int number) {
    	return rocketList.get(number);
    }		

	public void printRocketInfo(Rocket rocket) {
		view.printRocketInfo(rocket.getRocket(), rocket.getThrustersPower());
	}
	
    public void accelerateRocket(Rocket rocket) {
    	rocket.accelerateRocket();
    }		
    public void breakRocket(Rocket rocket) {
    	rocket.breakRocket();
    }		
	
	
}
