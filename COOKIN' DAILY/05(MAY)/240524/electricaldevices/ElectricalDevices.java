class ElectricalDevices {
	public String name;
	public int price;
	public String color;
	public int battery;
	public String mfgdate;
	public int warranty;

	public ElectricalDevices(String name, int price, String color, int battery, String mfgdate, int warranty) {
		this.name = name;
		this.price = price;
		this.color = color;
		this.battery = battery;
		this.mfgdate = mfgdate;
		this.warranty = warranty;
	}
	public void display() {
		System.out.println("Name: " + name);
		System.out.println("Price: " + price);
		System.out.println("Color: " + color);
		System.out.println("Battery: " + battery);
		System.out.println("Manufacture Date: " + mfgdate);
		System.out.println("Warranty: " + warranty);
	}
}