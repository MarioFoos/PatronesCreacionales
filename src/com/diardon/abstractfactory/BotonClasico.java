package com.diardon.abstractfactory;

/**
 * Implementaci�n concreta del Bot�n Cl�sico
 */
public class BotonClasico implements Boton
{
	@Override
	public void renderizar()
	{
		System.out.println("Renderizando un bot�n cl�sico...");
	}
}
