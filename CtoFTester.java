// the functuions should have one parameter
// temp which should be double type
// The function should return a double, the temperature

public class CtoFTester{
    public static void main(String[] args){
        System.out.println(celsiusToFahrenheit(30));
    }

    public static double celsiusToFahrenheit(double temp) {
        return 1.8 * temp + 32;
    }
}
