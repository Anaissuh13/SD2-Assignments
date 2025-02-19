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
		// Creating an instance of Grades
		Grades grade = new Grades();
        
        // Testing with an array of positive numbers
        int[] grades = {45, 78, 90, 32, 88};
        assertEquals(90, grade.gradesMax(grades)); // Expecting the maximum value 90

        // Testing with negative numbers
        int[] negativeGrades = {-10, -5, -20, -3};
        assertEquals(-3, grade.gradesMax(negativeGrades)); // Expecting the maximum value -3

        // Testing with a single-element array
        int[] singleElement = {50};
        assertEquals(50, grade.gradesMax(singleElement)); // Expecting 50 as the max value
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
		// Creating an instance of Grades
		Grades grade = new Grades();
		
		// Testing the average calculation
        int[] grades = {50, 60, 70, 80};
        assertEquals(65.0, grade.gradesAverage(grades), 0.01);
    }

	@Test
	public void testCountFails() {
		// Creating an instance of Grades
		Grades grade = new Grades();
		
		// Testing failure count with a threshold of 40
        int[] grades = {10, 20, 50, 70};
        assertEquals(2, grade.countFails(grades, 40));// Expecting 2 failures (10, 20)
    }
	
	@Test
	void test() {
		fail("Not yet implemented");
	}

}
