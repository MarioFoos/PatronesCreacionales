package com.diardon.abstractfactory;

/**
 * Implementación concreta de la Ventana Moderna
 */
public class VentanaModerna implements Ventana
{
	@Override
	public void renderizar()
	{
		System.out.println("Renderizando una ventana moderna...");
	}
}
