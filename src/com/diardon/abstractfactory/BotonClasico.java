package com.diardon.abstractfactory;

/**
 * Implementación concreta del Botón Clásico
 */
public class BotonClasico implements Boton
{
	@Override
	public void renderizar()
	{
		System.out.println("Renderizando un botón clásico...");
	}
}
