package de.finance.mock;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import de.finance.entities.Kurse;

public class MockServcie {

	
	public static List<Kurse> generateMockKursData() {
		List<Kurse> kurseArrayList = new ArrayList<>();
		for (int i = 0; i < 25; i++) {
			Kurse kurse = new Kurse(ThreadLocalRandom.current().nextDouble(5000.00, 10000.00), new Date(2000+i, 1, 1));
			kurseArrayList.add(kurse);
		}
		return kurseArrayList;
	}
	
	public static List<Kurse> generateDaxKursData() {
		List<Kurse> kurseArrayList = new ArrayList<>();
		kurseArrayList.add(new Kurse(6433.61, new Date(2000, 1, 1)));
		kurseArrayList.add(new Kurse(5160.10, new Date(2001, 1, 1)));
		kurseArrayList.add(new Kurse(2892.63, new Date(2002, 1, 1)));
		kurseArrayList.add(new Kurse(3965.16, new Date(2003, 1, 1)));
		kurseArrayList.add(new Kurse(4256.08, new Date(2004, 1, 1)));
		kurseArrayList.add(new Kurse(5408.26, new Date(2005, 1, 1)));
		kurseArrayList.add(new Kurse(6596.92, new Date(2006, 1, 1)));
		kurseArrayList.add(new Kurse(8067.32, new Date(2007, 1, 1)));
		kurseArrayList.add(new Kurse(4810.20, new Date(2008, 1, 1)));
		kurseArrayList.add(new Kurse(5957.43, new Date(2009, 1, 1)));
		kurseArrayList.add(new Kurse(6914.19, new Date(2010, 1, 1)));
		kurseArrayList.add(new Kurse(5898.35, new Date(2011, 1, 1)));
		return kurseArrayList;
	}
	
	
}
