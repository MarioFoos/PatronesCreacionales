package com.diardon.builder;

/**
 * Clase Builder
 */
@SuppressWarnings("unused")
public class HamburguesaBuilder
{
    // Requeridos
    String pan;
    String carne;
    
    // Opcionales
	boolean lechuga;
    boolean tomate;
    boolean queso;
    boolean bacon;

    /**
     * Constructor del Builder con los atributos requeridos
     * @param pan Pan
     * @param carne Carne
     */
    public HamburguesaBuilder(String pan, String carne) {
        this.pan = pan;
        this.carne = carne;
    }
    /**
     * Métodos para agregar ingredientes opcionales
     * @return Builder
     */
    public HamburguesaBuilder agregarLechuga() {
        this.lechuga = true;
        return this;
    }
    /**
     * Agregar tomate
     * @return Builder
     */
    public HamburguesaBuilder agregarTomate() {
        this.tomate = true;
        return this;
    }
    /**
     * Agregar queso
     * @return Builder
     */
    public HamburguesaBuilder agregarQueso() {
        this.queso = true;
        return this;
    }
    /**
     * Agregar bacon
     * @return Builder
     */
    public HamburguesaBuilder agregarBacon() {
        this.bacon = true;
        return this;
    }
    /**
     * Construir la hamburguesa final
     * @return
     */
    public Hamburguesa build() {
        return new Hamburguesa(this);
    }
}
