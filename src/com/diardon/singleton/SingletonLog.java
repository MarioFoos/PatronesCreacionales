package com.diardon.singleton;

public class SingletonLog
{
	private static SingletonLog instance = null;
	
	private SingletonLog()
	{
		System.out.println("Crear el objeto una sola vez...");
	}
	
	public static SingletonLog getInstance()
	{
		if(instance == null)
		{
			instance = new SingletonLog();
		}
		return instance;
	}
	
	public void logDebug(String str)
	{
		System.out.println("Log: " + str);
	}
}
