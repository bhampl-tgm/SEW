/**
 * Das Package von S02 - Objektorientiertes Paradigma
 */
package at.ac.tgm.student.bhampl;

import java.util.ArrayList;
import java.util.List;

/**
 * Eine Spielzeuglieferung die Teile des Tyes T beinhaltet
 * @author Burkhard Hampl
 * @version 1.0
 * @param <T> der Typ der Teile
 */
public class Spielzeuglieferung<T extends PlayableToy> {
	private List<T> lieferung;

	/**
	 * Erstaellt eine neue Spielzeuglieferung
	 */
	public Spielzeuglieferung() {
		this.lieferung = new ArrayList<T>();
	}

	/**
	 * Fuegt ein neues Teil des Typs T hinzu
	 * @param das Teil
	 */
	public void addToy(T e) {
		this.lieferung.add(e);
	}

	/**
	 * Gibt das Spielzeug an der Stelle index zurueck
	 * 
	 * @param index
	 *            die Stelle des Teiles
	 * @return das Teil an der Stelle index
	 */
	public T getToy(int index) {
		return this.lieferung.get(index);
	}
}
