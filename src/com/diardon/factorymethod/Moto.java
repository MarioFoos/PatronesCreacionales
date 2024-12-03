package com.diardon.factorymethod;

/**
 * Implementación concreta del producto: Moto
 */
public class Moto implements Vehiculo
{
	@Override
	public void conducir()
	{
		System.out.println("Manejando una moto...");
	}
}
