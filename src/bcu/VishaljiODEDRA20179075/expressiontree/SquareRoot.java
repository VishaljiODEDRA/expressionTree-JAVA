package bcu.VishaljiODEDRA20179075.expressiontree;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SquareRoot extends Expression{
	
	private Expression subExpression;
	 
	public SquareRoot(Expression subExpression) {
		this.subExpression = subExpression;
	} 

	@Override
	public double evaluate(Map<String, Double> variables) {
		double e1 = subExpression.evaluate(variables);
		return Math.sqrt(e1);
	}

	@Override
	public Set<String> freeVariables() {	
		return subExpression.freeVariables();
	}

}
