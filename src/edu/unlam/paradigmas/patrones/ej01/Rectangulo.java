package edu.unlam.paradigmas.patrones.ej01;

import java.util.HashMap;
import java.util.Map;

public class Rectangulo implements FormaGeometricaAColor {

	private double base;
	private double altura;
	private String color;

	public Rectangulo(double base, double altura, String color) {
		this.base = base;
		this.altura = altura;
		this.color = color;
	}
	
	private double getMetrosCuadrados() {
		return this.base * this.altura;
	}

	public Map<String, Double> metrosCuadradosPorColor() {
		HashMap<String,Double> metrosPorcolor = new HashMap<String,Double>();
		metrosPorcolor.put(this.color, this.getMetrosCuadrados());
		
		return metrosPorcolor;
	}
}
