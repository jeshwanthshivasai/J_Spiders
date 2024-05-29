public class Execute
{
	public static void main(String[] args){
		display(new Lion());
			display(new Tiger());
	}
		public static void display(Animal a){
			a.noise();
			a.eat();
			}
			
}