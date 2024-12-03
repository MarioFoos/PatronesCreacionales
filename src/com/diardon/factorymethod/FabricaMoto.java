package com.diardon.factorymethod;

/**
 * Creador concreto para motos
 */
public class FabricaMoto extends FabricaVehiculo
{
	@Override
	Vehiculo crearVehiculo()
	{
		return new Moto();
	}
}
