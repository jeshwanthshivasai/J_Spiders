interface A
{
abstract public void run();
abstract public void walk();
}
class B implements A
{
	public void run(){
		System.out.println("Run for 2kms");
	}
	public void walk(){
		System.out.println("Walk for 5kms");
	}
}
public class perform
{
	public static void main(String[] args){
		B b=new B();
		b.run();
		b.walk();
	}
}
