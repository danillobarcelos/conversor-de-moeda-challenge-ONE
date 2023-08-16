package br.com.alura.conversor.visual;

import javax.swing.*;

public class Menu {

	public static void main(String[] args) {

		Object[] inputInicial = { "Conversor de Moedas", "Conversor de Temperaturas", "Sair" };

		String selectedInputInicial = (String) JOptionPane.showInputDialog(
				null, 
				"Selecione uma opção para continuar",
				"Conversor", 
				JOptionPane.INFORMATION_MESSAGE, 
				null, 
				inputInicial, 
				inputInicial[0]);

		while (selectedInputInicial != null) {
			if (selectedInputInicial.equals("Conversor de Moedas")) {
				
				Object[] opcoesEntrada = 
					{"Real para Dólar", 
					"Real para Euro", 
					"Real para Libra Esterlina", 
					"Real para Peso Argentino",
					"Real para Peso Chileno",
					"Dólar para Real",
					"Euro para Real",
					"Libra Esterlina para Real",
					"Peso Argentino para Real",
					"Peso Chileno para Real",
					"Sair"};
				String selectedopcoesEntrada = (String) JOptionPane.showInputDialog(
						null, 
						"Selecione a conversão desejada",
						"Conversor de Moedas",
						JOptionPane.INFORMATION_MESSAGE,
						null,
						opcoesEntrada,
						opcoesEntrada[0]);
				
				if (selectedopcoesEntrada.equals("Sair")){
					selectedInputInicial = null;
					break;
				} 
				
				String valor = JOptionPane.showInputDialog("Insira um valor de entrada");
				
				
				VerificadorInput verifica = new VerificadorInput();
				
				if(verifica.verificadorNumerico(valor)) {
					Double input = Double.parseDouble(valor);
					
					switch(selectedopcoesEntrada) {
					
					case "Real para Dólar":
						ConversorMoedas.reaisParaDolar(input);
						break;
					case "Real para Euro":
						ConversorMoedas.reaisParaEuro(input);
						break;
					case "Real para Libra Esterlina":
						ConversorMoedas.reaisParaLibEst(input);
						break;
					case "Real para Peso Argentino":
						ConversorMoedas.reaisParaPesoArg(input);
						break;
					case "Real para Peso Chileno":
						ConversorMoedas.reaisParaPesoChi(input);	
						break;
					case "Dólar para Real":
						ConversorMoedas.dolarParaReal(input);
						break;
					case "Euro para Real":
						ConversorMoedas.euroParaReal(input);
						break;
					case "Libra Esterlina para Real":
						ConversorMoedas.libEstParaReal(input);
						break;
					case "Peso Argentino para Real":
						ConversorMoedas.pesoArgParaReal(input);
						break;
					case "Peso Chileno para Real":
						ConversorMoedas.pesoChiParaReal(input);
						break;
					} 
				} else {
					JOptionPane.showMessageDialog(null, "Insira um valor válido!");
				}
					
				int continua = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
				if(JOptionPane.OK_OPTION == continua) {
				
				} else if (JOptionPane.NO_OPTION == continua){
					JOptionPane.showMessageDialog(null, "Programa finalizado! Até breve.");
					break;
				} else {
					JOptionPane.showMessageDialog(null, "Programa concluído");
					break;
				}
				
			} else if (selectedInputInicial.equals("Conversor de Temperaturas")) {
				
				Object[] opcoesEntrada = 
					{"Celsius para Kelvin", 
					"Celsius para Fahrenheit", 
					"Kelvin para Celsius", 
					"Kelvin para Fahrenheit",
					"Fahrenheit para Celsius",
					"Fahrenheit para Kelvin",
					"Sair"};
				String selectedopcoesEntrada = (String) JOptionPane.showInputDialog(
						null, 
						"Selecione a conversão desejada",
						"Conversor de Temperatura",
						JOptionPane.INFORMATION_MESSAGE,
						null,
						opcoesEntrada,
						opcoesEntrada[0]);
				
				if (selectedopcoesEntrada.equals("Sair")){
					selectedInputInicial = null;
					break;
				} 
				
				String valor = JOptionPane.showInputDialog("Insira um valor de entrada");
				VerificadorInput verifica = new VerificadorInput();
			
				if(verifica.verificadorNumerico(valor)) {
					Double input = Double.parseDouble(valor);
					
					switch(selectedopcoesEntrada) {
					case "Celsius para Kelvin":
						ConversorTemperatura.celsiusToKevin(input);
						break;
					case "Celsius para Fahrenheit":
						ConversorTemperatura.celsiusToFahrenheit(input);
						break;
					case "Kelvin para Celsius":
						ConversorTemperatura.kelvinToCelsius(input);
						break;
					case "Kelvin para Fahrenheit":
						ConversorTemperatura.kelvinToFahrenheit(input);
						break;
					case "Fahrenheit para Celsius":
						ConversorTemperatura.fahrenheitToCelsius(input);
						break;
					case "Fahrenheit para Kelvin":
						ConversorTemperatura.fahrenheitToKelvin(input);
						break;
					}						
				} else {
					JOptionPane.showMessageDialog(null, "Insira um valor válido!");
				}
					
				int continua = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
				if(JOptionPane.OK_OPTION == continua) {
				
				} else if (JOptionPane.NO_OPTION == continua){
					JOptionPane.showMessageDialog(null, "Programa finalizado! Até breve.");
					break;
				} else {
					JOptionPane.showMessageDialog(null, "Programa concluído");
					break;
				}
				
			} else {
				break;
			}

		}
	}
}