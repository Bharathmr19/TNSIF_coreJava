package com.tnsif.runtimepolymorphism;

public class ICICI extends RBI{
	
	@Override //Annotation for overriding
	public float getRateOfInterest() {
		return 6.9f;
	}

}
