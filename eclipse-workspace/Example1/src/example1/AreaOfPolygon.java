package example1;

public class AreaOfPolygon {
	public static void main(String[] args) {
		int ns= 7;
		double side=6;
		double area;
		area = (ns * (side * side)) / (4.0 * Math.tan((Math.PI / ns)));
		System.out.println("The area is " + area);
		
		
		}
}
