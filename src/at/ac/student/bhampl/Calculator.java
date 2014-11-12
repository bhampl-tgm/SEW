package at.ac.student.bhampl;

import java.util.ArrayList;
import java.util.List;

/**
 * Ein Rechner der mittels der Klassen die das Interface {@link Calculatable}
 * implementieren die Liste von Elementen mit der Zahl modifier veraendert
 * 
 * @author Burkhard Hampl
 * @version 1.0
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
		this.values = new ArrayList<Double>();
		values.equals(this);
	}

	/**
	 * Fuegt eine Zahl zu der Liste hinzu
	 * 
	 * @param value
	 *            die Zahl
	 */
	public void addValue(double value) {
		this.values.add(value);
	}

	/**
	 * Setzt die Zahl mit der die Liste veraendert werden soll
	 * 
	 * @param modifier
	 *            die Zahl
	 */
	public void setModifiert(double modifier) {
		this.modifier = modifier;
	}

	/**
	 * Loescht das Element aus der Liste
	 * 
	 * @param value
	 *            das zu loeschende Element
	 */
	public void removeValue(double value) {
		this.values.remove(value);
	}

	@Override
	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append("[");
		for (double d : this.values) {
			s.append(d + ",");
		}
		s.delete(s.length() - 1, s.length());
		s.append("]");
		return s.toString();
	}

	/**
	 * Fuehrt die Rechenoperation aus
	 * 
	 * @return eine {@link List} mit {@link Double}-Werten, die mit
	 *         {@link Calculator#setModifiert(double)} vaendert wurden
	 * @see Calculatable
	 */
	public List<Double> processCalculations() {
		return this.calculatable.processCalculations(this.values, this.modifier);
	}

	/**
	 * Setzt die Methode des Rechnens
	 * 
	 * @param calculatable
	 *            die Methode
	 */
	public void setCalculatable(Calculatable calculatable) {
		this.calculatable = calculatable;
	}

}
