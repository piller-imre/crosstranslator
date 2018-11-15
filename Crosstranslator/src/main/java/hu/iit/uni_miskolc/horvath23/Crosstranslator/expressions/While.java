package hu.iit.uni_miskolc.horvath23.Crosstranslator.expressions;

/**
 * Represents the classical while loop
 */
public class While extends Expression {
	
	private BinaryOperator condition;
	private Block block;
	
	public While(BinaryOperator condition, Block block) {
		super();
		this.condition = condition;
		this.block = block;
	}
	
	public BinaryOperator getCondition() {
		return condition;
	}
	
	public void setCondition(BinaryOperator condition) {
		this.condition = condition;
	}
	
	public Block getBlock() {
		return block;
	}
	
	public void setBlock(Block block) {
		this.block = block;
	}
}
