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
				JOptionPane.showMessageDialog(null, "Você escolheu o Conversor de Moedas");
				
				Object[] opcoesEntrada = 
					{"Real para Dólar", 
					"Real para Euro", 
					"Real para Libra Esterlina", 
					"Real para Peso Argentino",
					"Real para Peso Chileno",
					"Sair"};
				String selectedopcoesEntrada = (String) JOptionPane.showInputDialog(
						null, 
						"Selecione a conversão desejada",
						"Conversor de Moedas",
						JOptionPane.INFORMATION_MESSAGE,
						null,
						opcoesEntrada,
						opcoesEntrada[0]);
				
				String valor = JOptionPane.showInputDialog("Insira um valor de entrada");
				Double input = Double.parseDouble(valor);
				Double output;
				
				while (selectedopcoesEntrada != null) {
					if(opcoesEntrada.toString() == "Real para Dólar") {
						ConversorMoedas.reaisParaDolar(input);
//						JOptionPane.showMessageDialog(null, "O valor convertido é " + output.toString());
						break;
					} else if (opcoesEntrada.toString() == "Real para Euro") {
						ConversorMoedas.reaisParaEuro(input);
//						JOptionPane.showMessageDialog(null, "O valor convertido é " + output.toString());
						break;
					} else if (opcoesEntrada.toString() == "Real para Libra Esterlina") {
						ConversorMoedas.reaisParaLibEst(input);
//						JOptionPane.showMessageDialog(null, "O valor convertido é " + output.toString());
						break;
					} else if (opcoesEntrada.toString() == "Real para Peso Argentino") {
						ConversorMoedas.reaisParaPesoArg(input);
//						JOptionPane.showMessageDialog(null, "O valor convertido é " + output.toString());
						break;
					} else if (opcoesEntrada.toString() == "Real para Peso Chileno") {
						ConversorMoedas.reaisParaPesoChi(input);
//						JOptionPane.showMessageDialog(null, "O valor convertido é " + output.toString());
						break;
					} else {
						break;
					}
					
				}
			} else if (selectedInputInicial.equals("Conversor de Temperatura")) {
				// método conversor de temperatura
				JOptionPane.showMessageDialog(null, "Você escolheu o Conversor de Temperaturas");
				break;
			} else {
				break;
			}

		}
	}
}
