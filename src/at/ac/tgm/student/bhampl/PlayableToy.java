/**
 * Das Package von S02 - Objektorientiertes Paradigma
 */
package at.ac.tgm.student.bhampl;

/**
 * @author Burkhard Hampl
 * @version 1.0
 */
public interface PlayableToy {

	/**
	 * Gibt den Typ zurueck
	 * 
	 * @return der Typ
	 */
	public String getType();

	/**
	 * Gibt den Namen zurueck
	 * 
	 * @return der Namen
	 */
	public String getName();

	/**
	 * Setzt den Namen
	 * 
	 * @param name
	 *            der Name
	 */
	public void setName(String name);

}
