class Circle
{
	public static double pi = 3.14;
	public int radius;
	public Circle(int radius)
	{
		this.radius = radius;
	}
	public void area()
	{
		double area = pi*radius*radius;
		System.out.println(area);
	}
	public static void main(String[] args)
	{
        Circle c1 = new Circle(10);
		c1.area();
		Circle c2 = new Circle(3);
		c2.area();
	}
}