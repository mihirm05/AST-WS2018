package ast.assignment1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class SensorTest {


	@Test
	void testCompareObjects() {
		SensorData rgbd1 = new SensorData("knife", 1, 0.99);
		SensorData rgb1 = new SensorData("knife", 1, 0.55);
		SensorData rgb2 = new SensorData("knife", 1, 0.99);
		Assert.assertEquals(rgbd1, rgbd1.comparePercentageSurety(rgb1));	
		Assert.assertEquals(rgb2, rgbd1.comparePercentageSurety(rgb2));
		
	}

}
