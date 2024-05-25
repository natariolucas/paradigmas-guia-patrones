package edu.unlam.paradigmas.patrones.ej03;

import java.util.Iterator;
import java.util.Stack;

public class ArbolBinarioEnOrden<T> implements Iterator<T> {
	private Stack<ArbolBinario<T>> lista;
	
	public ArbolBinarioEnOrden(ArbolBinario<T> arbol) {
		this.lista = new Stack<ArbolBinario<T>>();
		this.pushIzquierdos(arbol);
	}
	
	private void pushIzquierdos(ArbolBinario<T> arbol) {
		while (arbol != null) {
			this.lista.push(arbol);
			arbol = arbol.getHojaIzquierda();
		}
	}
	
	@Override
	public boolean hasNext() {
		return !this.lista.isEmpty();
	}
	
	@Override
	public T next() {
		ArbolBinario<T> arbolHojaIzquierda = this.lista.pop();
		T hojaIzquierda = arbolHojaIzquierda.getRaiz();
		
		if (arbolHojaIzquierda.getHojaDerecha() != null) {
			this.pushIzquierdos(arbolHojaIzquierda.getHojaDerecha());
		}
		
		return hojaIzquierda;
	}

}
