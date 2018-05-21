package main;

import java.util.ArrayList;
import java.util.List;

public class ClassExpression extends Expression {
	private String name;
	private List<VarExpression> members;
	private List<Function> methods;
	
	public ClassExpression(String name) {
		super();
		this.name = name;
		this.members = new ArrayList<>();
		this.methods = new ArrayList<>();
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<VarExpression> getMembers() {
		return members;
	}

	public void setMembers(List<VarExpression> members) {
		this.members = members;
	}

	public List<Function> getMethods() {
		return methods;
	}

	public void setMethods(List<Function> methods) {
		this.methods = methods;
	}
	
	public void addMember(VarExpression member) {
		this.members.add(member);
	}
	
	public void removeMember(VarExpression member) {
		this.members.remove(member);
	}
	
	public void setMember(int place, VarExpression member) {
		this.members.set(place, member);
	}
	
	public void addFunction(Function method) {
		this.methods.add(method);
	}
	
	public void removeFunction(Function method) {
		this.methods.remove(method);
	}
	
	public void setFunction(int place, Function method) {
		this.methods.set(place, method);
	}
	
}
