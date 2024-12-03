package com.diardon.builder;

/**
 * Clase Producto: Hamburguesa
 */
public class Hamburguesa
{
	// Atributos de la hamburguesa
	private String pan;
	private String carne;
	private boolean lechuga;
	private boolean tomate;
	private boolean queso;
	private boolean bacon;

	/**
	 * Constructor privado para asegurarse de que solo se pueda crear usando el
	 * Builder
	 * 
	 * @param builder
	 */
	Hamburguesa(HamburguesaBuilder builder)
	{
		this.pan = builder.pan;
		this.carne = builder.carne;
		this.lechuga = builder.lechuga;
		this.tomate = builder.tomate;
		this.queso = builder.queso;
		this.bacon = builder.bacon;
	}

	// Método para mostrar la descripción de la hamburguesa
	public void mostrar()
	{
		System.out.println("Hamburguesa con pan: " + pan + ", carne: " + carne + (lechuga ? ", lechuga" : "")
				+ (tomate ? ", tomate" : "") + (queso ? ", queso" : "") + (bacon ? ", bacon" : ""));
	}
}