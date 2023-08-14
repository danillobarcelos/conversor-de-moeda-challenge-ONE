package br.com.alura.conversor.visual;

import java.math.BigDecimal;
import java.math.RoundingMode;

import javax.swing.*;

public class ConversorMoedas {
	
	 //Valor de cotação referente ao dia 08/08/2023
	static double dolar = 4.90;
	static double euro = 5.37;
	static double libEst = 6.24;
	static double pesoArg = 0.017;
	static double pesoChi = 0.0057;
		

	public static void reaisParaDolar(double input) {
		double output = input / dolar;
		
		BigDecimal op = new BigDecimal(output);
		BigDecimal outputNovo = op.setScale(2, RoundingMode.FLOOR);
		JOptionPane.showMessageDialog(null, "O valor convertido é " + outputNovo);
	}
	
	public static void reaisParaEuro(double input) {
		double output = input / euro;
		
		BigDecimal op = new BigDecimal(output);
		BigDecimal outputNovo = op.setScale(2, RoundingMode.FLOOR);
		JOptionPane.showMessageDialog(null, "O valor convertido é " + outputNovo);
	}
	
	public static void reaisParaLibEst(double input) {
		double output = input / libEst;

		BigDecimal op = new BigDecimal(output);
		BigDecimal outputNovo = op.setScale(2, RoundingMode.FLOOR);
		JOptionPane.showMessageDialog(null, "O valor convertido é " + outputNovo);
	}
	
	public static void reaisParaPesoArg(double input) {
		double output = input / pesoArg;

		BigDecimal op = new BigDecimal(output);
		BigDecimal outputNovo = op.setScale(2, RoundingMode.FLOOR);
		JOptionPane.showMessageDialog(null, "O valor convertido é " + outputNovo);
	}
	
	public static void reaisParaPesoChi(double input) {
		double output = input / pesoChi;

		BigDecimal op = new BigDecimal(output);
		BigDecimal outputNovo = op.setScale(2, RoundingMode.FLOOR);
		JOptionPane.showMessageDialog(null, "O valor convertido é " + outputNovo);
	}
	
	public static void dolarParaReal(double input) {
		double output = input * dolar; 
		
		BigDecimal op = new BigDecimal(output);
		BigDecimal outputNovo = op.setScale(2, RoundingMode.FLOOR);
		JOptionPane.showMessageDialog(null, "O valor convertido é " + outputNovo);
	}
	
	public static void euroParaReal(double input) {
		double output = input * euro; 
		
		BigDecimal op = new BigDecimal(output);
		BigDecimal outputNovo = op.setScale(2, RoundingMode.FLOOR);
		JOptionPane.showMessageDialog(null, "O valor convertido é " + outputNovo);
	}
	
	public static void libEstParaReal(double input) {
		double output = input * libEst; 
		
		BigDecimal op = new BigDecimal(output);
		BigDecimal outputNovo = op.setScale(2, RoundingMode.FLOOR);
		JOptionPane.showMessageDialog(null, "O valor convertido é " + outputNovo);
	}
	
	public static void pesoArgParaReal(double input) {
		double output = input * pesoArg; 
		
		BigDecimal op = new BigDecimal(output);
		BigDecimal outputNovo = op.setScale(2, RoundingMode.FLOOR);
		JOptionPane.showMessageDialog(null, "O valor convertido é " + outputNovo);
	}
	
	public static void pesoChiParaReal(double input) {
		double output = input * pesoChi; 
		
		BigDecimal op = new BigDecimal(output);
		BigDecimal outputNovo = op.setScale(2, RoundingMode.FLOOR);
		JOptionPane.showMessageDialog(null, "O valor convertido é " + outputNovo);
	}
	
	
}
