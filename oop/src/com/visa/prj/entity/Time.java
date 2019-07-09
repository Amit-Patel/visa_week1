package com.visa.prj.entity;

public class Time {

	private int hours;
	private int mins;
	
	public Time(int hours, int mins) {
		this.hours = hours;
		this.mins = mins;
	}
	
	public int getHours() {
		return hours;
	}
	
	public int getMins() {
		return mins;
	}
	
	public static Time addTime(Time t1, Time t2) {
		int totalmins = (t1.getHours()+t2.getHours())*60 + t1.getMins() + t2.getMins();
		Time newtime  = new Time(totalmins/60, totalmins%60);
		
		return newtime;
		
	}
	
	public Time addTime(Time t) {
		int totalmins = (this.getHours()+t.getHours())*60 + this.getMins() + t.getMins();
		Time newtime  = new Time(totalmins/60, totalmins%60);
		
		return newtime;
		
	}


	@Override
	public  boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Time temp = (Time) obj;
		return (this.getHours() == temp.getHours()&& this.getMins()==temp.getMins());
	}
	
}