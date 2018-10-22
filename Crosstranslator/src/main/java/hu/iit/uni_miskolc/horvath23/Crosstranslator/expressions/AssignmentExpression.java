package hu.iit.uni_miskolc.horvath23.Crosstranslator.expressions;

public class AssignmentExpression extends Expression {
	private Expression left;
	private Expression right;
	public AssignmentExpression(Expression left, Expression right) {
		super();
		this.left = left;
		this.right = right;
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
