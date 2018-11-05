package hu.iit.uni_miskolc.horvath23.Crosstranslator.expressions;

/**
 * Represents a string value
 */
public class StringExpression extends Expression {
	
	private String value;

	public StringExpression(String value) {
		super();
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}	
}
