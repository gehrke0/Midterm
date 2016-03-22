package com.cisc181.core;

public class PersonException extends Exception { 
	Person Person = this.Person;
	public PersonException(){
		System.out.println("DoB cannot be greater than 100 years older than the current date.");
		System.out.println("Phone number must be formatted (###)-###-####.");
	}
}	