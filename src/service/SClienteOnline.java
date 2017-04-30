package service;

import java.util.ArrayList;

import model.ClienteOnline;

public class SClienteOnline {
	
	private ArrayList<ClienteOnline> arClienteOn;

	public SClienteOnline() {
		super();
		this.arClienteOn = new ArrayList<ClienteOnline>();
	}

	public ArrayList<ClienteOnline> getArClienteOn() {
		return arClienteOn;
	}

	public void setArClienteOn(ArrayList<ClienteOnline> arClienteOn) {
		this.arClienteOn = arClienteOn;
	}	
}
