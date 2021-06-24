package edu.neu.csye7374.prototypes;

import edu.neu.csye7374.api.GraphPrototypeAPI;

public class AComercialAtPrototype extends GraphPrototypeAPI {

	@Override
	public void showMagnitude(int value) {
		int i =0;
		while (i < value) {
			System.out.print("@");
			i++;
		}
		
	}

	@Override
	public void showMagnitude(double value) {
		// TODO Auto-generated method stub
		
	}

	

}
