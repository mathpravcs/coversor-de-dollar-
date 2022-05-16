package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Converter;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the price only dollar : ");
		Converter.price = sc.nextDouble();
		System.out.println("Enter with value for conversion: ");
		Converter.value = sc.nextDouble();

		double calc = (Converter.price * Converter.value * Converter.CONVERTER);
		double currency = (Converter.price * Converter.value) + calc;

		System.out.printf("Conversion value in reais R$ %.2f%n ", currency);

		sc.close();
	}

}
