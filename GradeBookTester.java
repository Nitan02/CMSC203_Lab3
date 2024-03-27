import static org.junit.jupiter.api.Assertions.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

class GradeBookTester {
	public class GradebookTester {
	    private GradeBook gradeBook1;
	    private GradeBook gradeBook2;
	@Test
	public void testAddScore() {
        assertTrue(gradeBook1.toString().equals("85.0 90.0 "));
        assertTrue(gradeBook2.toString().equals("75.0 80.0 95.0 "));
        assertEquals(2, gradeBook1.getScoreSize());
        assertEquals(3, gradeBook2.getScoreSize());
    }

    @Test
    public void testSum() {
        assertEquals(175.0, gradeBook1.sum(), .0001);
        assertEquals(250.0, gradeBook2.sum(), .0001);
    }

    @Test
    public void testMinimum() {
        assertEquals(85.0, gradeBook1.minimum(), .0001);
        assertEquals(75.0, gradeBook2.minimum(), .0001);
    }

    @Test
    public void testFinalScore() {
        assertEquals(175.0, gradeBook1.finalScore(), .0001);
        assertEquals(175.0, gradeBook2.finalScore(), .0001);
    }
}
	}


