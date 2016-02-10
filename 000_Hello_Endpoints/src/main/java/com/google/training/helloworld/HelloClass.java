package com.google.training.helloworld;

public class HelloClass 
{
    public String message = "Hello World";

    public HelloClass () 
    {
    }

    public HelloClass (String name) 
    {
        this.message = "Hello " + name + "!!!!";
    }
    
    public HelloClass (String name, String period) 
    {
    	this.message = "Hello " + name + "!  (Period =" + period + ")";
    }
    
    public HelloClass (String name, int variant) 
    {
    	if(variant == 1)
    	{
    		this.message = "1)Hello " + name + "! (first variant)";
    	}
    	else if(variant == 2)
    	{
    		this.message = "2)Hello " + name + "!! (second variant)";
    	}
    	else if(variant == 3)
    	{
    		this.message = "3)Hello " + name + "!!! (third variant)";
    	}
    	else
    	{
    		this.message = "Hello " + name + "!!!!!!!! (other variant)";
    	}
    }

    public String getMessage() 
    {
        return message;
    }
}
