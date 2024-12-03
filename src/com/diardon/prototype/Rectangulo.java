package com.diardon.prototype;

/**
 * Clase concreta: Rectángulo
 */
public class Rectangulo implements Figura
{
	private int ancho;
	private int alto;

	/**
	 * Constructor
	 * @param ancho Ancho
	 * @param alto Alto
	 */
	public Rectangulo(int ancho, int alto)
	{
		this.ancho = ancho;
		this.alto = alto;
	}
	/**
	 * Constructor de copia
	 * @param rectangulo
	 */
	public Rectangulo(Rectangulo rectangulo)
	{
		this.ancho = rectangulo.ancho;
		this.alto = rectangulo.alto;
	}
	@Override
	public Figura clonar()
	{
		return new Rectangulo(this);
	}
	@Override
	public void dibujar()
	{
		System.out.println("Dibujando un rectángulo de " + ancho + "x" + alto);
	}
}
