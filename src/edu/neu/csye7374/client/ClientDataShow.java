package edu.neu.csye7374.client;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import edu.neu.csye7374.api.GraphPrototypeAPI;
import edu.neu.csye7374.prototypes.*;

/**
 * ClientDataShow: can only output numbers to console output
 * but needs to use Legacy classes to show bar graph output
 *
 */
public class ClientDataShow {
	private Integer[] dataArray = { 3,6,2,5,7,1,4 };
	private List<Integer> dataList = new ArrayList<Integer>(Arrays.asList(dataArray));

	/**
	 * Map to add all the classes so that their objects can be called 
	 */
	private static Map<String, GraphPrototypeAPI> prototype = new HashMap<String, GraphPrototypeAPI>();

	/**
	 * Adding all the prototypes to the map
	 */
	static
	{
		prototype.put("*", new AStarProtoype());
		prototype.put("@", new AComercialAtPrototype());
		prototype.put(".", new ADotPrototype());
		prototype.put("+", new APlusPrototype());
		prototype.put("X", new AnXPrototype());
	}

	/**
	 * @param string - the symbol for the graph prototype
	 * @return object of the clone
	 */
	public static GraphPrototypeAPI getGraph(String s) {
		return (GraphPrototypeAPI) prototype.get(s).clone();
	}
	/**
	 * Comparator for ascending order
	 */
	Comparator<Integer> c = new Comparator<Integer>() {

		@Override
		public int compare(Integer o1, Integer o2) {
			return Integer.compare(o1, o2);
		}
	};

	/**
	 * Comparator for descending order
	 */
	Comparator<Integer> d = new Comparator<Integer>() {

		@Override
		public int compare(Integer o1, Integer o2) {
			return Integer.compare(o2, o1);
		}
	};

	public void sort(Comparator<Integer> c) {
		this.dataList.sort(c);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();

		for (Integer n : this.dataList) {			
			sb.append(n).append("\n");
		}

		return sb.toString();
	}
	public static void demo() {
		System.out.println(ClientDataShow.class.getName() + ".demo()...");
		ClientDataShow asc = new ClientDataShow();
		ClientDataShow dec = new ClientDataShow();

		/**
		 * Sorting in ascending
		 */
		asc.sort(asc.c);

		/**
		 * Sorting in descending
		 */
		dec.sort(dec.d);

		/**
		 * ClientDataShow Original only using numbers
		 */
		{
			/**
			 * Show original data
			 */
			System.out.println("Show original data");
			System.out.println(new ClientDataShow());
			
			/**
			 * Printing the number in Ascending order
			 */
			System.out.println("Printing the number in Ascending order");
			System.out.println(asc);
			
			/**
			 * Printing the number is Descending order  
			 */
			System.out.println("Printing the number is Descending order");
			System.out.println(dec);
		}
		/**
		 * ClientDataShow using AStartPrototype 
		 * for bar graphing the same data
		 */
		{

			/**
			 * Show original data SORTED ASCENDING
			 */
			for (Integer n : asc.dataList) {	
				ClientDataShow.getGraph("*").showMagnitude((int)n);
				ClientDataShow.getGraph("*").showMagnitude((double)n);
			}

			/**
			 * Show original data SORTED DESCENDING
			 */
			for (Integer n : dec.dataList) {
				ClientDataShow.getGraph("*").showMagnitude((int)n);
				ClientDataShow.getGraph("*").showMagnitude((double)n);
			}
		}

		/**
		 * ClientDataShow using APlusPrototype 
		 * for bar graphing the same data
		 */
		{
			/**
			 * Show original data SORTED ASCENDING
			 */
			for (Integer n : asc.dataList) {
				ClientDataShow.getGraph("+").showMagnitude((int)n);
				ClientDataShow.getGraph("+").showMagnitude((double)n);
			}
			/**
			 * Show original data SORTED DESCENDING
			 */
			for (Integer n : dec.dataList) {
				ClientDataShow.getGraph("+").showMagnitude((int)n);
				ClientDataShow.getGraph("+").showMagnitude((double)n);
			}
		}

		/**
		 * ClientDataShow using ADotPrototype 
		 * for bar graphing the same data
		 */
		{
			/**
			 *  Show original data SORTED ASCENDING
			 */
			for (Integer n : asc.dataList) {
				ClientDataShow.getGraph(".").showMagnitude((int)n);
				ClientDataShow.getGraph(".").showMagnitude((double)n);
			}
			/**
			 * Show original data SORTED DESCENDING
			 */
			for (Integer n : dec.dataList) {
				ClientDataShow.getGraph(".").showMagnitude((int)n);
				ClientDataShow.getGraph(".").showMagnitude((double)n);
			}
		}

		/**
		 * ClientDataShow using AXPrototype 
		 * for bar graphing the same data
		 */
		{
			/**
			 * Show original data SORTED ASCENDING
			 */
			for (Integer n : asc.dataList) {
				ClientDataShow.getGraph("X").showMagnitude((int)n);
				ClientDataShow.getGraph("X").showMagnitude((double)n);
			}
			/**
			 * Show original data SORTED DESCENDING
			 */
			for (Integer n : dec.dataList) {
				ClientDataShow.getGraph("X").showMagnitude((int)n);
				ClientDataShow.getGraph("X").showMagnitude((double)n);
			}
		}

		/**
		 * ClientDataShow using AComercialAtPrototype (A@) 
		 * for bar graphing the same data
		 */
		{
			/**
			 * Show original data SORTED ASCENDING
			 */
			for (Integer n : asc.dataList) {
				ClientDataShow.getGraph("@").showMagnitude((int)n);
				ClientDataShow.getGraph("@").showMagnitude((double)n);
			}
			/**
			 * Show original data SORTED DESCENDING
			 */
			for (Integer n : dec.dataList) {
				ClientDataShow.getGraph("@").showMagnitude((int)n);
				ClientDataShow.getGraph("@").showMagnitude((double)n);
			}
		}
		System.out.println(ClientDataShow.class.getName() + ".demo()... done!");
	}

}


