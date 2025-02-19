package griffithTest;

import griffith.Grades;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradesTest {
	@Test
	public void testGradesMax() {
		Grades grade = new Grades();
        int[] grades = {45, 78, 90, 32, 88};
        assertEquals(90, grade.gradesMax(grades));

        int[] negativeGrades = {-10, -5, -20, -3};
        assertEquals(-3, grade.gradesMax(negativeGrades));

        int[] singleElement = {50};
        assertEquals(50, grade.gradesMax(singleElement));
    }

	@Test
	public void testGradesTotal() {
		Grades grade = new Grades();
        int[] grades = {10, 20, 30, 40};
        assertEquals(100, grade.gradesTotal(grades));

        int[] emptyArray = {};
        assertEquals(0, grade.gradesTotal(emptyArray));
    }    

	@Test
	public void testGradesAverage() {
		Grades grade = new Grades();
        int[] grades = {50, 60, 70, 80};
        assertEquals(65.0, grade.gradesAverage(grades), 0.01);
    }

	@Test
	public void testCountFails() {
		Grades grade = new Grades();
        int[] grades = {10, 20, 50, 70};
        assertEquals(2, grade.countFails(grades, 40));
    }
	
	@Test
	void test() {
		fail("Not yet implemented");
	}

}
