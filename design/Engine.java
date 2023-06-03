package com.jsp.design;

public class Engine {
private String horse_power;
private String cubic_capicity;

Engine(String horse_power,String cubic_capicity)
{
	this.horse_power=horse_power;
	this.cubic_capicity=cubic_capicity;
	}
public void setHorsePower(String horse_power)
{
	this.horse_power=horse_power;
}
public String getHorsePower()
{
	return horse_power;
	
}
public void setCC(String CC)
{
this.cubic_capicity=CC;

}
public String getCC()
{
	return cubic_capicity;
	
}

}
