// this implements the interface of the observer 
public class forecastDisplay implements Observer{
	
	
	public forecastDisplay(Subject weatherData) {
		// subject class subscribe method is called and current observer class is added to subcriber 
		// class observers list
		weatherData.subscribe(this);
	}
	
// forecastDisplay overrides the update method and implements according to its requirment
	@Override
	public void update(float temp, float humidity, float pressure) {
		System.out.println("showing the forecast \n" + " \t temp : " + 
	temp + "\t humidity " + humidity + "\t pressure" + pressure);	
		 
	}

}
