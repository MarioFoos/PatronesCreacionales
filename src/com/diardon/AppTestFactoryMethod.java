package com.diardon;

import com.diardon.factorymethod.FabricaAuto;
import com.diardon.factorymethod.FabricaMoto;
import com.diardon.factorymethod.FabricaVehiculo;

/*
* Explicación
* - Interfaz Vehiculo: Define un método conducir() que será implementado por todas las clases de vehículos.
* - Clases Auto y Moto: Implementan la interfaz Vehiculo y proporcionan sus propias versiones del método conducir().
* - Clase abstracta FabricaVehiculo: Define un método abstracto crearVehiculo() que es el Factory Method. Esta clase también tiene un método entregarVehiculo() que utiliza el objeto creado.
* - Subclases FabricaAuto y FabricaMoto: Implementan el método crearVehiculo() para devolver instancias de Auto y Moto, respectivamente.
* - Clase principal Main: Demuestra cómo se utiliza el patrón Factory Method para crear y usar diferentes tipos de vehículos sin que el cliente tenga que saber cómo se crean exactamente.
*/
/**
 * Clase principal para demostrar el uso del patrón Factory Method
 */
public class AppTestFactoryMethod
{
	public static void main(String[] args)
	{
		// Crear una fábrica de coches y entregar un coche
		FabricaVehiculo fabricaCoche = new FabricaAuto();
		fabricaCoche.entregarVehiculo();

		// Crear una fábrica de motocicletas y entregar una motocicleta
		FabricaVehiculo fabricaMotocicleta = new FabricaMoto();
		fabricaMotocicleta.entregarVehiculo();
	}
}
