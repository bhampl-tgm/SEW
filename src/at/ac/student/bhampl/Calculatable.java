package at.ac.student.bhampl;

import java.util.List;

/**
 * Interface das zum Rechnen gebraucht wird
 * 
 * @author Burkhard Hampl
 * @version 1.1
 */
public interface Calculatable {

	/**
	 * Fuehrt die Rechenoperation aus
	 * 
	 * @return eine {@link List} mit {@link Double}-Werten
	 */
	public abstract List<Double> processCalculations();

}
