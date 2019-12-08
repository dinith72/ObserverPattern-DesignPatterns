
public class forecastDisplay implements Observer{
	
	
	public forecastDisplay(Subject weatherData) {
		weatherData.subscribe(this);
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		System.out.println("showing the forecast \n" + " \t temp : " + 
	temp + "\t humidity " + humidity + "\t pressure" + pressure);
		
	System.out.print("Dinith");
		 
	}

	
	
	

}
