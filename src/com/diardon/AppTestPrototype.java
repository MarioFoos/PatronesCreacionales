package com.diardon;

import com.diardon.prototype.Circulo;
import com.diardon.prototype.Rectangulo;

/*
 * Explicación
 * - Interfaz Figura: Define el método clonar(), que se implementa en las clases concretas para clonar las figuras.
 * - Clase Circulo: Implementa Figura y proporciona un constructor de copia para crear una copia exacta de un Circulo existente. El método clonar() devuelve una nueva instancia de Circulo basada en la instancia actual.
 * - Clase Rectangulo: Similar a Circulo, implementa Figura y proporciona un constructor de copia. El método clonar() devuelve una nueva instancia de Rectangulo.
 * - Clase principal Main: Crea instancias de Circulo y Rectangulo, las clona y las dibuja para demostrar que las copias tienen las mismas propiedades que los originales.
 */

/**
 * Clase principal para demostrar el uso del patrón Prototype
 */
public class AppTestPrototype
{
	public static void main(String[] args)
	{
		// Crear instancias de figuras
		Circulo circuloOriginal = new Circulo(10, 20, 30);
		Rectangulo rectanguloOriginal = new Rectangulo(40, 50);

		// Clonar las figuras
		Circulo circuloClonado = (Circulo) circuloOriginal.clonar();
		Rectangulo rectanguloClonado = (Rectangulo) rectanguloOriginal.clonar();

		// Dibujar las figuras originales y clonadas
		circuloOriginal.dibujar();
		circuloClonado.dibujar();
		rectanguloOriginal.dibujar();
		rectanguloClonado.dibujar();
	}
}
