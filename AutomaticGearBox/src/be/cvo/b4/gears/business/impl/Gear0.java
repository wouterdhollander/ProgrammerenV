package be.cvo.b4.gears.business.impl;

import be.cvo.b4.gears.business.Gear;

public class Gear0 extends Gear{
	
	private static int MIN=0;
	private static int MAX=0;
	private static int ACC=0;
	private static int BRAKE=0;
	
	private static Gear instance;
	
	private Gear0(){
		accSpeed = ACC;
		brakeSpeed = BRAKE;
		min = MIN;
		max = MAX;
		next = Gear1.getInstance();
	}
	
	public static Gear getInstance() {
		if(instance == null)
			instance = new Gear0();
		return instance;
	}

	@Override
	public Gear getPrevious() {
		return this;
	}

}
