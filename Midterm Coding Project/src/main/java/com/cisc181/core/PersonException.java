package com.cisc181.core;

public class PersonException extends Exception { 
	private Person Person = this.Person;
	public PersonException(Person Person){
		System.out.println("DoB cannot be greater than 100 years older than the current date.");
	}
}	