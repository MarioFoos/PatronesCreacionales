package com.diardon;

import com.diardon.builder.Hamburguesa;
import com.diardon.builder.HamburguesaBuilder;

/*
 * Explicaci�n
 * - Clase Hamburguesa: Esta es la clase del producto final. El constructor es privado, y la �nica manera de crear una instancia de Hamburguesa es a trav�s del HamburguesaBuilder.
 * - Clase HamburguesaBuilder: Esta clase est�tica interna se encarga de construir una Hamburguesa. Tiene m�todos que permiten configurar los ingredientes opcionales. Cada m�todo del builder devuelve this, lo que permite encadenar las llamadas (fluent interface).
 * - M�todo build(): Este m�todo crea y devuelve una instancia de Hamburguesa usando el constructor privado.
 */

/**
 * Clase principal para demostrar el uso del patr�n Builder
 */
public class AppTestBuilder
{
	public static void main(String[] args)
	{
		// Crear una hamburguesa c = on pan, carne, lechuga y queso
		Hamburguesa hamburguesa1 = new HamburguesaBuilder("pan de s�samo", "carne de res").agregarLechuga().agregarQueso().build();

		// Crear una hamburguesa con pan, carne, tomate, bacon y queso
		Hamburguesa hamburguesa2 = new HamburguesaBuilder("pan integral", "carne de pollo").agregarTomate().agregarBacon().agregarQueso().build();

		// Mostrar las hamburguesas
		hamburguesa1.mostrar();
		hamburguesa2.mostrar();
	}
}
