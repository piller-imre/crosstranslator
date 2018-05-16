import java.util.Arrays;

public class Sequence extends Expression {
	private String name;
	private Expression[] value;
	
	void add(Expression[] value) {
		int i;
		Expression[] array = Arrays.copyOf(this.value, this.value.length + value.length);
		
		for(i = this.value.length; i <= this.value.length + value.length; i++) {
			array[i] = value[i];
		}
		this.value = array;
	}
	
	void remove(int value) {
		int i;
		Expression[] array = Arrays.copyOf(this.value, this.value.length - 1);
		
		for(i = 0; i <= this.value.length -1; i++) {
			if (i == value) {
				
			}
			else {
				array[i] = this.value[i];
			}
		}
		this.value = array;
	}
	
	Expression get(int value) {
		if (this.value.length < value) {
			return new Expression();
		}
		else {
			return this.value[value];
		}
	}
	
	void set(int place, Expression value) {
		this.value[place] = value;
	}
	
}
