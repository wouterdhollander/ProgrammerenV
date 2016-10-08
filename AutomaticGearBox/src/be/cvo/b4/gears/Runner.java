package be.cvo.b4.gears;

import be.cvo.b4.gears.service.Car;

public class Runner {

	public static void main(String[] args) {
		Car c = new Car();
		c.start();
		System.out.println("Current speed = " + c.getSpeed() + " - Gear : " + c.getGear());
		for(int i=0; i<20; i++){
			c.accelerate();
			System.out.println("Acc : Current speed = " + c.getSpeed() + " - Gear : " + c.getGear());
		}
		
		for(int i=0; i<20; i++){
			c.brake();
			System.out.println("Brake : Current speed = " + c.getSpeed() + " - Gear : " + c.getGear());
		}
	}

}
