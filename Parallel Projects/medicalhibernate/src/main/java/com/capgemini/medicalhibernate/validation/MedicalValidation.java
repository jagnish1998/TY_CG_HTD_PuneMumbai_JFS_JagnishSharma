package com.capgemini.medicalhibernate.validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MedicalValidation {
		Matcher m;
		Pattern p;

		public boolean validateCardNo(String userid) {
			p = Pattern.compile("\\d{1,16}");
			m = p.matcher(userid);
			if (m.matches()) {
				return true;
			} else {
				return false;
			}
		}

		public boolean validateUserName(String name) {
			p = Pattern.compile("\\w+\\s\\w+");
			m = p.matcher(name);
			if(m.matches()) 
			{
				return true;
			}
			return false;
		}
		
		public boolean validateMedicineName(String name) {
			p = Pattern.compile("\\w+");
			m = p.matcher(name);
			if(m.matches()) 
			{
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
			p = Pattern.compile("\\w+");
			m = p.matcher(password);
			if (m.matches()) {
				return true;
			} else {
				return false;
			}
		}
	}

