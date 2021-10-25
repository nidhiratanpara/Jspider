package com.demo.customException;

public class InsufficientFundException extends Exception {
public InsufficientFundException()
{
	super("less balance");
}
public InsufficientFundException(String s)
{
	super(s);
}
public String toString()
{
	return "Maz" +getMessage();
	}
}
