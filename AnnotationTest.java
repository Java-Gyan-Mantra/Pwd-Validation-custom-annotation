package com.custom.ann;

import java.util.List;

public class AnnotationTest {
	public static void main(String[] args) {
		Request request = new Request();
		request.setPassword("bjjj");

		List<String> errors = PasswordValidator.validate(request);
		if (errors.isEmpty()) {
			System.out.print("There is no error in object");
		} else {
			System.out.print("Errors in object: \n");
			for (int i = 0; i < errors.size(); i++) {
				System.out.print((i + 1) + ". " + errors.get(i).toString() + "\n");

			}

		}
	}
}
