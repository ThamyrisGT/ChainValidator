package com.personetics.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		List<String> listaCaracteres = new ArrayList<>();
		List<String> Resultado = new ArrayList<>();
		List<Character> listaFinal = new ArrayList<>();

		String entrada;
		String[] entradaDividida;

		// Separa os números por , e adiciona numa lista
		System.out.println("Digite uma listagem de caracteres. Ex: 1,2,4,12,24 ");
		entrada = sc.next();
		entradaDividida = entrada.split(",");
		List<String> chain = Arrays.asList(entradaDividida);

		sc.close();

		// Verifica se o número é de 2 ou mais algoritmos
		for (String caracter : chain) {
			if (caracter.length() > 1) {
				listaCaracteres.add(caracter);
			}
		}

		String[] saidaDividida = listaCaracteres.toArray(new String[0]);

		// Separa número de dois algoritmos em dois números
		for (int i = 0; i < saidaDividida.length; i++) {
			char[] digits1 = saidaDividida[i].toCharArray();
			for (char c : digits1) {
				listaFinal.add(c);
			}
		}

		// Verifica quais números estão contidos nas duas listas e não adiciona os que
		// se repetem
		for (Character character : listaFinal) {
			for (String lc : chain) {
				if (lc.contains(character.toString())) {
					if (!Resultado.contains(character.toString())) {
						Resultado.add(character.toString());
					}
				}
			}
		}

		// Adiciona os números de dois algoritmos a lista Resultado
		for (String validar : listaCaracteres) {
			Resultado.add(validar);
		}

		// Confere se o tamanho das listas são iguais
		if (!(Resultado.size() == chain.size())) {
			System.out.println("invalid");
		} else {
			List<String> valid = new ArrayList<>();
			List<String> invalid = new ArrayList<>();
			for (String verifica : Resultado) {
				for (String lc : chain) {
					if (lc.equals(verifica)) {
						if (!valid.contains(verifica)) {
							valid.add(verifica);
						}
					} else {
						if (!invalid.contains(verifica)) {
							invalid.add(verifica);
						}
					}
				}

			}
			if (valid.size() == chain.size()) {
				System.out.println("Valid Chain");
			} else {
				System.out.println("Invalid Chain");
			}
		}

	}

}
