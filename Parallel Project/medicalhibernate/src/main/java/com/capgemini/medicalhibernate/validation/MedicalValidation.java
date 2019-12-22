package com.capgemini.medicalhibernate.validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MedicalValidation {
	Matcher m;
	Pattern p;

	public boolean validateCardNo(String cardno) {
		p = Pattern.compile("\\d{16}");
		m = p.matcher(cardno);
		if (m.matches()) {
			return true;
		} else {
			return false;
		}
	}

	public boolean validateCvvNo(String cvv) {
		p = Pattern.compile("\\d{3}");
		m = p.matcher(cvv);
		if (m.matches()) {
			return true;
		} else {
			return false;
		}
	}

	public boolean validateNo(String input) {
		p = Pattern.compile("\\d+");
		m = p.matcher(input);
		if (m.matches()) {
			return true;
		} else {
			return false;
		}
	}

	public boolean validateUserName(String name) {
		p = Pattern.compile("\\D+\\s\\D+");
		m = p.matcher(name);
		if (m.matches()) {
			return true;
		}
		return false;
	}

	public boolean validateMedicineCategory(String name) {
		p = Pattern.compile("\\D{4,10}");
		m = p.matcher(name);
		if (m.matches()) {
			return true;
		}
		return false;
	}

	public boolean validUserEmail(String email) {
		p = Pattern.compile("\\w+\\@\\w+\\.\\w+");
		m = p.matcher(email);
		if (m.matches()) {
			return true;
		} else {
			return false;
		}
	}

	public boolean validUserPassword(String password) {
		p = Pattern.compile("\\w{4,8}");
		m = p.matcher(password);
		if (m.matches()) {
			return true;
		} else {
			return false;
		}
	}

	public boolean validatePrice(String ch) {
		p = Pattern.compile("\\d+\\.\\d+");
		m = p.matcher(ch);
		if (m.matches()) {
			return true;
		} else {
			return false;
		}
	}
}
