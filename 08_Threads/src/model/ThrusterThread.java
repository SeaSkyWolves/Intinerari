package model;

public class ThrusterThread implements Runnable {
	private Thruster thruster;
	private int targetPower;	
	
	public ThrusterThread(Thruster thruster, int targetPower) {
		this.thruster = thruster;
		this.targetPower = targetPower;
		
	}
	
	
	public void increasePower() {
		if (thruster.getCurrentPower() < thruster.getMaxPower()) {
			thruster.setCurrentPower(thruster.getCurrentPower()+1);
		}		
	}


	public void decreasePower() {

		if (thruster.getCurrentPower() > thruster.getMaxPower()) {
			thruster.setCurrentPower(thruster.getCurrentPower()-1);
		}
	}
	


	
	
	@Override
	public void run() {
		
		int difference = targetPower - thruster.getCurrentPower();
		for (int i = 0; i < difference ;i++ ) {
			if (thruster.getCurrentPower() >= 0 && thruster.getCurrentPower() <= thruster.getMaxPower()) {
				if (targetPower < thruster.getCurrentPower()) {
					decreasePower();
				} else if (targetPower > thruster.getCurrentPower()) {
					increasePower();
				}
			} else {
					
					System.out.println("The target power is bigger than maximum power ");
					break;
			}
			System.out.println(i + "_" + thruster + " Target: " + targetPower + " Current: " + thruster.getCurrentPower() + " Maximum: " + thruster.getMaxPower());
			try {

				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}

	}
}
