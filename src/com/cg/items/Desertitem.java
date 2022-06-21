package com.cg.items;

public abstract class Desertitem {
	public abstract void getCost();

}
class Candy extends Desertitem
{

	@Override
	public void getCost() {
		System.out.println("The cost of an candy is 1 doller");
		
	}
	
}
class Cookie extends Desertitem
{

	@Override
	public void getCost() {
		System.out.println("the cost of an Cookie is 1 Euro");
		
	}
	
}
class IceCream extends Desertitem
{

	@Override
	public void getCost() {
		System.out.println("the cost of an ice cream is 50 rupees");
		
	}
}
