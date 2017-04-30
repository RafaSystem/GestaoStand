package service;

import java.util.ArrayList;

import model.Stand;

public class SStand {
	private ArrayList<Stand> arStand;

	public SStand() {
		super();
		this.arStand = new ArrayList<Stand>();
	}

	public ArrayList<Stand> getArStand() {
		return arStand;
	}

	public void setArStand(ArrayList<Stand> arStand) {
		this.arStand = arStand;
	}
	
}
