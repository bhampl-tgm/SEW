/**
 * Das Package von S02 - Objektorientiertes Paradigma
 */
package at.ac.tgm.student.bhampl;

/**
 * Ein Spielzeugflugzeug
 * 
 * @author Burkhard Hampl
 * @version 1.0
 * @see PlayableToy
 * @see ToyVehicle
 */
public class ToyAirplane extends ToyVehicle {

	private String type;
	private String name;
	private String color;
	private int wings;

	/**
	 * Erzeugt eine neues Spielzeugflugzeug mit Namen, anzahl Raedern, farbe und
	 * anzahl Fluegel
	 * 
	 * @param weels
	 *            die Anzahl der Raeder
	 * @param name
	 *            der Name des Autos
	 * @param color
	 *            die Farbe
	 * @param wings
	 *            die Anzahl der Fluegel
	 */
	public ToyAirplane(String name, int weels, String color, int wings) {
		super(weels);
		this.type = "ToyAirplane";
		this.setWeels(weels);
		// auf setWeels kann zugegriffen werden, weil alle methoden vererbt
		// werden
		this.setName(name);
		this.setColor(color);
		this.setWings(wings);
	}

	/**
	 * Erstellt ein Flugzeug mit dem Namen ToyAirplane, 6 Raedern, der Farbe
	 * Schwarz und 2 Fluegeln
	 */
	public ToyAirplane() {
		this("ToyAirplane", 6, "black", 2);
	}

	@Override
	public String getType() {
		return this.type;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Gibt die Farbe des Autos zurueck
	 * 
	 * @return die Farbe
	 */
	public String getColor() {
		return this.color;
	}

	/**
	 * Setzt die Fabe des Autos
	 * 
	 * @param color
	 *            die Farbe des Autos
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * Gibt die Anzahl der Fluegel zurueck
	 * 
	 * @return dei Anazhl
	 */
	public int getWings() {
		return wings;
	}

	/**
	 * Setzt die Anzahl der Fuegel
	 * 
	 * @param wings
	 *            die Anzahl
	 */
	public void setWings(int wings) {
		this.wings = wings;
	}

}
