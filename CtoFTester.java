// the functions should have one parameter
// temp which should be double type
// The function should return a double, the new temperature

public class CtoFTester{
    public static void main(String[] args){
    }

    public static double celsiusToFahrenheit(double temp) {
        return 1.8 * temp + 32;
    }

    public static double fahrenheitToCelsius(double temp) {
        return (temp - 32) / 1.8;
    }
}
