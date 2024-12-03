package com.diardon.abstractfactory;

/**
 * Implementación concreta de la fábrica para el tema clásico
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
