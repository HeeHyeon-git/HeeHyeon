package test;
class Line{
	public int length;
	public boolean isLine;
	
	public Line() {}
	public Line(int length) {
		this.length = length;
	}
	public boolean isSameLine(Line l) {
		return this.length==l.length; 	
	}
}
public class LineTest {

	public static void main(String[] args) {
	Line l1 = new Line(10);
	Line l2 = new Line(10);	
	Line l3 = new Line(20);
	System.out.println(l1.isSameLine(l2));
	System.out.println(l1==l2);
	
	}

}
