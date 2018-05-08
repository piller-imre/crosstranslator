public class Variable extends Expression {
	private String name;
	private Enum<VariableType> type;
	public Variable(String name, Enum<VariableType> type) {
		super();
		this.name = name;
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Enum<VariableType> getType() {
		return type;
	}
	public void setType(Enum<VariableType> type) {
		this.type = type;
	}
	
	
}