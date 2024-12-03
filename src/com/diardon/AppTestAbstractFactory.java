package com.diardon;

import com.diardon.abstractfactory.Boton;
import com.diardon.abstractfactory.FabricaClasica;
import com.diardon.abstractfactory.FabricaGUI;
import com.diardon.abstractfactory.FabricaModerna;
import com.diardon.abstractfactory.Ventana;

/* 
 * Explicaci�n
 * - Interfaz Boton y Ventana: Definen los m�todos comunes renderizar() que deben implementar todas las variantes de botones y ventanas.
 * - Clases concretas BotonModerno, BotonClasico, VentanaModerna y VentanaClasica: Implementan las interfaces Boton y Ventana y proporcionan su propia forma de renderizarse.
 * - Interfaz FabricaGUI: Es la Abstract Factory que define los m�todos crearBoton() y crearVentana(). Las implementaciones concretas crear�n componentes espec�ficos.
 * - Clases FabricaModerna y FabricaClasica: Implementan la interfaz FabricaGUI y crean componentes de estilo moderno o cl�sico, respectivamente.
 * - Clase principal Main: Demuestra c�mo se utilizan las f�bricas para crear y renderizar diferentes conjuntos de componentes gr�ficos.
 */
/**
 * Clase principal para demostrar el uso del patr�n Abstract Factory
 */
public class AppTestAbstractFactory
{
	public static void main(String[] args)
	{
		// Crear una f�brica moderna y renderizar los componentes
		FabricaGUI fabricaModerna = new FabricaModerna();
		Boton botonModerno = fabricaModerna.crearBoton();
		Ventana ventanaModerna = fabricaModerna.crearVentana();
		botonModerno.renderizar();
		ventanaModerna.renderizar();

		// Crear una f�brica cl�sica y renderizar los componentes
		FabricaGUI fabricaClasica = new FabricaClasica();
		Boton botonClasico = fabricaClasica.crearBoton();
		Ventana ventanaClasica = fabricaClasica.crearVentana();
		botonClasico.renderizar();
		ventanaClasica.renderizar();

	}
}
