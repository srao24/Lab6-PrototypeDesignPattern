package edu.neu.csye7374.prototypes;

import edu.neu.csye7374.api.GraphPrototypeAPI;

public class AStarProtoype extends GraphPrototypeAPI {
	
	@Override
	public void showMagnitude(int value) {
		String str = "*".repeat(value);
		System.out.println("["+value + "] " + str);
	}

	@Override
	public void showMagnitude(double value) {
		// TODO Auto-generated method stub
		int val = (int)value;
		showMagnitude(val);
	}
	
}
