package be.cvo.b4.gears.business.impl;

import be.cvo.b4.gears.business.Gear;

public class Gear5 extends Gear {

	private static int MIN = 90;
	private static int MAX = 130;
	private static int ACC = 10;
	private static int BRAKE = 10;

	private static Gear instance;

	private Gear5() {
		accSpeed = ACC;
		brakeSpeed = BRAKE;
		min = MIN;
		max = MAX;
		next = this;
	}

	public static Gear getInstance() {
		if (instance == null)
			instance = new Gear5();
		return instance;
	}
	
	@Override
	public Gear getPrevious() {
		return Gear4.getInstance();
	}

}
