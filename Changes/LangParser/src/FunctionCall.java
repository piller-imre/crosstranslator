
public class FunctionCall extends Expression {
	private Function funct;
	private Expression[] arguments;
	public FunctionCall(Function funct, Expression[] arguments) {
		super();
		this.funct = funct;
		this.arguments = arguments;
	}
	public Function getFunct() {
		return funct;
	}
	public void setFunct(Function funct) {
		this.funct = funct;
	}
	public Expression[] getArguments() {
		return arguments;
	}
	public void setArguments(Expression[] arguments) {
		this.arguments = arguments;
	}
	
	
}
