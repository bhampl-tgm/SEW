/**
 * Das Package von S02 - Objektorientiertes Paradigma
 */
package at.ac.tgm.student.bhampl;

/**
 * Diese abstrakte Klasse definiert ein Fahrzeug
 * 
 * @author Burkard Hampl
 * @version 1.0
 * @see PlayableToy
 */
public abstract class ToyVehicle implements PlayableToy {

	private int weels;

	/**
	 * 
	 * @param weels
	 *            die Anzahl der Raeder
	 * 
	 */
	public ToyVehicle(int weels) {
		this.setWeels(weels);
	}

	/**
	 * Gibt die Anzahl der Reader zurück
	 * 
	 * @return die Anzahl der Reader
	 */
	public int getWeels() {
		return this.weels;
	}

	/**
	 * Setzt die Anzahl der Raeder
	 * 
	 * @param weels
	 *            die Anzahl der Raeder
	 */
	public void setWeels(int weels) {
		this.weels = weels;
	}
}
