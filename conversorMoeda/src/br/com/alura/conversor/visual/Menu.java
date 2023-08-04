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
				// método conversor de moedas
				JOptionPane.showMessageDialog(null, "Você escolheu o Conversor de Moedas");
				ConversorMoedas.conversorMoedas();
				break;
			} else if (selectedInputInicial.equals("Conversor de Temperatura")) {
				// método conversor de temperatura
				JOptionPane.showMessageDialog(null, "Você escolher o Conversor de Temperaturas");
				break;
			} else {
				break;
			}

		}
	}
}
