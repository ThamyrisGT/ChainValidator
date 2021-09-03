package com.personetics.test;

import java.util.ArrayList;
import java.util.List;

public class ChainValidator implements Node {

	@Override
	public void getMessageInvalid() {
		System.out.println("Not Valid Chain");
	}

	@Override
	public void getMessageValid() {
		System.out.println("Valid Chain");
	}

	@Override
	public void checkAndSeparateDigits(List<String> chain) {
		List<String> listSplitDigit = new ArrayList<>();
		List<Character> listSeparateDigits = new ArrayList<>();
		List<String> joinLists = new ArrayList<>();

		for (String s : chain) {
			if (s.length() > 1) {
				listSplitDigit.add(s);
			}
		}

		String[] outSplit = listSplitDigit.toArray(new String[0]);

		for (int i = 0; i < outSplit.length; i++) {
			char[] digits = outSplit[i].toCharArray();
			for (char c : digits) {
				listSeparateDigits.add(c);
			}
		}

		for (Character c : listSeparateDigits) {
			for (String s : chain) {
				if (s.contains(c.toString())) {
					if (!joinLists.contains(c.toString())) {
						joinLists.add(c.toString());
					}
				}
			}
		}
		for (String s : listSplitDigit) {
			joinLists.add(s);
		}

		this.isValidate(joinLists, chain);
	}

	@Override
	public boolean isValidate(List<String> joinLists, List<String> chain) {
		List<String> valid = new ArrayList<>();
		List<String> invalid = new ArrayList<>();

		if (!(joinLists.size() == chain.size())) {
			this.getMessageInvalid();
		} else {
			for (String s : joinLists) {
				for (String st : chain) {
					if (st.equals(s)) {
						if (!valid.contains(s)) {
							valid.add(s);
						}
					} else {
						if (!invalid.contains(s)) {
							invalid.add(s);
						}
					}
				}
			}
			if (valid.size() == chain.size()) {
				this.getMessageValid();
			} else {
				this.getMessageInvalid();
			}
		}
		return true;
	}

}
