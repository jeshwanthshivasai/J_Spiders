abstract class Sample 
{
	abstract public void run();

	public void walk(){
		System.out.println("walk for 10kms");
	}
}
	class Demo extends Sample
	{
		public void run(){
			System.out.println("Run for 5 kms");
		}
	}
	public class Execute
	{
	public static void main(String[] args) 
	{
		Sample d1=new Demo();
		d1.run();
		d1.walk();
		Demo d2=(Demo) d1;
		d2.run();
		d2.walk();
	}
}
