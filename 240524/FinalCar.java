class FinalCar {
	public static void main(String[] args) {
		Car c = (Car) new AnotherCar();
		c.carColor();
		AnotherCar c1 = (AnotherCar)c;
		c1.carColor();
	}
}
