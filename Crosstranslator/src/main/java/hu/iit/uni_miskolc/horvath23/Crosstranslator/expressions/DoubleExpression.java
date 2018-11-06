package hu.iit.uni_miskolc.horvath23.Crosstranslator.expressions;

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
