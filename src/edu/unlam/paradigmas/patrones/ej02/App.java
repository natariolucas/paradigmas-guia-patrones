package edu.unlam.paradigmas.patrones.ej02;

public class App {

	public static void main(String[] args) {
		Tank tanque = new Tank(new TankModeSiegeState());
		
		tanque.moverse();
		tanque.atacar();
		
		tanque.changeState(new TankModeTankState());
		tanque.moverse();
		tanque.atacar();
	}

}
