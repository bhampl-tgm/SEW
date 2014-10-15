/**
 * Das Package von S02 - Objektorientiertes Paradigma
 */
package at.ac.tgm.student.bhampl;

/**
 * Ein Spielzeugauto
 * 
 * @author Burkhard Hampl
 * @version 1.0
 * @see PlayableToy
 * @see ToyVehicle
 */
public class ToyCar extends ToyVehicle {

	private String type;
	private String name;
	private int seats;
	private boolean left;
	private String color;

	/**
	 * Erstellt ein neues Spielzeugauto mit der Anzahl von Raedern und einem
	 * Namen
	 * 
	 * @param weels
	 *            die Anzahl der Raeder
	 * @param name
	 *            der Name des Autos
	 * @param seats
	 *            die Sitzanzahl
	 * @param left
	 *            ob der Fahrer links sitzt
	 * @param color
	 *            die Farbe
	 */
	public ToyCar(String name, int weels, int seats, boolean left, String color) {
		super(weels);
		this.type = "ToyCar";
		this.setName(name);
		this.setWeels(weels);
		this.setSeats(seats);
		this.setLeft(left);
		this.setColor(color);
	}

	/**
	 * Erstellt ein neues Spielzeugauto mit dem Namen ToyCar, 4 Raedern, 5
	 * Sitzen, fahrer Sitzt links und der Farbe rot;
	 */
	public ToyCar() {
		this("ToyCar", 4, 5, true, "red");
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
	 * Setzt die Anzahl der Sitze
	 * 
	 * @return die Anzahl
	 */
	public int getSeats() {
		return this.seats;
	}

	/**
	 * Setzt die Anzahl der Sitze
	 * 
	 * @param seats
	 *            die Sitze
	 */
	public void setSeats(int seats) {
		this.seats = seats;
	}

	/**
	 * Sitzt der Fahrer links?
	 * 
	 * @return ob der Fahrer links sitzt
	 */
	public boolean isLeft() {
		return this.left;
	}

	/**
	 * Setzt die Sitzposition des Fahrers
	 * 
	 * @param left
	 *            ob der Fahrer links sitzt
	 */
	public void setLeft(boolean left) {
		this.left = left;
	}

	/**
	 * Dreht den Wert von left um
	 * 
	 * @return den umgekehrten Wert
	 */
	public boolean toggleLeft() {
		return this.left = !this.left;
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
}
