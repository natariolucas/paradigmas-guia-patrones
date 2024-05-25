package edu.unlam.paradigmas.patrones.ej03;

import java.util.Iterator;

public class ArbolBinario<T> implements Iterable<T>{

	private ArbolBinario<T> HojaIzquierda;
	private T Raiz;
	private ArbolBinario<T> HojaDerecha;
	
	public ArbolBinario(T raiz) {
		this.Raiz = raiz;
	}

	public ArbolBinario<T> getHojaIzquierda() {
		return HojaIzquierda;
	}

	public void setHojaIzquierda(ArbolBinario<T> hojaIzquierda) {
		HojaIzquierda = hojaIzquierda;
	}

	public T getRaiz() {
		return Raiz;
	}

	public void setRaiz(T raiz) {
		Raiz = raiz;
	}

	public ArbolBinario<T> getHojaDerecha() {
		return HojaDerecha;
	}

	public void setHojaDerecha(ArbolBinario<T> hojaDerecha) {
		HojaDerecha = hojaDerecha;
	}

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
