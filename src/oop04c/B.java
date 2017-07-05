package oop04c;

public class B implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private char memberC;
	private Integer memberI;
	
	public B(char memberC, Integer memberI) {
		this.memberC = memberC;
		this.memberI = memberI;
	}
	
	public char getMemberC() {
		return memberC;
	}
	public Integer getMemberI() {
		return memberI;
	}
	public String toString( ) {
		return "B: \t" + memberC + "\t" + memberI; 
	}

}
