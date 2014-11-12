package at.ac.student.bhampl;

import java.util.List;

/**
 * Ein Rechner der mittels der Klassen die das Interface {@link Calculatable}
 * implementieren die Liste von Elementen mit der Zahl modifier veraendert
 * 
 * @author Burkhard Hampl
 * @version 0.1
 * @see Calculatable
 */
public class Calculator {

	private List<Double> values;

	private double modifier;

	private Calculatable calculatable;

	/**
	 * Initialisiert einen neuen Rechner
	 */
	public Calculator() {

	}

	/**
	 * Fuegt eine Zahl zu der Liste hinzu
	 * 
	 * @param value
	 *            die Zahl
	 */
	public void addValue(double value) {

	}

	/**
	 * Setzt die Zahl mit der die Liste veraendert werden soll
	 * 
	 * @param modifier
	 *            die Zahl
	 */
	public void setModifiert(double modifier) {

	}

	/**
	 * Loescht das Element aus der Liste
	 * 
	 * @param value
	 *            das zu loeschende Element
	 */
	public void removeValue(double value) {

	}

	@Override
	public String toString() {
		return null;
	}

	/**
	 * Fuehrt die Rechenoperation aus
	 * 
	 * @return eine {@link List} mit {@link Double}-Werten, die mit
	 *         {@link Calculator#setModifiert(double)} vaendert wurden
	 * @see Calculatable
	 */
	public List<Double> processCalculations() {
		return null;
	}

	/**
	 * Setzt die Methode des Rechnens
	 * 
	 * @param calculatable
	 *            die Methode
	 */
	public void setCalculatable(Calculatable calculatable) {

	}

}
