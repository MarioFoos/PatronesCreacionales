package com.diardon;

import com.diardon.factorymethod.FabricaAuto;
import com.diardon.factorymethod.FabricaMoto;
import com.diardon.factorymethod.FabricaVehiculo;

/*
* Explicaci�n
* - Interfaz Vehiculo: Define un m�todo conducir() que ser� implementado por todas las clases de veh�culos.
* - Clases Auto y Moto: Implementan la interfaz Vehiculo y proporcionan sus propias versiones del m�todo conducir().
* - Clase abstracta FabricaVehiculo: Define un m�todo abstracto crearVehiculo() que es el Factory Method. Esta clase tambi�n tiene un m�todo entregarVehiculo() que utiliza el objeto creado.
* - Subclases FabricaAuto y FabricaMoto: Implementan el m�todo crearVehiculo() para devolver instancias de Auto y Moto, respectivamente.
* - Clase principal Main: Demuestra c�mo se utiliza el patr�n Factory Method para crear y usar diferentes tipos de veh�culos sin que el cliente tenga que saber c�mo se crean exactamente.
*/
/**
 * Clase principal para demostrar el uso del patr�n Factory Method
 */
public class AppTestFactoryMethod
{
	public static void main(String[] args)
	{
		// Crear una f�brica de coches y entregar un coche
		FabricaVehiculo fabricaCoche = new FabricaAuto();
		fabricaCoche.entregarVehiculo();

		// Crear una f�brica de motocicletas y entregar una motocicleta
		FabricaVehiculo fabricaMotocicleta = new FabricaMoto();
		fabricaMotocicleta.entregarVehiculo();
	}
}
