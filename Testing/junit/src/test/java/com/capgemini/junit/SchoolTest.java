package com.capgemini.junit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SchoolTest {

	private School school = null;

	@BeforeEach
	public void createObject() {
		school = new School();
	}

	@Test
	public void testRegisterStudent() {
		Student student = new Student("Dimple", 78.8, "female");
		Student stu = school.registerStudent(student);
		assertEquals(12, stu.getId());
	}

	@Test
	public void testRegisterStudentForNull() {
		assertThrows(NullPointerException.class, () -> school.registerStudent(null));
	}

}
