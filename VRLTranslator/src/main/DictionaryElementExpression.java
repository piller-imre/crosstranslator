package main;

public class DictionaryElementExpression {
	public String name;
	public Expression value;
	
	public DictionaryElementExpression(String name, Expression value) {
		super();
		this.name = name;
		this.value = value;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Expression getValue() {
		return value;
	}
	public void setValue(Expression value) {
		this.value = value;
	}	
	
}
