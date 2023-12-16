import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Temperature Converter");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.print("Enter your choice (1/2): ");
        
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.print("Enter temperature in Celsius: ");
            double celsius = scanner.nextDouble();
            double fahrenheit = convertCelsiusToFahrenheit(celsius);
            System.out.println(celsius + " Celsius is equal to " + fahrenheit + " Fahrenheit.");
        } else if (choice == 2) {
            System.out.print("Enter temperature in Fahrenheit: ");
            double fahrenheit = scanner.nextDouble();
            double celsius = convertFahrenheitToCelsius(fahrenheit);
            System.out.println(fahrenheit + " Fahrenheit is equal to" + celsius + " Celsius.");
        } else {
            System.out.println("Invalid choice. Please choose either 1 or 2.");
        }
        
        scanner.close();
    }

    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}