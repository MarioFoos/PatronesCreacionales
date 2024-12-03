package com.diardon.factorymethod;

/**
 * Implementaci�n concreta del producto: Auto
 */
public class Auto implements Vehiculo
{
	@Override
	public void conducir()
	{
		System.out.println("Manejando un auto...");
	}
}
