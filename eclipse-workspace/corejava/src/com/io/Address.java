package com.io;

import java.io.Serializable;

public class Address implements Serializable
{
	String country, state, city;
	
	public String getcountry()
	{
		
		return country;
	}
	public void setcountry(String country)
	{
		this.country=country;
	}
	public String getstate()
	{
		return state;
	}
	public void setstate(String state)
	{
		this.state=state;
	}
	public String getcity()
	{
		return city;
	}
	public void setcity(String city)
	{
		this.city=city;
	}
	
}

