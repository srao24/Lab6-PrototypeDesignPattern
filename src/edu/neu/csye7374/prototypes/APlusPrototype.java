package edu.neu.csye7374.prototypes;

import edu.neu.csye7374.api.GraphPrototypeAPI;

public class APlusPrototype extends GraphPrototypeAPI{
	
	@Override
	public void showMagnitude(int value) {
		String str = "+".repeat(value);
		System.out.println("["+value + "]   " + str);
	}

	@Override
	public void showMagnitude(double value) {
		// TODO Auto-generated method stub
//		int val = (int)value;
//		showMagnitude(val);
		
		StringBuilder sb = new StringBuilder();
		sb.append("["+value+"]:");
		for(int i=0;i<Math.round(value);i++) {
			sb.append("+");
		}
		
	System.out.println(sb.toString());
	}
	
}
