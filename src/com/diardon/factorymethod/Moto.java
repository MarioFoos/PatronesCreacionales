package com.diardon.factorymethod;

/**
 * Implementaci�n concreta del producto: Moto
 */
public class Moto implements Vehiculo
{
	@Override
	public void conducir()
	{
		System.out.println("Manejando una moto...");
	}
}
