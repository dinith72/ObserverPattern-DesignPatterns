
public class DisplayStatistics implements Observer{

	
	
	public DisplayStatistics(Subject weatherData) {
		weatherData.subscribe(this);
	}
	@Override
	public void update(float temp, float humidity, float pressure) {
		// TODO Auto-generated method stub
		System.out.println("showing the statistics \n" + " \t temp : " + 
				temp + "\t humidity " + humidity + "\t pressure" + pressure);
		
	}
	
}
