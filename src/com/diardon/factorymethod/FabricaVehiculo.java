package com.diardon.factorymethod;

/**
 * Clase creadora abstracta
 */
abstract public class FabricaVehiculo
{
	/**
	 * M�todo Factory que las subclases deben implementar
	 * @return Veh�culo
	 */
	abstract Vehiculo crearVehiculo();

	/**
	 *  M�todo que utiliza el producto creado
	 */
	public void entregarVehiculo()
	{
		Vehiculo vehiculo = crearVehiculo();
		vehiculo.conducir();
	}
}
