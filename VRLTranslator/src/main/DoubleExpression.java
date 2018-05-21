package main;

public class DoubleExpression extends Expression {
	
	private double value;

	public DoubleExpression(double value) {
		super();
		this.value = value;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}
	
	

}
