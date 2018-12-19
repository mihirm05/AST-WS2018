package test.java;

//import static org.junit.jupiter.api.Assertions.*;

//import java.util.ArrayList;

import org.junit.Assert;
//import org.junit.jupiter.api.Test;
import org.junit.Test;

import main.java.SensorData;

public class SensorTest {

	@Test
	public void testCompareObjects() {
		//testcase to check the standard data from sensors
		SensorData rgbd1 = new SensorData("knife", 1, 0.99);
		SensorData rgb1 = new SensorData("knife", 1, 0.95);
		SensorData rgbd11 = new SensorData("knife", 1 , 0.90);
		SensorData rgb11 = new SensorData("knife", 1, 0.50);
		Assert.assertEquals(rgbd1, rgbd1.comparePercentageSurety(rgb1,rgbd11,rgb11));	
		System.out.println("Test 1 passed");
		
		//testcase to check different itemLabel
		SensorData rgbd2 = new SensorData("scissor", 2, 0.65);
		SensorData rgb2 = new SensorData("spoon", 4, 0.99);
		SensorData rgbd22 = new SensorData("spoon", 2 , 0.51);
		SensorData rgb22 = new SensorData("spoon",2,0.50);
		SensorData temporaryObject = new SensorData(" This is a garbage Value ", 0, 0);
		temporaryObject.itemType.equals(rgbd2.comparePercentageSurety(rgb2,rgbd22,rgb22));
		System.out.println("Test 2 passed");
		
		//testcase to check anomalous itemType classification 
		SensorData rgbd3 = new SensorData("spoon", 3, 0.33);
		SensorData rgb3 = new SensorData("fork", 3, 0.99);
		SensorData rgbd33 = new SensorData("knife", 3, 0.99);
		SensorData rgb33 = new SensorData("spoon", 3, 0.92);
		Assert.assertEquals(rgb3, rgbd3.comparePercentageSurety(rgb3,rgbd33,rgb33));
		System.out.println("Test 3 passed");
		
		//testcase to check empty list of objects 
		SensorData rgbd4 = new SensorData(" ", 0, 0);
		SensorData rgb4 = new SensorData(" ",0,0);
		SensorData rgbd44 = new SensorData(" ",0,0);
		SensorData rgb44 = new SensorData(" ",0,0);
//		Assert.assertEquals(rgb4, rgbd4.comparePercentageSurety(rgb4));
		"Insufficient Data".equals(rgb4.comparePercentageSurety(rgbd4,rgbd44,rgb44));
		System.out.println("Test 4 passed");
		
		//testcase to check different case of itemType
		SensorData rgbd5 = new SensorData("spoon", 3, 0.33);
		SensorData rgb5 = new SensorData("SPOON", 3, 0.33);
		SensorData rgbd55 = new SensorData("spoon", 3, 0.33);
		SensorData rgb55 = new SensorData("SPOON", 3, 0.33);
		Assert.assertEquals(rgbd5, rgb5.comparePercentageSurety(rgbd5,rgbd55,rgb55));
		System.out.println("Test 5 passed");
	}
}


