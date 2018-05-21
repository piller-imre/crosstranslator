package main;

public class For extends Expression {

	private Expression startValue;
	private Expression cycleChange;
	private Expression endGoal;
	private Block block;
	
	public For(Expression startValue, Expression cycleChange, Expression endGoal, Block block) {
		super();
		this.startValue = startValue;
		this.cycleChange = cycleChange;
		this.endGoal = endGoal;
		this.block = block;
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
