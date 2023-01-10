package bcu.VishaljiODEDRA20179075.expressiontree;

import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Constant extends Expression {

	private double constNumber;

	public Constant(double constNumber) {
		this.constNumber = constNumber;
	}
	
	@Override
	public double evaluate(Map<String, Double> variables) {
		return constNumber;
	}

	@Override
	public Set<String> freeVariables() {
		Set<String> emptySet = new HashSet<>();
		return Collections.unmodifiableSet(emptySet);
	}
	
	

}
