package com.custom.ann;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class PasswordValidator {
	public static List<String> validate(Object obj) {
		List<String> errors = new ArrayList<String>();
		Field[] fields = obj.getClass().getDeclaredFields();
		for (int i = 0; i < fields.length; i++) {
			PwdValidator annotations = (PwdValidator) fields[i].getAnnotation(PwdValidator.class);
			if (annotations != null) {
				try {
					// check null
					if (fields[i].get(obj) == null) {
						errors.add(((PwdValidator) annotations).message());
					}
					// check length of PWD
					if (fields[i].get(obj).toString().length() <= 5) {
						errors.add(((PwdValidator) annotations).message());
					}
					// add more if u have more condition to check
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		return errors;

	}
}
