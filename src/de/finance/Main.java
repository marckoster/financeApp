package de.finance;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import com.google.gson.Gson;

import de.finance.entities.Kurse;
import de.finance.mock.MockServcie;
import de.finance.service.CalculationService;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hallo welt");
	
	
		
		/**
		

		System.out.println(MockServcie.generateDaxKursData());
		
		//rendite = kursEnde2001 * 100 / kursEnde2000
		
		double test = CalculationService.berechneZinssatz(3965.16 , 5957.43, 6);
		System.out.println(test);
	
		**/
		
		//List<Kurse> kurseList = MockServcie.generateDaxKursData();
		List<Kurse> kurseList = MockServcie.generateMockKursData();
		Double[][] dreieck = new Double[kurseList.size()][kurseList.size()];
		for (int i = 0; i < kurseList.size(); i++) {
			for (int j = 0; j < kurseList.size(); j++) {
				if (i == kurseList.size()-1) {
					dreieck[i][j] = (double)kurseList.get(j).getDate().getYear()+1;
				}
				if (j == kurseList.size()-1) {
					dreieck[i][j] = (double)kurseList.get(i).getDate().getYear();
				}
				if (kurseList.get(i).getDate().getYear() >= kurseList.get(j).getDate().getYear()) {
					System.out.println("-");
				}else {
					System.out.println("Gekauft " + kurseList.get(i).getDate().getYear() );
					System.out.println("Verkauft " + kurseList.get(j).getDate().getYear());
					int lauf = kurseList.get(j).getDate().getYear() - kurseList.get(i).getDate().getYear();
					double rendite = CalculationService.berechneZinssatz(kurseList.get(i).getKurs(), kurseList.get(j).getKurs(), lauf);
					System.out.println("Rendite " + rendite);
					dreieck[i][j-1] = rendite;
				}
			}
		}
		/**
		for (Kurse kurse : kurseList) {
			for (Kurse kurse2 : kurseList) {
				
				if (kurse.getDate().getYear() >= kurse2.getDate().getYear()) {
					System.out.println("-");
				}else {
					System.out.println("Gekauft " + kurse.getDate().getYear() );
					System.out.println("Verkauft " + kurse2.getDate().getYear());
					int lauf = kurse2.getDate().getYear() - kurse.getDate().getYear();
					System.out.println("Rendite " + CalculationService.berechneZinssatz(kurse.getKurs(), kurse2.getKurs(), lauf));
				}
			}
		}
		**/
//		StringBuilder result = new StringBuilder();
//		for (int i = 0; i < dreieck.length;) {
//			for (int j = 0; j < dreieck.length;) {
//				result.append(dreieck[i][j]);
//				if (++j < dreieck.length) {
//					result.append(' ');
//				}
//			}
//			if (++i < dreieck.length) {
//				result.append('\n');
//			}
//		}
		Gson gson = new Gson();
		System.out.println(gson.toJson(dreieck));
//		System.out.println(result);
	}

}
