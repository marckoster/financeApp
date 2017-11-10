package de.finance.service;

public class CalculationService {

	public static double berechneZinssatz(double anfKap, double endKap, int lauf) {

		double zins;
		double q;

		// Verarbeitung
		q = Math.pow(endKap / anfKap, 1.0 / lauf); // Berechnung
		zins = 100 * (q - 1);

		zins = Math.rint(zins * 10000); 
		zins = zins / 10000;

		// Ausgabe
		//System.out.println("Zinssatz in Prozent : " + zins);
		return (double) Math.round(zins* 10) / 10;
	}

}
