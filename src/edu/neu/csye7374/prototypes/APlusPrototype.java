package edu.neu.csye7374.prototypes;

public class APlusPrototype {
	
	@Override
	public void showMagnitude(int value) {
		String str = "+".repeat(value);
		System.out.println("["+value + "] " + str);
	}

	@Override
	public void showMagnitude(double value) {
		// TODO Auto-generated method stub
		int val = value;
		showMagnitude(val);
	}
	
}
