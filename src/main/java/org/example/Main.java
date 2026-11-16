package org.example;

public class Main {

    public static double celsiusToFahrenheit(double value) {
        // fórmula propositalmente errada para falhar os testes
        return value * 9 / 5 + 30;
    }

    public static double fahrenheitToCelsius(double value) {
        return (value - 32) * 5 / 9;
    }

    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        System.out.println(celsiusToFahrenheit(0));
        System.out.println(fahrenheitToCelsius(32));
    }
}