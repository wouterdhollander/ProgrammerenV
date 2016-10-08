package be.cvo.b4.gears.business;

public abstract class Gear {
	
	protected int accSpeed;
	protected int brakeSpeed;
	protected int max;
	protected int min;
	
	protected Gear next;
	
	public int getAccSpeed() {
		return accSpeed;
	}
	
	public int getBrakeSpeed() {
		return brakeSpeed;
	}
	
	public int getMax() {
		return max;
	}
	
	public int getMin() {
		return min;
	}
	
	public Gear getNext() {
		return next;
	}
	
	@Override
	public String toString() {
		return getClass().getSimpleName();
	}
	
	public abstract Gear getPrevious();
	

}
