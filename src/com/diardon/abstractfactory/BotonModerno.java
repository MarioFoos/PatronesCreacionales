package com.diardon.abstractfactory;

/**
 * Implementaci�n concreta del Bot�n Moderno
 */
public class BotonModerno implements Boton
{
	@Override
	public void renderizar()
	{
		System.out.println("Renderizando un bot�n moderno...");
	}
}
