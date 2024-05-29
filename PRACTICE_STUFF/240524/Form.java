//class declaration
public class Form {
    //non-static members
    public String name;
    public String location;
    public double tenthpercent;
    public double interpercent;
    public double btechpercent;
    public double mtechpercent;

    public Form(String name, String location, double tenthpercent) {
        this.name = name;
        this.location = location;
        this.tenthpercent = tenthpercent;
    }
    public Form(String name, String location, double tenthpercent, double interpercent) {
        this(name, location, tenthpercent);
        this.interpercent = interpercent;
    }
    public Form(String name, String location, double tenthpercent, double interpercent, double btechpercent) {
        this(name, location, tenthpercent, interpercent);
        this.btechpercent = btechpercent;
    }
    public Form(String name, String location, double tenthpercent, double interpercent, double btechpercent, double mtechpercent) {
        this(name, location, tenthpercent, interpercent, btechpercent);
        this.mtechpercent = mtechpercent;
    }
    public void DisplayDetails() {
        System.out.println(name);
		System.out.println(location);
		System.out.println(tenthpercent);
		System.out.println(interpercent);
		System.out.println(btechpercent);
		System.out.println(mtechpercent);
    }
    public static void main(String[] args) {
        Form form = new Form("jess", "hyd", 10.0, 9.0, 8.0, 7.0);
        form.DisplayDetails();
    }
}