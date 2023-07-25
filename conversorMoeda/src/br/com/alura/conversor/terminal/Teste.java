package br.com.alura.conversor.terminal;

import java.util.Scanner;

public class Teste {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int inputTipo = 0;

		while (inputTipo != 3) {
			new Conversor();

			System.out.println();
			System.out.print("Digite sua opção: ");
			inputTipo = sc.nextInt();

			switch (inputTipo) {
			case 1:
				System.out.println("Você escolheu o conversor de moedas!");
				Conversor.conversorMoedas(sc);
				break;
			case 2:
				System.out.println("Você escolheu o conversor de temperaturas!");
				Conversor.conversorTemp(sc);
				break;
			case 3:
				System.out.println("Você escolheu a opção sair. Até a próxima!");
				break;
			default:
				System.out.println("Escolha uma opção válida!");
				break;
			}
		}

		sc.close();
	}
}
