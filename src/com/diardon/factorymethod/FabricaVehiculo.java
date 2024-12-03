package com.diardon.factorymethod;

/**
 * Clase creadora abstracta
 */
abstract public class FabricaVehiculo
{
	/**
	 * Método Factory que las subclases deben implementar
	 * @return Vehículo
	 */
	abstract Vehiculo crearVehiculo();

	/**
	 *  Método que utiliza el producto creado
	 */
	public void entregarVehiculo()
	{
		Vehiculo vehiculo = crearVehiculo();
		vehiculo.conducir();
	}
}
