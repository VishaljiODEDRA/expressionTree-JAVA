package bcu.VishaljiODEDRA20179075.expressiontree;

import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Variable extends Expression {
	
	private String variable;

	public Variable(String variable){
		this.variable = variable;
	}

	@Override
	public double evaluate(Map<String, Double> variables) throws IllegalArgumentException {
		if (!variables.containsKey(variable)) {
			throw new IllegalArgumentException("Key not found!!!");
		}  else {
		return variables.get(variable);
		}
	}

	@Override
	public Set<String> freeVariables() {
		Set<String> freeVariable = new HashSet<>();
		freeVariable.add(variable);
		return Collections.unmodifiableSet(freeVariable);
		
	}

}
