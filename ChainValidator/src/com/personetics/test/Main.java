package com.personetics.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		List<String> listaCaracteres = new ArrayList<>();
		List<Character> listaFinal = new ArrayList<>();

		String entrada;
		String[] entradaDividida;

		System.out.println("Digite a listagem de caracteres ");
		entrada = sc.next();
		entradaDividida = entrada.split(",");
		List<String> chain = Arrays.asList(entradaDividida);

		sc.close();

		for (String caracter : chain) {
			if (caracter.length() > 1) {
				listaCaracteres.add(caracter);
			}
		}
		System.out.println(listaCaracteres);
		
		String[] saidaDividida =listaCaracteres.toArray(new String [0]);

        for(int i = 0; i < saidaDividida.length; i++) {
        	char[] digits1= saidaDividida[i].toCharArray();
        	 for (char c : digits1) {
				listaFinal.add(c);
			}
        }
        System.out.println(listaFinal);
        
//        for (Character character : listaFinal) {
//			for (String lc : listaCaracteres) {
//				if(character.toString().equals(lc)) {
//					System.out.println(character);
//				}
//			}
//		}
        
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

//		for (int i = 0; i < entrada.length(); i++) {
//
//			char carac = entrada.charAt(i);
//
//			ch.add(carac);
//		}

//		for (int i = 0; i < listaCaracteres.size(); i++) {
//
//		}

//		for (int i = 0; i < entrada.length(); i++) {
//			
//			char carac =entrada.charAt(i);
//		
//
//			ch.add(carac);
//		}
//		System.out.println(ch);
		// System.out.print(caracteres.charAt(i) + ",");

		// System.out.println(chain.getCaracteres());
//		 for (String ch : chain) {
//				System.out.println(ch.substring(1));
//			}

	}

}
