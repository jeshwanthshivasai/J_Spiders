package JAVA_PRACTICE_W3.Basic_Part_1;

public class Area_of_Polygon {
	public static void main(String[] args) {
		int sides = 7;
		int length_of_side = 6;
		double area = ((length_of_side*sides^2) / (4.0 * Math.tan(Math.PI/length_of_side)));
		System.out.println(area);
	}
}
