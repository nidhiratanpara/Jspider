package com.demo.carFactory;

public class CarFactory {
	
	public static IKey getCar(String type)
	{
		if(type.equalsIgnoreCase("DieselCar"))
		{
			return new DieselCar();
		
		}else if (type.equalsIgnoreCase("ElecCar"))
		{
			return new ElectricCar();
		}
		else
		{
			System.out.println("Car not found");
		}
		return null;
	}

}
