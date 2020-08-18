package view;

import java.util.List;

public class View {
	
	public void printRocketInfo(String rocket, List<Integer> thrusterPowerList) {
		System.out.println("The rocket " + rocket + " has " + thrusterPowerList.size() + " thrusters with power: " + thrusterPowerList.toString());
	}
	
}
