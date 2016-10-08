package be.cvo.b4.gears.business.impl;

import be.cvo.b4.gears.business.Gear;

public class Gear4 extends Gear {

	private static int MIN = 60;
	private static int MAX = 90;
	private static int ACC = 8;
	private static int BRAKE = 9;

	private static Gear instance;

	private Gear4() {
		accSpeed = ACC;
		brakeSpeed = BRAKE;
		min = MIN;
		max = MAX;
		next = Gear5.getInstance();
	}

	public static Gear getInstance() {
		if (instance == null)
			instance = new Gear4();
		return instance;
	}
	
	@Override
	public Gear getPrevious() {
		return Gear3.getInstance();
	}

}
