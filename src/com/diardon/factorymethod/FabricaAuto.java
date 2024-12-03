package com.diardon.factorymethod;

/**
 * Creador concreto para autos
 */
public class FabricaAuto extends FabricaVehiculo
{
	@Override
	Vehiculo crearVehiculo()
	{
		return new Auto();
	}
}
