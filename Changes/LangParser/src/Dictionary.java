public class Dictionary extends Expression {
	private String name;
	private Expression[] key;
	private Expression[] value;
	
	public Dictionary(String name, Expression[] key, Expression[] value) {
		super();
		this.name = name;
		this.key = key;
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Expression getValue(int num) {
		return value[num];
	}

	public void setValue(Expression value, Expression key) {
	}
	
	
}
