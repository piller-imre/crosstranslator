package hu.iit.uni_miskolc.horvath23.Crosstranslator.expressions;

/**
 * Range based loop expression
 */
public class For extends Expression {

	/**
	 * First value of the range
	 */
	private Expression startValue;
	
	/**
	 * Step size
	 */
	private Expression cycleChange;
	
	/**
	 * Last value of the range
	 */
	private Expression endGoal;
	private Block block;
	
	public For(Expression startValue, Expression cycleChange, Expression endGoal, Block block) {
		super();
		setStartValue(startValue);
		setCycleChange(cycleChange);
		setEndGoal(endGoal);
		setBlock(block);
	}
	
	public Expression getStartValue() {
		return startValue;
	}
	
	public void setStartValue(Expression startValue) {
		this.startValue = startValue;
	}
	
	public Expression getCycleChange() {
		return cycleChange;
	}
	
	public void setCycleChange(Expression cycleChange) {
		this.cycleChange = cycleChange;
	}
	
	public Expression getEndGoal() {
		return endGoal;
	}
	
	public void setEndGoal(Expression endGoal) {
		this.endGoal = endGoal;
	}
	
	public Block getBlock() {
		return block;
	}
	
	public void setBlock(Block block) {
		this.block = block;
	}
}
