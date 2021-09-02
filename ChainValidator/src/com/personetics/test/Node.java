package com.personetics.test;

import java.util.List;

public interface Node {
	String CARACTERES = null;

	String getMessageInvalid();

	String getMessageValid();

	boolean validate(List<Node> nodes);

}
