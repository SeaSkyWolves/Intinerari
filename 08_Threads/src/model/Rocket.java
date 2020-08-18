package model;

import java.util.ArrayList;
import java.util.List;

public class Rocket {	
	
	private String rocketName;
	private List<Thruster> thrusterList = new ArrayList<>();

	
	public Rocket(String rocketName, int[] thrustersArray) { //8 character input
		this.rocketName = rocketName;
		addThrusters(thrustersArray);
	}
	
	public void addThrusters(int[] thrustersArray){	
		for (int maxPowerThruster : thrustersArray) {  
			Thruster thruster = new Thruster(maxPowerThruster);
			thrusterList.add(thruster);		
		}
	}	
	
	public String getRocket() {
		return rocketName;
	}
	
	public List<Thruster> getThrusters() {
		return thrusterList;
	}
	
	public List<Integer> getThrustersPower() {
		List<Integer> thrusterPowerList = new ArrayList<>();
		
		for (Thruster thruster: thrusterList) {
			thrusterPowerList.add(thruster.getMaxPower());
		}		return thrusterPowerList;
	}
	
	public int getNumberOfThrusters() {
		return thrusterList.size();
	}
	
	public void accelerateRocket() {
		
		for (Thruster thruster : getThrusters()) {
			Runnable r = new ThrusterThread(thruster, thruster.getCurrentPower()+10); 
			Thread thread = new Thread(r);
			thread.start();
		}
	}
	
	
	public void breakRocket() {
		for (Thruster thruster : getThrusters()) {
			ThrusterThread tThruster = new ThrusterThread(thruster, thruster.getCurrentPower()-10);
			tThruster.decreasePower();
		}
	}

	
	
	
}
