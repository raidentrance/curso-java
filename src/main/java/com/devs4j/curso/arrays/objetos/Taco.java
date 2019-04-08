package com.devs4j.curso.arrays.objetos;

public class Taco {
	private SaborDeTaco saborDeTaco;
	private boolean cebolla;
	private boolean cilantro;
	
	public Taco(SaborDeTaco saborDeTaco, boolean cebolla, boolean cilantro) {
		this.saborDeTaco = saborDeTaco;
		this.cebolla = cebolla;
		this.cilantro = cilantro;
	}

	public SaborDeTaco getSaborDeTaco() {
		return saborDeTaco;
	}

	public void setSaborDeTaco(SaborDeTaco saborDeTaco) {
		this.saborDeTaco = saborDeTaco;
	}

	public boolean isCebolla() {
		return cebolla;
	}

	public void setCebolla(boolean cebolla) {
		this.cebolla = cebolla;
	}

	public boolean isCilantro() {
		return cilantro;
	}

	public void setCilantro(boolean cilantro) {
		this.cilantro = cilantro;
	}

}
