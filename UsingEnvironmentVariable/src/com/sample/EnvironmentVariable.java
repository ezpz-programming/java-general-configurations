package com.sample;


public class EnvironmentVariable 
{
	
	public static void main(String[] args) 
	{
		
		//Reading configuration from environment variables in machine
		System.out.println("Database Connection String: " + System.getenv("DATABASE_CONNECTION_STRING"));
		

	}
	

}
