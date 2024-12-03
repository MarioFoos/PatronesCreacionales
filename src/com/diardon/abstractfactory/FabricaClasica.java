package com.diardon.abstractfactory;

/**
 * Implementaci�n concreta de la f�brica para el tema cl�sico
 */
public class FabricaClasica implements FabricaGUI
{
	@Override
	public Boton crearBoton()
	{
		return new BotonClasico();
	}
	@Override
	public Ventana crearVentana()
	{
		return new VentanaClasica();
	}
}
