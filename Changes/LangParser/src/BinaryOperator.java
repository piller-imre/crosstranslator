public class BinaryOperator extends Expression {
	private String name;
	private Expression left;
	private Expression right;
	
	public BinaryOperator(String name, Expression left, Expression right) {
		this.name = name;
		this.left = left;
		this.right = right;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Expression getLeft() {
		return left;
	}

	public void setLeft(Expression left) {
		this.left = left;
	}

	public Expression getRight() {
		return right;
	}

	public void setRight(Expression right) {
		this.right = right;
	}
	
	
}
