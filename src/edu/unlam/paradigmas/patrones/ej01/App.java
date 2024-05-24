package edu.unlam.paradigmas.patrones.ej01;

public class App {

	public static void main(String[] args) {
		GrupoFormasGeometricas total = new GrupoFormasGeometricas();
		
		GrupoFormasGeometricas grupo1 = new GrupoFormasGeometricas();
		grupo1.agregarForma(new Circulo(4, "Rojo"));
		grupo1.agregarForma(new Circulo(10, "Azul"));
		grupo1.agregarForma(new Rectangulo(2, 5, "Rojo"));
		
		GrupoFormasGeometricas grupo2 = new GrupoFormasGeometricas();
		grupo1.agregarForma(new Rectangulo(40, 5, "Lila"));
		grupo1.agregarForma(new Rectangulo(100, 3, "blanco"));
		
		total.agregarForma(grupo1);
		total.agregarForma(grupo2);
		total.agregarForma(new Rectangulo(100,2, "blanco"));
		
		System.out.println(total.pomosColorNecesarios());
	}

}
