package br.com.alura.conversor.visual;

import java.math.BigDecimal;
import java.math.RoundingMode;

import javax.swing.JOptionPane;

public class ConversorTemperatura {

	public static void celsiusToKevin(double input) {
		double output = input + 273.15;
		
		BigDecimal op = new BigDecimal(output);
		BigDecimal outputNovo = op.setScale(2, RoundingMode.FLOOR);
		JOptionPane.showMessageDialog(null, "O valor convertido é " + outputNovo);
	}
	
	public static void celsiusToFahrenheit(double input) {
		double output = ((input * 9)/5) + 32;
		
		BigDecimal op = new BigDecimal(output);
		BigDecimal outputNovo = op.setScale(2, RoundingMode.FLOOR);
		JOptionPane.showMessageDialog(null, "O valor convertido é " + outputNovo);
	}
	
	public static void kelvinToCelsius(double input) {
		double output = input - 273.15;
		
		BigDecimal op = new BigDecimal(output);
		BigDecimal outputNovo = op.setScale(2, RoundingMode.FLOOR);
		JOptionPane.showMessageDialog(null, "O valor convertido é " + outputNovo);
	}
	
	public static void kelvinToFahrenheit(double input) {
		double output = ((input - 273.15) * 9/5) + 32;
		
		BigDecimal op = new BigDecimal(output);
		BigDecimal outputNovo = op.setScale(2, RoundingMode.FLOOR);
		JOptionPane.showMessageDialog(null, "O valor convertido é " + outputNovo);
	}
	
	public static void fahrenheitToCelsius(double input) {
		double output = (input - 32) * 5/9;
		
		BigDecimal op = new BigDecimal(output);
		BigDecimal outputNovo = op.setScale(2, RoundingMode.FLOOR);
		JOptionPane.showMessageDialog(null, "O valor convertido é " + outputNovo);
	}
	
	public static void fahrenheitToKelvin(double input) {
		double output = 273.15 + ((input - 32) * 5/9);
		
		BigDecimal op = new BigDecimal(output);
		BigDecimal outputNovo = op.setScale(2, RoundingMode.FLOOR);
		JOptionPane.showMessageDialog(null, "O valor convertido é " + outputNovo);
	}
	
	
}
