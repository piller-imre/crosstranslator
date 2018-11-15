package hu.iit.uni_miskolc.horvath23.Crosstranslator.expressions;

/**
 * Represents a member definition
 */
public class VarExpression extends Expression {
	
	private String name;
	private Enum<ModifierType> modifier;
	private Enum<VariableType> type;
	private Enum<VariableAttr> attr;
	
	public VarExpression(String name, Enum<VariableAttr> attr, Enum<ModifierType> modifier, Enum<VariableType> type) {
		super();
		this.name = name;
		this.modifier = modifier;
		this.type = type;
		this.attr = attr;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Enum<ModifierType> getModifier() {
		return modifier;
	}
	
	public void setModifier(Enum<ModifierType> modifier) {
		this.modifier = modifier;
	}
	
	public Enum<VariableType> getType() {
		return type;
	}
	
	public void setType(Enum<VariableType> type) {
		this.type = type;
	}

	public Enum<VariableAttr> getAttr() {
		return attr;
	}

	public void setAttr(Enum<VariableAttr> attr) {
		this.attr = attr;
	}
}