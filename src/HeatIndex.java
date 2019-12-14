
public class HeatIndex implements Observer{

	public HeatIndex(Subject weatherData) {
		weatherData.subscribe(this);
	}
	@Override
	public void update(float temp, float humidity, float pressure) {
		System.out.println(" heat index " + temp*humidity/100);
		
	}

	
}
