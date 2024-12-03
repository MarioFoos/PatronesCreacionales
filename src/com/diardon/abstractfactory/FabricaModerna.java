package com.diardon.abstractfactory;

/**
 * Implementaci�n concreta de la f�brica para el tema moderno
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
