package de.finance;

import java.util.concurrent.ThreadLocalRandom;

import de.finance.entities.Kurse;

public class Test {
	
	public static void main(String[] args) {
		
		Kurse[][] kurseArray = new Kurse[12][12];
		int counter = 0;
		for (int i = kurseArray.length; i > 0 ; i--) {
			for (int j = counter; j < kurseArray.length; j++) {
				kurseArray[i-1][j] = new Kurse(ThreadLocalRandom.current().nextDouble(5000.00, 10000.00), null);
			}
			counter++;
		}

		StringBuilder result = new StringBuilder();
		for (int i = 0; i < kurseArray.length;) {
			for (int j = 0; j < kurseArray.length;) {
				result.append(kurseArray[i][j]);
				if (++j < kurseArray.length) {
					result.append(' ');
				}
			}
			if (++i < kurseArray.length) {
				result.append('\n');
			}
		}
		System.out.println(result);
	}

}
