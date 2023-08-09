package br.com.alura.conversor.visual;

import javax.swing.*;

public class ConversorMoedas {
	
	 //Valor de cotação referente ao dia 08/08/2023
	static double dolar = 4.90;
	static double euro = 5.37;
	static double libEst = 6.24;
	static double pesoArg = 0.017;
	static double pesoChi = 0.0057;
		

	public static void reaisParaDolar(double input) {
		Double output;
		output = input / dolar;
		JOptionPane.showMessageDialog(null, "O valor convertido é " + output.toString());
	}
	
	public static void reaisParaEuro(double input) {
		Double output;
		output = input / euro;
		JOptionPane.showMessageDialog(null, "O valor convertido é " + output.toString());
	}
	
	public static void reaisParaLibEst(double input) {
		Double output;
		output = input / libEst;
		JOptionPane.showMessageDialog(null, "O valor convertido é " + output.toString());
	}
	
	public static void reaisParaPesoArg(double input) {
		Double output;
		output = input / pesoArg;
		JOptionPane.showMessageDialog(null, "O valor convertido é " + output.toString());
	}
	
	public static void reaisParaPesoChi(double input) {
		Double output;
		output = input / pesoChi;
		JOptionPane.showMessageDialog(null, "O valor convertido é " + output.toString());
	}
}
