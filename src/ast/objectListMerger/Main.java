package ast.objectListMerger;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		//sensor 1 algorithm 1
		SensorData rgbd1 = new SensorData("knife", 1, 0.99);
		SensorData rgbd2 = new SensorData("scissor", 2, 0.65);
		SensorData rgbd3 = new SensorData("spoon", 3, 0.33);
		SensorData rgbd4 = new SensorData("spoon", 4, 0.80);
		SensorData rgbd5 = new SensorData("keys", 5, 0.95);
		
		ArrayList<SensorData> sensor1Algorithm1 = new ArrayList<SensorData>(20);
		sensor1Algorithm1.add(rgbd1);
		sensor1Algorithm1.add(rgbd2);
		sensor1Algorithm1.add(rgbd3);
		sensor1Algorithm1.add(rgbd4);
		sensor1Algorithm1.add(rgbd5);
		
		//sensor 2 algorithm 1 
		SensorData rgb1 = new SensorData("knife", 1, 0.55);
		SensorData rgb2 = new SensorData("scissors", 2, 0.95);
		SensorData rgb3 = new SensorData("fork", 3, 0.99);
		SensorData rgb4 = new SensorData("spoon", 4, 0.99);
		SensorData rgb5 = new SensorData("keys", 5, 0.95);
		
		ArrayList<SensorData> sensor2Algorithm1 = new ArrayList<SensorData>(20);
		sensor2Algorithm1.add(rgb1);
		sensor2Algorithm1.add(rgb2);
		sensor2Algorithm1.add(rgb3);
		sensor2Algorithm1.add(rgb4);
		sensor2Algorithm1.add(rgb5);
		
		//sensor 1 algorithm 2
		SensorData rgbd12 = new SensorData("knife", 1, 0.89);
		SensorData rgbd22 = new SensorData("scissor", 2, 0.55);
		SensorData rgbd32 = new SensorData("spoon", 3, 0.63);
		SensorData rgbd42 = new SensorData("spoon", 4, 0.70);
		SensorData rgbd52 = new SensorData("keys", 5, 0.95);
		
		ArrayList<SensorData> sensor1Algorithm2 = new ArrayList<SensorData>(20);
		sensor1Algorithm2.add(rgbd1);
		sensor1Algorithm2.add(rgbd2);
		sensor1Algorithm2.add(rgbd3);
		sensor1Algorithm2.add(rgbd4);
		sensor1Algorithm2.add(rgbd5);
		
		//sensor 2 algorithm 2 
		SensorData rgb12 = new SensorData("knife", 1, 0.91);
		SensorData rgb22 = new SensorData("scissor", 2, 0.60);
		SensorData rgb32 = new SensorData("spoon", 3, 0.30);
		SensorData rgb42 = new SensorData("spoon", 4, 0.81);
		SensorData rgb52 = new SensorData("keys", 5, 0.96);
		
		ArrayList<SensorData> sensor2Algorithm2 = new ArrayList<SensorData>(20);
		sensor2Algorithm2.add(rgbd1);
		sensor2Algorithm2.add(rgbd2);
		sensor2Algorithm2.add(rgbd3);
		sensor2Algorithm2.add(rgbd4);
		sensor2Algorithm2.add(rgbd5);
		
		
		ArrayList<SensorData> decision = new ArrayList<SensorData>(20);
		
		
		if ((sensor1Algorithm2.size() == sensor2Algorithm2.size()) && rgb1.itemType != " "){
			for(int i=0; i<sensor1Algorithm2.size();i++){
				decision.add(sensor1Algorithm2.get(i).comparePercentageSurety(sensor2Algorithm2.get(i),sensor1Algorithm1.get(i),sensor2Algorithm1.get(i)));
			}
		}
		
		else {
			System.out.println("Insufficient Data");
			}
		System.out.println(decision);
	}
}



	


