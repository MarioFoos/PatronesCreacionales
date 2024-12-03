package com.diardon.abstractfactory;

/**
 * Implementación concreta de la Ventana Clásica
 */
public class VentanaClasica implements Ventana
{
	@Override
	public void renderizar()
	{
		System.out.println("Renderizando una ventana clásica...");
	}
}
