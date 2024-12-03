package com.diardon.abstractfactory;

/**
 * Implementaci�n concreta de la Ventana Cl�sica
 */
public class VentanaClasica implements Ventana
{
	@Override
	public void renderizar()
	{
		System.out.println("Renderizando una ventana cl�sica...");
	}
}
