package Hospital;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NurseTest {

	@Test
	public void canCreateNurse() {
		Nurse underTest = new Nurse("Fig Newton", 500);
		String expectedName = underTest.getEmployeeName();
		int expectedNumberOfPatients = underTest.getNumberOfPatients();
		int expectedSalary = underTest.getSalary();
		assertEquals(expectedName, "Fig Newton");
		assertEquals(expectedNumberOfPatients, 500);
		assertEquals(expectedSalary, 50_000);
	}
}