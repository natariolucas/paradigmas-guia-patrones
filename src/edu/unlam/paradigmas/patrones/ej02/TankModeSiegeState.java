package edu.unlam.paradigmas.patrones.ej02;

public class TankModeSiegeState implements TankState{

	public TankModeSiegeState() {
	}
	
	@Override
	public void moverse() {
		System.out.println("Se ha hecho un movimiento en modo Asedio \n");
	}

	@Override
	public void atacar() {
		System.out.println("Se ha hecho un ataque en modo Asedio \n");		
	}

}
