package main;

import java.util.ArrayList;
import java.util.List;

public class SequenceExpression extends Expression {
	private String name;
	private List<Expression> values;
	
	public SequenceExpression(String name) {
		this.name = name;
		this.values = new ArrayList<Expression>();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Expression> getValues() {
		return values;
	}
	public void setValues(List<Expression> values) {
		this.values.addAll(values);
	}
	
	public void addValue(Expression value) {
		this.values.add(value);
	}
	
	public void setValue(int place, Expression value) {
		this.values.set(place, value);
	}
	
}
