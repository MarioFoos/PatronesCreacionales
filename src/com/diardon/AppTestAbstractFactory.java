package com.diardon;

import com.diardon.abstractfactory.Boton;
import com.diardon.abstractfactory.FabricaClasica;
import com.diardon.abstractfactory.FabricaGUI;
import com.diardon.abstractfactory.FabricaModerna;
import com.diardon.abstractfactory.Ventana;

/* 
 * Explicación
 * - Interfaz Boton y Ventana: Definen los métodos comunes renderizar() que deben implementar todas las variantes de botones y ventanas.
 * - Clases concretas BotonModerno, BotonClasico, VentanaModerna y VentanaClasica: Implementan las interfaces Boton y Ventana y proporcionan su propia forma de renderizarse.
 * - Interfaz FabricaGUI: Es la Abstract Factory que define los métodos crearBoton() y crearVentana(). Las implementaciones concretas crearán componentes específicos.
 * - Clases FabricaModerna y FabricaClasica: Implementan la interfaz FabricaGUI y crean componentes de estilo moderno o clásico, respectivamente.
 * - Clase principal Main: Demuestra cómo se utilizan las fábricas para crear y renderizar diferentes conjuntos de componentes gráficos.
 */
/**
 * Clase principal para demostrar el uso del patrón Abstract Factory
 */
public class AppTestAbstractFactory
{
	public static void main(String[] args)
	{
		// Crear una fábrica moderna y renderizar los componentes
		FabricaGUI fabricaModerna = new FabricaModerna();
		Boton botonModerno = fabricaModerna.crearBoton();
		Ventana ventanaModerna = fabricaModerna.crearVentana();
		botonModerno.renderizar();
		ventanaModerna.renderizar();

		// Crear una fábrica clásica y renderizar los componentes
		FabricaGUI fabricaClasica = new FabricaClasica();
		Boton botonClasico = fabricaClasica.crearBoton();
		Ventana ventanaClasica = fabricaClasica.crearVentana();
		botonClasico.renderizar();
		ventanaClasica.renderizar();

	}
}
