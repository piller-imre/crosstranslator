package main;

public class UnaryOperator extends Expression {
	private StringExpression name;
	private Expression argument;
	public UnaryOperator(StringExpression name, Expression argument) {
		super();
		this.name = name;
		this.argument = argument;
	}
	public StringExpression getName() {
		return name;
	}
	public void setName(StringExpression name) {
		this.name = name;
	}
	public Expression getArgument() {
		return argument;
	}
	public void setArgument(Expression argument) {
		this.argument = argument;
	}
	
}
