package hu.iit.uni_miskolc.horvath23.Crosstranslator.expressions;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a program as a list of classes
 */
public class Program {
	
	private List<ClassExpression> values;

	public Program(List<ClassExpression> values) {
		super();
		this.values = values;
	}

	public List<ClassExpression> getValues() {
		return values;
	}

	public void setValues(List<ClassExpression> values) {
		this.values = values;
	}
	
	public void addValues(ClassExpression value) {
		this.values.add(value);
	}

	@Override
	public String toString() {
		return "Program [values=" + values + "]";
	}
}
