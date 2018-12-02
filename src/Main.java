package ast.objectListMerger;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		SensorData rgbd1 = new SensorData("knife", 1, 0.99);
		SensorData rgbd2 = new SensorData("scissor", 2, 0.65);
		SensorData rgbd3 = new SensorData("spoon", 3, 0.33);
		SensorData rgbd4 = new SensorData("spoon", 4, 0.80);
		SensorData rgbd5 = new SensorData("keys", 5, 0.95);
		
		ArrayList<SensorData> sensor1 = new ArrayList<SensorData>(20);
		sensor1.add(rgbd1);
		sensor1.add(rgbd2);
		sensor1.add(rgbd3);
		sensor1.add(rgbd4);
		sensor1.add(rgbd5);
//		System.out.println(sensor1);
		
		SensorData rgb1 = new SensorData("knife", 1, 0.55);
		SensorData rgb2 = new SensorData("scissors", 2, 0.95);
		SensorData rgb3 = new SensorData("fork", 3, 0.99);
		SensorData rgb4 = new SensorData("spoon", 4, 0.99);
		SensorData rgb5 = new SensorData("keys", 5, 0.95);
		
		ArrayList<SensorData> sensor2 = new ArrayList<SensorData>(20);
		sensor2.add(rgb1);
		sensor2.add(rgb2);
		sensor2.add(rgb3);
		sensor2.add(rgb4);
		sensor2.add(rgb5);
		
		ArrayList<SensorData> decision = new ArrayList<SensorData>(20);
		
		for(int i=0; i<sensor1.size();i++){
			decision.add(sensor1.get(i).comparePercentageSurety(sensor2.get(i)));
		}
		System.out.println(decision);
		SensorData laser1 = new SensorData("knife", 1, 0.50);
		SensorData laser2 = new SensorData("scissors", 2, 0.5);
		SensorData laser3 = new SensorData("spoon", 3, 0.90);
		SensorData laser4 = new SensorData("spoon", 4, 0.90);
		SensorData laser5 = new SensorData("keys", 5, 0.99);				
	}
}
	


