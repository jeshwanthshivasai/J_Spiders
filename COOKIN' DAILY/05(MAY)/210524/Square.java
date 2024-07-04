class Square {
	public int length;
	public int breadth;
	public int height;
	public Square(int length, int breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}
	public Square(int length, int breadth, int height)
	{
		this.length=length;
		this.breadth=breadth;
		this.height=height;
	}
	public void areaof2dsquare()
	{
		int area = length*breadth;
		System.out.println(area);
	}
	public void areaof3dsquare()
	{
		int area = length*breadth*height;
			System.out.println(area);
	}
	public static void main(String[] args)
	{
		Square s1 = new Square(10, 20);
		s1.areaof2dsquare();
		Square s2 = new Square(10, 20, 30);
		s2.areaof3dsquare();
	}
}