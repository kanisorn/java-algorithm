
public class RationalNumber {

	private int num;
	private int det;
	
	public RationalNumber(int num, int det) {
		this.num = num;
		this.det = det;
	}
	
	// display Ration number in format "a/b"
	@Override
	public String toString() {
		return this.num + "/" + this.det;
	}
	
	// compare 2 Rational number
	public int compareTo(Object o) {
		if (!(o instanceof RationalNumber) || o == null) {
			throw new IllegalArgumentException("cannot compare this object...");
		}
		
		RationalNumber another = (RationalNumber)o;
		int myNum = this.num * another.det;
		int otherNum = another.num * this.det;
		
		if (myNum == otherNum) 
			return 0;
		else if (myNum < otherNum)
			return -1;
		else
			return 1;
	}
	
	// equals
	@Override
	public boolean equals(Object o) {
		return compareTo(o) == 0?true:false;
	}
	
	// sum 2 Rational numbers
	public RationalNumber sum(RationalNumber another) {
		int newNum = (this.num * another.det) + (this.det * another.num);
		int newDet = this.det * another.det;
		
		return new RationalNumber(newNum, newDet);
	}
	
	// multiply 2 Rational numbers
	public RationalNumber multiply(RationalNumber another) {
		int newNum = this.num * another.num;
		int newDet = this.det * another.det;
		
		return new RationalNumber(newNum, newDet);
	}
	
	public static void main(String [] args) {
		RationalNumber r1 = new RationalNumber(1, 2);
		RationalNumber r2 = new RationalNumber(2, 4);	
		
		System.out.println(r1.compareTo(r2));
		System.out.println(r1.equals(r2));	
		System.out.println(r1);
		System.out.println(r1.sum(r2));
		System.out.println(r1.multiply(r2));
		
		RationalNumber r3 = new RationalNumber(3, 4);
		System.out.println(r1.compareTo(r3));
		System.out.println(r1.equals(r3));	
		System.out.println(r1.sum(r3));
		System.out.println(r1.multiply(r3));
	}
}
