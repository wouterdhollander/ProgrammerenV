package be.cvo.b4.gears.business.impl;

import be.cvo.b4.gears.business.Gear;

public class Gear3 extends Gear {

	private static int MIN = 40;
	private static int MAX = 60;
	private static int ACC = 6;
	private static int BRAKE = 7;

	private static Gear instance;

	private Gear3() {
		accSpeed = ACC;
		brakeSpeed = BRAKE;
		min = MIN;
		max = MAX;
		next = Gear4.getInstance();
	}

	public static Gear getInstance() {
		if (instance == null)
			instance = new Gear3();
		return instance;
	}
	
	@Override
	public Gear getPrevious() {
		return Gear2.getInstance();
	}

}
