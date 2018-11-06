package hu.iit.uni_miskolc.horvath23.Crosstranslator.expressions;

/**
 * Represents a boolean expression
 */
public class BoolExpression extends Expression {

	private boolean value;

	public BoolExpression(boolean value) {
		super();
		this.value = value;
	}

	public boolean isValue() {
		return value;
	}

	public void setValue(boolean value) {
		this.value = value;
	}
}
