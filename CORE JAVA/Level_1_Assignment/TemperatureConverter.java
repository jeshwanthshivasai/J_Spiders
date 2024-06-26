public class TemperatureConverter {
    public static void convertToFahrenheit() {
        System.out.println("Converting Temperature to Fahrenheit");
        TemperatureConverter tc = new TemperatureConverter();
        tc.setCelsiusTemperature();
        tc.displayResult();
    }
    public void setCelsiusTemperature() {
        System.out.println("Setting Celsius Temperature");
    }
    public void displayResult() {
        System.out.println("Displaying Result");
    }
    public static void main(String[] args) {
        convertToFahrenheit();
    }
}
