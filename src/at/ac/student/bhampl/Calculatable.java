package at.ac.student.bhampl;

import java.util.List;

/**
 * Interface das zum Rechnen gebraucht wird
 * 
 * @author Burkhard Hampl
 * @version 1.3
 */
public interface Calculatable {

	/**
	 * Fuehrt die Rechenoperation aus
	 * 
	 * @param values
	 *            die Liste mit den Werten, die veraendert werden soll
	 * @param modifier
	 *            der Wert, mit dem die Liste modifiziert werden soll
	 * 
	 * @return eine {@link List} mit {@link Double}-Werten
	 */
	public abstract List<Double> processCalculations(List<Double> values, double modifier);

}
