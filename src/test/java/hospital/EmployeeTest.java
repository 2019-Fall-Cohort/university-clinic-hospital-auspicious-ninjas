package hospital;

import static org.junit.Assert.assertEquals;

import java.util.Random;

import org.junit.Test;

import hospital.Employee;

public class EmployeeTest {

	@Test
	public void canCreateEmployee() {
		Employee underTest = new Doctor("Diablo", "Ankles");
		String nameOfEmployee = underTest.getEmployeeName();
		assertEquals(nameOfEmployee, "Diablo");
	}
	
}
