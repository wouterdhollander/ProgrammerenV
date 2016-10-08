package be.cvo.b4.gears.service;

import be.cvo.b4.gears.business.Gear;

public class Car {
	
	private GearBox gb;
	private int speed;
	
	public Car() {
		gb = new GearBox();
	}
	
	public void accelerate(){
		Gear g = gb.getCurrentGear();
		speed += g.getAccSpeed();
		if(speed > g.getMax()){
			gb.up();
		}
	}
	
	public void brake(){
		Gear g = gb.getCurrentGear();
		speed -= g.getBrakeSpeed();
		if(speed < g.getMin()){
			gb.down();
		}
	}
	
	public int getSpeed() {
		return speed;
	}

	public void start() {
		gb.setFirst();
	}

	public String getGear() {
		return gb.getCurrentGear().toString();
	}
	
	

}
