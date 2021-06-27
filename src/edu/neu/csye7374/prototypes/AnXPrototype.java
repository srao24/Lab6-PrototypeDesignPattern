package edu.neu.csye7374.prototypes;

import edu.neu.csye7374.api.GraphPrototypeAPI;

public class AnXPrototype extends GraphPrototypeAPI {

    @Override
    public void showMagnitude(int value) {
        // TODO Auto-generated method stub
        StringBuffer buf = new StringBuffer();
        buf.append("[" + value + "]  ");
        for (int i = 0; i < value; i++) {
            buf.append("X");
        }
        System.out.println(buf.toString());
    }

    @Override
    public void showMagnitude(double value) {
        // TODO Auto-generated method stub
        StringBuffer buf = new StringBuffer();
        buf.append("[" + value + "]");
        for (double i = 0; i < Math.round(value); i++) {
            buf.append("X");
        }
        System.out.println(buf.toString());
    }

}
