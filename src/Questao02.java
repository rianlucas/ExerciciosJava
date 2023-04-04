import java.util.Scanner;

public class Questao02 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Selecione sua escala de temperatura de acordo com o numero: ");
    System.out.println("1 - Celsius");
    System.out.println("2 - Fahrenheit");
    System.out.println("3 - Kelvin");
    int escalaTemperatura = input.nextInt();

    System.out.println("Digite o valor da temperatura que deseja converter: ");
    double temperatura = input.nextDouble();

    if(escalaTemperatura == 1 ) {
      System.out.println("Celsius para Fahrenheit");

      double celsiusToFahrenheit = temperatura * 1.8 + 32;
      System.out.println(celsiusToFahrenheit);

      System.out.println("Celsius para Kelvin");
      double celsiusToKelvin = temperatura + 273.15;
      System.out.println(celsiusToKelvin);
    }

  if(escalaTemperatura == 2) {
    System.out.println("Fahrenheit para Celsius");
    double fahrenheitToCelsius = (temperatura - 32) / 1.8;
    System.out.println(fahrenheitToCelsius);

    System.out.println("Fahrenheir para Kelvin");
    double fahrenheitToKelvin = (temperatura + 458.67) * 5/9;
    System.out.println(fahrenheitToKelvin);
  }

    if(escalaTemperatura == 3) {
      System.out.println("Kelvin para Celsius");
      double kelvinToCelsius = temperatura - 273.15;
      System.out.println(kelvinToCelsius);

      System.out.println("Kelvin para Fahrenheit");
      double kelvinToFahrenheit = 1.8 * (temperatura - 273) + 32;
      System.out.println(kelvinToFahrenheit);
    }



  }
}

