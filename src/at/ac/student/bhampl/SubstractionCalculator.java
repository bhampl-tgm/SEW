package at.ac.student.bhampl;

import java.util.ArrayList;
import java.util.List;

/**
 * Eine {@link Calculatable} Implementation fuer Substraktion
 * 
 * @author Burkhard Hampl
 * @version 1.0
 */
public class SubstractionCalculator implements Calculatable {

	@Override
	public List<Double> processCalculations(List<Double> values, double modifier) {
		List<Double> tmp = new ArrayList<Double>();
		for (double d : values) {
			tmp.add(d - modifier);
		}
		return tmp;
	}

}
