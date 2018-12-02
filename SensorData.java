package ast.assignment1;
public class SensorData{

	String itemType; 
	int itemLabel;
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
	
	public SensorData comparePercentageSurety(SensorData sensorData1) {		
		if (this.percentageSurety > sensorData1.percentageSurety) {
			return this;
		}
		
		else {
			return sensorData1;
		}
	}
}