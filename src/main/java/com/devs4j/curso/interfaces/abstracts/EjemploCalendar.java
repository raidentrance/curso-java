package com.devs4j.curso.interfaces.abstracts;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class EjemploCalendar {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.getTime());
		cal.add(Calendar.MONTH, 2);
		System.out.println(cal.getTime());
		
		
		System.out.println(cal instanceof GregorianCalendar);
	}
}
