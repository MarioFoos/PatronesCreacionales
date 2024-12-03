package com.diardon;

import com.diardon.builder.Hamburguesa;
import com.diardon.builder.HamburguesaBuilder;

/*
 * Explicación
 * - Clase Hamburguesa: Esta es la clase del producto final. El constructor es privado, y la única manera de crear una instancia de Hamburguesa es a través del HamburguesaBuilder.
 * - Clase HamburguesaBuilder: Esta clase estática interna se encarga de construir una Hamburguesa. Tiene métodos que permiten configurar los ingredientes opcionales. Cada método del builder devuelve this, lo que permite encadenar las llamadas (fluent interface).
 * - Método build(): Este método crea y devuelve una instancia de Hamburguesa usando el constructor privado.
 */

/**
 * Clase principal para demostrar el uso del patrón Builder
 */
public class AppTestBuilder
{
	public static void main(String[] args)
	{
		// Crear una hamburguesa c = on pan, carne, lechuga y queso
		Hamburguesa hamburguesa1 = new HamburguesaBuilder("pan de sésamo", "carne de res").agregarLechuga().agregarQueso().build();

		// Crear una hamburguesa con pan, carne, tomate, bacon y queso
		Hamburguesa hamburguesa2 = new HamburguesaBuilder("pan integral", "carne de pollo").agregarTomate().agregarBacon().agregarQueso().build();

		// Mostrar las hamburguesas
		hamburguesa1.mostrar();
		hamburguesa2.mostrar();
	}
}
