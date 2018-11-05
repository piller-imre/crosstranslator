package hu.iit.uni_miskolc.horvath23.Crosstranslator.expressions;

public class IntExpression extends Expression {

	public int value;

	public IntExpression(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
}
