package at.ac.student.bhampl;

import java.util.List;

/**
 * Interface das zum Rechnen gebraucht wird
 * 
 * @author Burkhard Hampl
 * @version 1.0
 */
public interface Calculatable {

	/**
	 * Die
	 * 
	 * @return eine {@link List} mit {@link Double}-Werten, die mit
	 *         {@link Calculator#setModifiert(double)} vaendert wurden
	 */
	public abstract List<Double> processCalculations();

}
