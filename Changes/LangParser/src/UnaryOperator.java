
public class UnaryOperator extends Expression {
	private String name;
	private Expression argument;
	public UnaryOperator(String name, Expression argument) {
		super();
		this.name = name;
		this.argument = argument;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Expression getArgument() {
		return argument;
	}
	public void setArgument(Expression argument) {
		this.argument = argument;
	}
	
	
}
