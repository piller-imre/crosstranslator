package main;

import java.util.List;

public class FunctExpression extends Expression {
	private ModifierType modifier;
	private String name; 
	private List<VarExpression> params;
	private Block block;
	
	public FunctExpression(String name, List<VarExpression> params, Block block) {
		super();
		this.modifier = ModifierType.PUBLIC;
		this.name = name;
		this.params = params;
		this.block = block;
	}
	public ModifierType getModifier() {
		return modifier;
	}
	public void setModifier(ModifierType modifier) {
		this.modifier = modifier;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<VarExpression> getParams() {
		return params;
	}
	public void setParams(List<VarExpression> params) {
		this.params = params;
	}
	public Block getBlock() {
		return block;
	}
	public void setBlock(Block block) {
		this.block = block;
	}
	
	
}
