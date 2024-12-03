package com.diardon.prototype;

/**
 * Clase concreta: Círculo
 */
public class Circulo implements Figura
{
	private int x;
	private int y;
	private int radio;

	public Circulo(int x, int y, int radio)
	{
		this.x = x;
		this.y = y;
		this.radio = radio;
	}
	/**
	 * Constructor de copia
	 * @param circulo Círculo
	 */
	public Circulo(Circulo circulo){
		this.x = circulo.x;
		this.y = circulo.y;
		this.radio = circulo.radio;
	}
	@Override
	public Figura clonar()
	{
		return new Circulo(this);
	}
	@Override
	public void dibujar()
	{
		System.out.println("Dibujando un círculo en (" + x + ", " + y + ") con radio " + radio);
	}
}
