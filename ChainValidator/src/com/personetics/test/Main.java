package com.personetics.test;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ChainValidator chainValidator = new ChainValidator();
		Scanner sc = new Scanner(System.in);

		String entry;
		String[] splitEntry;

		System.out.println("Digite uma listagem de caracteres separado por ',' Ex: 12,1,2 ou ab,a,b ");
		entry= sc.next().toLowerCase();
		splitEntry = entry.split(",");
		List<String> chain = Arrays.asList(splitEntry);
		sc.close();

		chainValidator.checkAndSeparateDigits(chain);

	}

}
