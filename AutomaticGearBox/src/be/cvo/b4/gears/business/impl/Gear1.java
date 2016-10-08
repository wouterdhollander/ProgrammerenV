package be.cvo.b4.gears.business.impl;

import be.cvo.b4.gears.business.Gear;

public class Gear1 extends Gear {

	private static int MIN = 0;
	private static int MAX = 20;
	private static int ACC = 5;
	private static int BRAKE = 5;

	private static Gear instance;

	private Gear1() {
		accSpeed = ACC;
		brakeSpeed = BRAKE;
		min = MIN;
		max = MAX;
		next = Gear2.getInstance();
	}

	public static Gear getInstance() {
		if (instance == null)
			instance = new Gear1();
		return instance;
	}
	
	@Override
	public Gear getPrevious() {
		return Gear0.getInstance();
	}
}
