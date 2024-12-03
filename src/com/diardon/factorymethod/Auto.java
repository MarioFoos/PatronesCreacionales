package com.diardon.factorymethod;

/**
 * Implementación concreta del producto: Auto
 */
public class Auto implements Vehiculo
{
	@Override
	public void conducir()
	{
		System.out.println("Manejando un auto...");
	}
}
