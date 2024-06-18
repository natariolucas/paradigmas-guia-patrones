package edu.unlam.paradigmas.patrones.ej03;

public class App {

	public static void main(String[] args) {
		ArbolBinario<Integer> arbol= new ArbolBinario<Integer>(4);
		
		ArbolBinario<Integer> arbolIzq = new ArbolBinario<Integer>(2);
		arbolIzq.setHojaIzquierda(new ArbolBinario<Integer>(1));
		arbolIzq.setHojaDerecha(new ArbolBinario<Integer>(3));
		
		arbol.setHojaIzquierda(arbolIzq);
		
		ArbolBinario<Integer> arbolDer = new ArbolBinario<Integer>(5);
		arbolDer.setHojaDerecha(new ArbolBinario<Integer>(6));
		
		arbol.setHojaDerecha(arbolDer);
		
		for(Integer nodo : arbol) {
			System.out.println("Nodo: " + nodo);
		}
	}

}
