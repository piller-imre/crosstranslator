package def;

import java.util.ArrayList;

import main.Expression;

public class Node {
	
	private String name;
	private String value;
	private Expression currentClass;
	private ArrayList<Node> childNodes = new ArrayList<>();
	
	Node(Expression currentClass) {
		this.currentClass = currentClass;
		this.childNodes.clear();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public ArrayList<Node> getChildNodes() {
		return childNodes;
	}
	
	public void addChildNode(Node node) {
		this.childNodes.add(node);
	}
	
	public void removeChildNode(Node node) {
		this.childNodes.removeIf(s -> s.equals(node.getName())); 
	}
}
