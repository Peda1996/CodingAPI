package de.codingair.codingapi.player.gui.bossbar;

/**
 * Removing of this disclaimer is forbidden.
 *
 * @author codingair
 * @verions: 1.0.0
 **/

public enum BarStyle {
	PROGRESS(0),
	NOTCHED_6(1),
	NOTCHED_10(2),
	NOTCHED_12(3),
	NOTCHED_20(4);
	
	private int id;
	
	BarStyle(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
}
