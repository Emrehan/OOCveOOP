package oop04c;

public class A implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private String memberS;
	private B memberB;
	
	public A(String memberS, B memberB) {
		this.memberS = memberS;
		this.memberB = memberB;
	}
	
	public String getMemberS() {
		return memberS;
	}
	public B getMemberB() {
		return memberB;
	}
	public String toString( ) {
		return "A: \t" + memberS + "\t" + memberB;
	}

}
