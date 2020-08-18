package model;

public class Thruster {
	
	private int maxPower;
	private int currentPower = 0;
	
	public Thruster (int maxPower) {
		this.maxPower = maxPower;
	}
	
	public int getMaxPower() {
		return this.maxPower;
	}
	
	public int getCurrentPower() {
		return currentPower;
	}
	
	public void setCurrentPower(int power) {
		this.currentPower = power;
	}	
	
}
