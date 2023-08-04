package br.com.alura.conversor.visual;

import javax.swing.*;

public class ConversorMoedas {

	public static String conversorMoedas() {
			
		Object[] opcoesEntrada = 
			{"Real para Dólar", 
			"Real para Euro", 
			"Real para Libra Esterlina", 
			"Real para Peso Argentino",
			"Real para Peso Chileno",
			"Sair"};
		
//		String valor = JOptionPane.showInputDialog("Insira um valor de entrada");
		String valor = JOptionPane.showInputDialog("Insira um valor de entrada");
		// PRECISA VERIFICAR O VALOR DE ENTRADA
		while(valor == "0") {
			JOptionPane.showInputDialog("Tente novamente", valor);
		}
		
		
		String selectedopcoesEntrada = (String) JOptionPane.showInputDialog(
				null, 
				"Selecione a conversão desejada",
				"Conversor de Moedas",
				JOptionPane.INFORMATION_MESSAGE,
				null,
				opcoesEntrada,
				opcoesEntrada[0]);

		while (selectedopcoesEntrada != null) {
			
		}
		return selectedopcoesEntrada;
		
	}
}
