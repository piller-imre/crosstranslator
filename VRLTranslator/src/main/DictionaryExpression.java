package main;

import java.util.List;

public class DictionaryExpression extends Expression {
	private String name;
	private List<DictionaryElementExpression> elements;
	public DictionaryExpression(String name) {
		super();
		this.name = name;
		this.elements.clear();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<DictionaryElementExpression> getElements() {
		return elements;
	}
		
	public void setElements(List<DictionaryElementExpression> elements) {
		this.elements = elements;
	}

	public void addElement(DictionaryElementExpression element) {
		this.elements.add(element);
	}
	
	public void removeElement(DictionaryElementExpression element) {
		this.elements.remove(element);
	}
	
	public void setElement(int place, DictionaryElementExpression element) {
		this.elements.set(place, element);
	}
}
