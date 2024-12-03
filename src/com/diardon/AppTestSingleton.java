package com.diardon;

import com.diardon.singleton.SingletonLog;

/**
 * Clase principal para demostrar el uso del patrón Singleton
 */
public class AppTestSingleton
{
	public static void main(String[] args)
	{
		int[] arr = new int[]{ 1, 2, 3, 4, 5 };
		SingletonLog log = SingletonLog.getInstance();
		
		log.logDebug("Texto de prueba");
		
		logArray(arr);
	}
	public static void logArray(int[] array)
	{
		SingletonLog log = SingletonLog.getInstance();
		for(int i = 0; i < array.length; ++i)
		{
			log.logDebug(i + " -> " + array[i]);
		}
	}
}
