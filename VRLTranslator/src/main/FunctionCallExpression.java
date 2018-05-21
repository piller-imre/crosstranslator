package main;

import java.util.List;

public class FunctionCallExpression extends Expression {
	private String name;
	private List<Expression> args;
	public FunctionCallExpression(String name, List<Expression> args) {
		super();
		this.name = name;
		this.args = args;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Expression> getArgs() {
		return args;
	}
	public void setArgs(List<Expression> args) {
		this.args = args;
	}
	
	
	
}
