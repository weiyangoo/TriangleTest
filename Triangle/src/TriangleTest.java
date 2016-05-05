import static org.junit.Assert.*;

import org.junit.Test;

public class TriangleTest {

	@Test
	public void testJudge() {
		Triangle triangle=new Triangle();
		assertEquals(Triangle.SCALENE,triangle.judge(3,4,5));
		assertEquals(Triangle.ISOSCELES,triangle.judge(4,4,5));
		assertEquals(Triangle.EQUILATERAL,triangle.judge(4,4,4));
		assertEquals(Triangle.ISOSCELES,triangle.judge(4,3,4));
		assertEquals(Triangle.ISOSCELES,triangle.judge(3,4,4));
		
	}
}
