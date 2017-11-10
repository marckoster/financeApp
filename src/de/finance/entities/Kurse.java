package de.finance.entities;

import java.util.Date;

public class Kurse {
	
	private double kurs;
	private Date date;
	
	public Kurse(double kurs, Date date) {
		super();
		this.kurs = kurs;
		this.date = date;
	}
	
	@Override
	public String toString() {
		return "[" + String.format("%.2f", kurs) + "]";
	}
	
	public double getKurs() {
		return kurs;
	}
	public void setKurs(double kurs) {
		this.kurs = kurs;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}

}
