package be.cvo.b4.gears.service;

import be.cvo.b4.gears.business.Gear;
import be.cvo.b4.gears.business.impl.Gear1;

public class GearBox {
	
	private Gear currentGear;
	
	public Gear getCurrentGear() {
		return currentGear;
	}
	
	public void up(){
		currentGear = currentGear.getNext();
	}
	
	public void down(){
		currentGear = currentGear.getPrevious();
	}

	public void setFirst() {
		currentGear = Gear1.getInstance();
	}

}
