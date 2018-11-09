package org.studyeasy;

import org.studyeasy.vehicles.Bike;

public class Demo {

	public static void main(String[] args) {
		Bike bike=new Bike();
		bike.handle="short";
		bike.engine="petrol";
		
		System.out.println(bike.engine);

	}

}
