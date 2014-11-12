package at.ac.student.bhampl;

import java.util.ArrayList;
import java.util.List;

/**
 * Eine {@link Calculatable} Implementation fuer Division
 * 
 * @author Burkhard Hampl
 * @version 1.0
 */
public class DivisionCalculator implements Calculatable {

	@Override
	public List<Double> processCalculations(List<Double> values, double modifier) {
		if (modifier == 0) {
			throw new IllegalArgumentException("Argument 'modifier' is 0");
		}
		List<Double> tmp = new ArrayList<Double>();
		for (double d : values) {
			tmp.add(d / modifier);
		}
		return tmp;
	}

}
