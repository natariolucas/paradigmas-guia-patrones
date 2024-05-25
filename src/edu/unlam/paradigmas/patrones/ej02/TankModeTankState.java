package edu.unlam.paradigmas.patrones.ej02;

public class TankModeTankState implements TankState {

	public TankModeTankState() {
		
	}

	@Override
	public void moverse() {
		System.out.println("Se ha hecho un movimiento en modo Tanque \n");
	}

	@Override
	public void atacar() {
		System.out.println("Se ha hecho un ataque en modo Tanque \n");		
	}

	
}
