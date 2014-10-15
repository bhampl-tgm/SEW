/**
 * Das Package von S02 - Objektorientiertes Paradigma
 */
package at.ac.tgm.student.bhampl;

import java.util.ArrayList;
import java.util.List;

/**
 * Eine Spielzeuglieferung die Teile des Tyes T beinhaltet
 * 
 * @author Burkhard Hampl
 * @version 1.0
 * @param <T>
 *            der Typ der Teile
 */
public class ToyDelivery<T extends PlayableToy> {
	// hier kann nun jede Klasse die Von PlayableToy erbt eingesetzt werden
	// d.h. es kann dann natuerlich nur die Methoden und Variablen die
	// PlayableToy "vorschreibt" angesprochen werden

	private List<T> lieferung;

	/**
	 * Erstaellt eine neue Spielzeuglieferung
	 */
	public ToyDelivery() {
		// dies hier ist ein fall von
		this.lieferung = new ArrayList<T>();
	}

	/**
	 * Fuegt ein neues Teil des Typs T hinzu
	 * 
	 * @param e
	 *            das Teil
	 * @return true wenn die Liste veraendert wurde (wie bei
	 *         {@link List#add(Object)})
	 */
	public boolean addToy(T e) {
		return this.lieferung.add(e);
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

	/**
	 * Gibt die Namen und Typen der Spielzeuglieferung aus
	 */
	public void printContents() {
		for (T t : this.lieferung) {
			System.out.println(t.getName() + ": " + t.getType());
			// Obwohl hier ein allgemeiner typ T verlagnt wird kann davon
			// ausgegangen werden, dass die Methode getName vorhanden ist,
			// da oben extends PlayableToy steht
			// z.B. koennen jtz die Methode getFarbe von ToyCar nicht verwendet
			// werden, weil man sich nicht sicher sein kann dass nur ein
			// ToyCar kommt z.B. ToyAirplane
		}
	}
}
