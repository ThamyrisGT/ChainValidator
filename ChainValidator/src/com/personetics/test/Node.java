package com.personetics.test;

import java.util.List;

public interface Node {

	void getMessageInvalid();

	void getMessageValid();

	void checkAndSeparateDigits(List<String> chain);

	boolean isValidate(List<String> resultado, List<String> chain);

}
