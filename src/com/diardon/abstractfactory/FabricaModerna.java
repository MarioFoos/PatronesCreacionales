package com.diardon.abstractfactory;

/**
 * Implementación concreta de la fábrica para el tema moderno
 */
public class FabricaModerna implements FabricaGUI
{
	@Override
	public Boton crearBoton()
	{
		return new BotonModerno();
	}
	@Override
	public Ventana crearVentana()
	{
		return new VentanaModerna();
	}
}
