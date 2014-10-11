import static org.junit.Assert.fail;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import fizzbuzz.PrimeUtils;


public class PrimeUtilsTest {
	
	private PrimeUtils pu;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		pu = new PrimeUtils();
	}

	@After
	public void tearDown() throws Exception {
	}

//	@Test
//	public void testMain() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testListPrimes() {
//		fail("Not yet implemented");
//	}

	@Test
	public void testIsPrime() {
		int num = 37;
		boolean result = pu.isPrime(num);
		//fail("Not yet implemented");
		assertEquals(true, result);
	}

}
