package def;

public class Test {
	private int elso;
	private String masodik;
	
	public Test(int elso, String masodik) {
		this.elso = elso;
		this.masodik = masodik;
	}
	
	public void setElso(int elso) {
		this.elso = elso;
	}
	
	public String toString() {
		return this.elso + " " + this.masodik;
	}	
	
}
