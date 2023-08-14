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
					case "Sair":
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
