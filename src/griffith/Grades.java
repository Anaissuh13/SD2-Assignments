package griffith;

import java.util.*;

public class Grades {
	// Returns the maximum grade from an array.
    public int gradesMax(int[] grades) {
    	if (grades.length == 0) return Integer.MIN_VALUE;
        return Arrays.stream(grades).max().getAsInt();
    }

    // Returns the sum of array.
    public int gradesTotal(int[] grades) {
    	return Arrays.stream(grades).sum();
    }

    // Returns the average of array.
    public double gradesAverage(int[] grades) {
    	if (grades.length == 0) return 0.0;
        return (double) gradesTotal(grades) / grades.length;
    }

    // Counts the number of grades below the minimum grade.
    public int countFails(int[] grades, int minGrade) {
    	return (int) Arrays.stream(grades).filter(g -> g < minGrade).count();
    }
}
