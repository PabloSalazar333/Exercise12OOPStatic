package com.exercise12oopstatic.app;

import com.exercise12oopstatic.model.Car;

public class CarApp {
	
	public static void main (String[] args)
	{
		Car redCar = new Car();
		Car blackCar = new Car();
		Car purpleCar = new Car();
		Car orangeCar = new Car();
		Car whiteCar = new Car();
		Car greenCar = new Car();
		Car yellowCar = new Car();
		Car blueCar = new Car();
		Car pinkCar = new Car();
		Car grayCar = new Car();
		
		redCar.setSerialNumber("1");
		redCar.setNUmberDoors(4);
		redCar.setBrand("Volvo");
		blackCar.setSerialNumber("2");
		blackCar.setNUmberDoors(4);
		blackCar.setBrand("Volvo");
		purpleCar.setSerialNumber("3");
		purpleCar.setNUmberDoors(4);
		purpleCar.setBrand("Volvo");
		orangeCar.setSerialNumber("4");
		orangeCar.setNUmberDoors(4);
		orangeCar.setBrand("Honda");
		whiteCar.setSerialNumber("5");
		whiteCar.setNUmberDoors(4);
		whiteCar.setBrand("Honda");
		greenCar.setSerialNumber("6");
		greenCar.setNUmberDoors(4);
		greenCar.setBrand("Honda");
		yellowCar.setSerialNumber("7");
		yellowCar.setNUmberDoors(4);
		yellowCar.setBrand("Honda");
		blueCar.setSerialNumber("8");
		blueCar.setNUmberDoors(4);
		blueCar.setBrand("Honda");
		pinkCar.setSerialNumber("9");
		pinkCar.setNUmberDoors(4);
		pinkCar.setBrand("Honda");
		grayCar.setSerialNumber("10");
		grayCar.setNUmberDoors(4);
		grayCar.setBrand("Honda");
		
		System.out.println("Edgar: "+redCar.ToString());
		System.out.println("Luis: "+blackCar.ToString());
		System.out.println("Ale: "+purpleCar.ToString());
		System.out.println("Cris: "+orangeCar.ToString());
		System.out.println("Helio: "+whiteCar.ToString());
		System.out.println("Manu: "+greenCar.ToString());
		System.out.println("Ary: "+yellowCar.ToString());
		System.out.println("Cesar: "+blueCar.ToString());
		System.out.println("Jorge: "+pinkCar.ToString());
		System.out.println("Pablo: "+grayCar.ToString());
		
		}

}
