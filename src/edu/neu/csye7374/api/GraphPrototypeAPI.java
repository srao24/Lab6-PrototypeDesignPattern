package edu.neu.csye7374.api;

public abstract class GraphPrototypeAPI implements Cloneable {
	
	public abstract void showMagnitude(int value);
	
	
	public abstract void showMagnitude(double value);
	
	public Object clone() {
		Object clone = null;
		
		try {
			clone  = super.clone();
		} catch (CloneNotSupportedException cloneException) {
			cloneException.printStackTrace();
		}
		
		return clone;
		
	}
	

}
