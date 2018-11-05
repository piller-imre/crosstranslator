package hu.iit.uni_miskolc.horvath23.Crosstranslator.expressions;

import java.util.ArrayList;
import java.util.List;

/**
 * Block of expressions
 */
public class Block extends Expression {
	
	private List<Expression> members;

	public Block() {
		this.members = new ArrayList<Expression>();
	}

	public List<Expression> getMembers() {
		return members;
	}

	public void setMembers(List<Expression> members) {
		this.members = members;
	}
	
	public void addMember(Expression member) {
		this.members.add(member);
	}
	
	public void removeMember(Expression member) {
		this.members.remove(member);
	}
	
	public void setMember(int place, Expression member) {
		// TODO: Check the place argument!
		this.members.set(place, member);
	}
}
