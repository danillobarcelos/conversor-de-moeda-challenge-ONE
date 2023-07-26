package br.com.alura.conversor.terminal;

import java.util.Scanner;

public class Conversor {

	public Conversor() {
		System.out.println("Seja bem vindo(a) ao Conversor!");
		System.out.println("Para inicializar, selecione uma das opções abaixo:");
		System.out.println("Digite 1 para o conversor de moedas");
		System.out.println("Digite 2 para o conversor de temperaturas");
		System.out.println("Digite 3 para sair");
		System.out.println("Atente-se de selecionar uma opção válida!");
		System.out.println("---------------------------------------------------");
	}
	
	
	public static void conversorMoedas(Scanner sc) {
		System.out.println("Escolha entre as opções abaixo:");
		System.out.println("1 --> Real para Dólar");
		System.out.println("2 --> Real para Euro");
		System.out.println("3 --> Real para Libra Esterlina");
		System.out.println("4 --> Real para Peso Argentino");
		System.out.println("5 --> Real para Peso Chileno");
		System.out.println("6 --> Sair");
		
		int opcao = 0;
		double input;
		double output;
		
		while(opcao != 6) {
			System.out.print("Digite a sua opção: ");
			opcao = sc.nextInt();
			// cotação das moedas feitas no dia 25/07/2023
			switch(opcao) {
			case 1:
				System.out.println("Você escolheu 'Real --> Dólar'");
				System.out.println("Quantos reais você deseja converter em dólar?");
				input = sc.nextDouble();
				output = input / 4.75;
				System.out.println("R$" + input + " são " + output + " dólares");
				break;
			case 2:
				System.out.println("Você escolheu 'Real --> Euro'");
				System.out.println("Quantos reais você deseja converter em euro?");
				input = sc.nextDouble();
				output = input / 5.23;
				System.out.println("R$" + input + " são " + output + " euros");
				break;
			case 3:
				System.out.println("Você escolheu 'Real --> Libra Esterlina'");
				System.out.println("Quantos reais você deseja converter em libras esterlinas?");
				input = sc.nextDouble();
				output = input / 6.08;
				System.out.println("R$" + input + " são " + output + " libras esterlinas");
				break;
			case 4: 
				System.out.println("Você escolheu 'Real --> Peso Argentino'");
				System.out.println("Quantos reais você deseja converter em pesos argentinos?");
				input = sc.nextDouble();
				output = input * 57.29;
				System.out.println("R$" + input + " são " + output + " pesos argentinos");
				break;
			case 5:
				System.out.println("Você escolheu 'Real --> Peso Chileno'");
				System.out.println("Quantos reais você deseja converter em pesos chilenos?");
				input = sc.nextDouble();
				output = input * 174.74;
				System.out.println("R$" + input + " são " + output + " pesos chilenos");
				break;
			case 6:
				break;
			default:
				System.out.println("Digite uma opção válida!");
				break;
			}
		}
	}
	
	public static void conversorTemp(Scanner sc) {
		System.out.println("Escolha entre as opções abaixo:");
		System.out.println("1 --> Celsius para Kelvin");
		System.out.println("2 --> Celsius para Fahrenheit");
		
		int opcao = 0;
		double input;
		double output;
		
		while(opcao != 6) {
			
			System.out.print("Digite a sua opção: ");
			opcao = sc.nextInt();
			
			switch(opcao) {
			case 1:
				System.out.println("Você escolheu 'Celsius --> Kelvin'");
				System.out.println("Quantos °C você deseja converter para °K?");
				input = sc.nextDouble();
				output = input + 273.15;
				System.out.println(input + "°C são " + output + "°K");
				break;
			case 2:
				System.out.println("Você escolheu 'Celsius --> Fahrenheit'");
				System.out.println("Quantos °C você deseja converter para °F?");
				input = sc.nextDouble();
				output = ((input * 9)/5) + 32;
				System.out.println(input + "°C são " + output + "°F");
				break;
			case 6:
				break;
			default: 
				System.out.println("Digite uma opção válida!");
				break;
			}
		}
		
		
		
	}
}
