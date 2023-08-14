package br.com.alura.conversor.visual;

public class VerificadorInput {

	public boolean verificadorNumerico(String valor) {

		try {
			double input = Double.parseDouble(valor);
			if (input > 0 || input <= 0)
				return true;

		} catch (NumberFormatException e) {
			return false;
		}
		return false;
	}

	
}

