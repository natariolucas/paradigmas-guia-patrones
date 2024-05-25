package edu.unlam.paradigmas.patrones.ej02;

public class Tank {
	private TankState state;
	
	public Tank(TankState initialState) {
		this.state = initialState;
	}
	
	public void changeState(TankState state) {
		this.state = state;
	}
	
	public void moverse () {
		System.out.println("Mi modo actual es: " + this.state.toString() + "\n");
		
		this.state.moverse();
	}
	
	public void atacar () {
		System.out.println("Mi modo actual es: " + this.state.toString() + "\n");
		
		this.state.atacar();
	}

}
