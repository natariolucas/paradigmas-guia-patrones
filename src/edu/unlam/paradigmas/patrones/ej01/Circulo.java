package edu.unlam.paradigmas.patrones.ej01;

import java.util.HashMap;
import java.util.Map;

public class Circulo implements FormaGeometricaAColor {

	private double radio;
	private String color;

	public Circulo(double radio, String color) {
		this.radio = radio;
		this.color = color;
	}
	
	private double getMetrosCuadrados() {
		return Math.PI * Math.pow(this.radio,2);
	}
	
	public Map<String, Double> metrosCuadradosPorColor() {
		HashMap<String,Double> metrosPorcolor = new HashMap<String,Double>();
		metrosPorcolor.put(this.color, this.getMetrosCuadrados());
		
		return metrosPorcolor;
	}
}
