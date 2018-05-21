package main;

import java.util.ArrayList;
import java.util.List;

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
