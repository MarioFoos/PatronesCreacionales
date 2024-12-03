package com.diardon.abstractfactory;

/**
 * Implementación concreta del Botón Moderno
 */
public class BotonModerno implements Boton
{
	@Override
	public void renderizar()
	{
		System.out.println("Renderizando un botón moderno...");
	}
}
