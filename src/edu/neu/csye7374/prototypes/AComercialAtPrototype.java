package edu.neu.csye7374.prototypes;

import edu.neu.csye7374.api.GraphPrototypeAPI;


public class AComercialAtPrototype extends GraphPrototypeAPI {

	@Override
	public void showMagnitude(int value) {
	StringBuilder sb = new StringBuilder();
	sb.append("["+value+"]:  ");
	for(int i=0;i<value;i++) {
		sb.append("@");
	}
		System.out.println(sb.toString());
	}

	@Override
	public void showMagnitude(double value) {
		StringBuilder sb = new StringBuilder();
		sb.append("["+value+"]:");
		for(int i=0;i<Math.round(value);i++) {
			sb.append("@");
		}
		
	System.out.println(sb.toString());
		
	}

	

}
