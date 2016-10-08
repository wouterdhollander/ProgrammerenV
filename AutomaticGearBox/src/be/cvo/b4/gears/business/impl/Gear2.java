package be.cvo.b4.gears.business.impl;

import be.cvo.b4.gears.business.Gear;

public class Gear2 extends Gear {

	private static int MIN = 20;
	private static int MAX = 40;
	private static int ACC = 7;
	private static int BRAKE = 7;

	private static Gear instance;

	private Gear2() {
		accSpeed = ACC;
		brakeSpeed = BRAKE;
		min = MIN;
		max = MAX;
		next = Gear3.getInstance();
	}

	public static Gear getInstance() {
		if (instance == null)
			instance = new Gear2();
		return instance;
	}
	
	@Override
	public Gear getPrevious() {
		return Gear1.getInstance();
	}

}
