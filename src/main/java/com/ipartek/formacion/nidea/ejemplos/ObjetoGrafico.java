package com.ipartek.formacion.nidea.ejemplos;

public abstract class ObjetoGrafico implements Imprimible {

	private int x;
	private int y;

	public void mover(int x, int y) {
		this.x = x;
		this.y = y;
	}

	abstract void dibujar();

}
