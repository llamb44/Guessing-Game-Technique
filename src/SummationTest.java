import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.assertEquals;

public class SummationTest
{
	Summation sum= new Summation(5);
	
	@Test
	public void testSummation()
	{
		System.out.println("Checking if Summation.addition() is adding properly ");
        int expectedTotal = 15;
        assertEquals(expectedTotal, sum.addition());
	}
}