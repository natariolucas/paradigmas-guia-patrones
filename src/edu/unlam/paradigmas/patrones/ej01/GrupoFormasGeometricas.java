package edu.unlam.paradigmas.patrones.ej01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GrupoFormasGeometricas implements FormaGeometricaAColor {
	private List<FormaGeometricaAColor> formas;
	private static final int METROS_CUADRADOS_POR_POMO = 100;
	
	public GrupoFormasGeometricas() {
		this.formas = new ArrayList<FormaGeometricaAColor>();
	}

	public void agregarForma(FormaGeometricaAColor forma) {
		this.formas.add(forma);
	}
	
	@Override
	public Map<String, Double> metrosCuadradosPorColor() {
		Map<String, Double> acumuladorMetros = new HashMap<String, Double>();
		
		for(FormaGeometricaAColor forma : formas) {
			Map<String, Double> metrosForma = forma.metrosCuadradosPorColor();
			
			for (String color : metrosForma.keySet()) {
				if (acumuladorMetros.containsKey(color)) {
					acumuladorMetros.put(color, acumuladorMetros.get(color)+metrosForma.get(color));
				} else {
					acumuladorMetros.put(color, metrosForma.get(color));
				}
			}
		}
		
		return acumuladorMetros;
	}
	
	public Map<String, Integer> pomosColorNecesarios() {
		Map<String, Double> metrosPorColor = this.metrosCuadradosPorColor();
		Map<String, Integer> pomos = new HashMap<String,Integer>();
		
		for (String color : metrosPorColor.keySet()) {
			pomos.put(color, (int)Math.ceil(metrosPorColor.get(color)/METROS_CUADRADOS_POR_POMO));
		}
		
		return pomos;
	}
}
