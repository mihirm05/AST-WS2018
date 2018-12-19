package main.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SensorData{

	public String itemType; 
	public int itemLabel;
	double percentageSurety;
	
	public SensorData(String objectType, int objectLabel, double percentageSurety) {
		this.itemType = objectType;
		this.itemLabel = objectLabel;
		this.percentageSurety = percentageSurety;
	}
	
	@Override
	public String toString() {
		return "(" +this.itemType+ "," +this.itemLabel+ "," +this.percentageSurety+ ")" ;
	}
	
	public SensorData comparePercentageSurety(SensorData sensorData1, SensorData sensorData2, SensorData sensorData3) {	
		
		List<Double> percentageSuretyList = new ArrayList<Double>();
		percentageSuretyList.add(sensorData1.percentageSurety);
		percentageSuretyList.add(sensorData2.percentageSurety);
		percentageSuretyList.add(sensorData3.percentageSurety);
		
		double maximumPercentageSurety = Collections.max(percentageSuretyList);
		
		
		SensorData temporaryObject = new SensorData(" This is a garbage Value ", 0, 0);
		if ((this.itemLabel == sensorData1.itemLabel) && (this.itemLabel == sensorData2.itemLabel) && (this.itemLabel == sensorData3.itemLabel)){
			if (this.percentageSurety > maximumPercentageSurety){
				temporaryObject = this;
			}
			else {
				temporaryObject = sensorData1;
			}
		}		
		
		else {
			System.out.println("Label not Matching"); 
		}
		return temporaryObject;
	}
}