package hu.iit.uni_miskolc.horvath23.Crosstranslator.expressions;
public class BinaryOperator extends Expression {
	private String op;
	private Expression left;
	private Expression right;
	
	public BinaryOperator(String op, Expression left, Expression right) {
		super();
		this.op = op;
		this.left = left;
		this.right = right;
	}
	public String getOp() {
		return op;
	}
	public void setOp(String op) {
		this.op = op;
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
